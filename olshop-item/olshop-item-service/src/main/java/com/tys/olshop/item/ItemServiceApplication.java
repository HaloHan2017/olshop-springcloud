package com.tys.olshop.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
//@EnableDiscoveryClient
@MapperScan("com.tys.olshop.item.mapper")
public class ItemServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ItemServiceApplication.class, args);
    }
}
