package org.example.service;


import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;

public class HttpClientServiceImpl implements HttpClientService {
        private final HttpClient client;

        public HttpClientServiceImpl() throws NoSuchAlgorithmException, KeyManagementException {
            this.client = HttpClient.newBuilder()
                    .sslContext(createUnsecureSSLContext())
                    .build();
        }

        @Override
        public HttpResponse<String> sendRequest(HttpRequest request) throws Exception {
            return client.send(request, HttpResponse.BodyHandlers.ofString());
        }

        private SSLContext createUnsecureSSLContext() throws NoSuchAlgorithmException, KeyManagementException {
            TrustManager[] trustAllCerts = new TrustManager[]{
                    new X509TrustManager() {
                        public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                            return null;
                        }

                        public void checkClientTrusted(X509Certificate[] certs, String authType) {}

                        public void checkServerTrusted(X509Certificate[] certs, String authType) {}
                    }
            };

            SSLContext sslContext = SSLContext.getInstance("TLS");
            sslContext.init(null, trustAllCerts, new java.security.SecureRandom());
            return sslContext;
        }
    }


