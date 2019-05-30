package com.elephants.beesstudent.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.elephants.beesstudent.base.interceptor.BaseRestInterceptor;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer
{
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new BaseRestInterceptor());
    }

    @Override
    public void addCorsMappings(CorsRegistry registry)
    {
        registry.addMapping("/api/**").allowedOrigins("http://localhost:4200", "http://localhost:8080");
    }
}
