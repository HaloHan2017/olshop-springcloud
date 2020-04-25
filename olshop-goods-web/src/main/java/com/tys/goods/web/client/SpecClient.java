package com.tys.goods.web.client;

import com.tys.olshop.item.api.api.SpecApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author TYS
 * @date 2020/4/25 19:01
 * Feature:spec FeignClient
 */
@FeignClient(value = "item-service")
public interface SpecClient extends SpecApi {
}
