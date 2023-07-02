package com.fastcampus.springrunner.divelog.config;

import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
//@EnableConfigurationProperties(MyServiceProperties.class)
@ConfigurationPropertiesScan
public class AppConfiguration {
}
