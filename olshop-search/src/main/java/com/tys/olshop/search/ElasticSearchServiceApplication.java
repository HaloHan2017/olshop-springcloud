package com.tys.olshop.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author TYS
 * @date 2020/4/21 22:22
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ElasticSearchServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ElasticSearchServiceApplication.class, args);
    }
}
