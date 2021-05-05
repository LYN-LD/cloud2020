package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author LengYouNuan
 * @create 2021-02-27 下午9:53
 */
@SpringBootApplication
@EnableEurekaClient
public class SpringBootApplicationOrder {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationOrder.class,args);
    }
}
