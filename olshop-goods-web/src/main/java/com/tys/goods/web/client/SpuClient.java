package com.tys.goods.web.client;

import com.tys.olshop.item.api.api.SpuApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author TYS
 * @date 2020/4/25 19:02
 * Feature:
 */
@FeignClient(value = "item-service")
public interface SpuClient extends SpuApi {
}
