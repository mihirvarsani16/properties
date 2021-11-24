package com.Properties.Properties.config;

import com.Properties.Properties.entity.MyProperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Myconfig {
    @Bean("one")
    @ConfigurationProperties("my-properties")
    public MyProperties myProperties() {
        return new MyProperties();
    }

    @Bean("two")
    @ConfigurationProperties("some-properties")
    public MyProperties someProperties() {
        return new MyProperties();
    }

}
