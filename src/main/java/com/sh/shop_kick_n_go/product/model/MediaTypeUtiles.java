package com.sh.shop_kick_n_go.product.model;

import org.springframework.http.MediaType;

import jakarta.servlet.ServletContext;

public class MediaTypeUtiles {

    public static MediaType getMediaTypeForFileName(ServletContext servletContext, String filename) {

        String minType = servletContext.getMimeType(filename);

        try {
            MediaType mediaType = MediaType.parseMediaType(minType);
            return mediaType;
        } catch (Exception e) {
            return MediaType.APPLICATION_OCTET_STREAM;
        }


    }
}