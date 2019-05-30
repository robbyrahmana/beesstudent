package com.elephants.beesstudent.base.interceptor;

import java.util.Date;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.elephants.beesstudent.base.Base;

public class BaseRestInterceptor extends HandlerInterceptorAdapter
{    
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        
        long startTime = System.currentTimeMillis();
        String requestId = UUID.randomUUID().toString();
        
        Base.LOGGER.info("=================================================================================");
        Base.LOGGER.info("URI         : {}", request.getRequestURL());
        Base.LOGGER.info("Method      : {}", request.getMethod());
        Base.LOGGER.info("Request ID  : {}", requestId);
        Base.LOGGER.info("Start time  : {}", new Date(startTime));
        Base.LOGGER.info("=================================================================================");
        
        request.setAttribute("startTime", startTime);
        request.setAttribute("requestId", requestId);
        
        return true;
    }
    
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
            @Nullable Exception ex) throws Exception {
        
        long startTime = (Long) request.getAttribute("startTime");
        long endTime = System.currentTimeMillis();
        
        String requestId = (String) request.getAttribute("requestId");
        
        Base.LOGGER.info("=================================================================================");
        Base.LOGGER.info("URI         : {}", request.getRequestURL());
        Base.LOGGER.info("Method      : {}", request.getMethod());
        Base.LOGGER.info("Request ID  : {}", requestId);
        Base.LOGGER.info("End time    : {}", new Date(endTime));
        Base.LOGGER.info("Duration    : {}ms", (endTime - startTime));
        Base.LOGGER.info("Response    : {}", response.getStatus());
        Base.LOGGER.info("=================================================================================");
    }
}
