package com.tys.goods.web.client;

/**
 * @author TYS
 * @date 2020/4/25 20:36
 * Feature:品牌FeignClient
 */

import com.tys.olshop.item.api.api.BrandApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "item-service")
public interface BrandClient extends BrandApi {
}
