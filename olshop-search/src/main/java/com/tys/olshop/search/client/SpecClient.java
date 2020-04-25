package com.tys.olshop.search.client;

import com.tys.olshop.item.api.api.SpecApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author TYS
 * @date 2020/4/21 22:29
 */
@FeignClient(value = "item-service")
public interface SpecClient extends SpecApi {
}
