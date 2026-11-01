package com.example.springboot_3_filters;

import java.io.IOException;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.util.ContentCachingResponseWrapper;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
@Order(1)
public class LoggingFilter implements Filter{

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        long startTime = System.currentTimeMillis();

        HttpServletRequest httpRequest = (HttpServletRequest) request;
        ContentCachingResponseWrapper responseWrapper = new ContentCachingResponseWrapper((HttpServletResponse) response);

        chain.doFilter(request, responseWrapper);

        long duration = System.currentTimeMillis() - startTime;
        String requestId = (String) httpRequest.getAttribute("requestId");

        String originalBody = new String(responseWrapper.getContentAsByteArray());
        String modifiedBody = originalBody.substring(0, originalBody.lastIndexOf("}"))
                + ",\"requestId\":\"" + requestId + "\""
                + ",\"requestTime\":\"" + duration + "ms\""
                + "}";

        responseWrapper.resetBuffer();
        responseWrapper.getWriter().write(modifiedBody);
        responseWrapper.copyBodyToResponse();
    }

    
    
}
