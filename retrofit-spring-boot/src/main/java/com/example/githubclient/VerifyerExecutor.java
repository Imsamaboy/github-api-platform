package com.example.githubclient;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class VerifyerExecutor {
    @Scheduled(cron = "*/5 * * ? * *")
    public void verify() {
        System.out.println("Влад Котов, где ТЗ, ты же обещал");
    }
}