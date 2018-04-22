package com.github;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;

/**
 * Created by jianghang on 2018/4/18.
 */
@SpringBootApplication
@EnableCaching(proxyTargetClass = true)
@ServletComponentScan
@MapperScan("com.github.mapper")
public class ApplicationStartup extends SpringBootServletInitializer{

    private static Logger logger = LoggerFactory.getLogger(ApplicationStartup.class);

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ApplicationStartup.class);
    }

    public static void main(String[] args){
        ApplicationContext applicationContext = SpringApplication.run(ApplicationStartup.class,args);
        String[] activeProfiles = applicationContext.getEnvironment().getActiveProfiles();
        for(String profile : activeProfiles){
            logger.info("Srping Boot profile:{}",profile);
        }
    }
}
