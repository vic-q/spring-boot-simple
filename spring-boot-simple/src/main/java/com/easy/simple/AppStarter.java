package com.easy.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author wangqing
 */
@SpringBootApplication
public class AppStarter extends WebMvcConfigurerAdapter {

    public static void main(String[] args) {
        SpringApplication.run(AppStarter.class, args);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static");
        super.addResourceHandlers(registry);
    }
}
