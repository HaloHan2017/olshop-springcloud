package com.tys.olshop.gateway.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author TYS
 * @date 2020/4/17 22:54
 */
@ConfigurationProperties(prefix = "my")
@Component
public class AllowOriginsConfig {
    private List<String> allowOrigins = new ArrayList<>();

    public List<String> getAllowOrigins() {
        return this.allowOrigins;
    }
}
