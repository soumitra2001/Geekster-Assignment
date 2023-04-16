package com.geekster.SpringAnnotation.MailSender;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HandleMailConfiguration {
    @Bean
    public HandleMail createHandleMail(){
        return new HandleMail();
    }
}
