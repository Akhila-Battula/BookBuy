package com.project.bookbuy;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/media/**")
                .addResourceLocations("file:/C:/Users/akhil/OneDrive/Documents/Secure E Commerce/Project/code/bookbuy/bookbuy/src/main/resources/static/media/");
    }
}
