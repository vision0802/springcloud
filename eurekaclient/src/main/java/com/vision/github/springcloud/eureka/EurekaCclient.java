package com.vision.github.springcloud.eureka;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/** @author ganminghui */

@SpringBootApplication @EnableEurekaClient
public class EurekaCclient {
    public static void main(String[] args) { SpringApplication.run(EurekaCclient.class,args); }
}