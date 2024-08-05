package org.example.service;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public interface HttpClientService {
    HttpResponse<String> sendRequest(HttpRequest request) throws  Exception;
}
