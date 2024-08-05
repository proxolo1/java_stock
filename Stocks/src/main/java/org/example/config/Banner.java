package org.example.config;


import org.slf4j.Logger;

public class Banner {
    public static String banner = """
            ┓ ┏            ┳┓  ┏┏  \s
            ┃┃┃┏┓┏┓┏┓┏┓┏┓  ┣┫┓┏╋╋┏┓╋
            ┗┻┛┗┻┛ ┛ ┗ ┛┗  ┻┛┗┻┛┛┗ ┗
                                   \s
            """;

    public static void getBanner(Logger logger) {
        logger.info(banner);
    }
}