package com.darsh.Userservice.configure;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    public ObjectMapper objectMapperInit() {
        return new ObjectMapper();
    }

}