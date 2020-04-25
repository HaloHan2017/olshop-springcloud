package com.tys.goods.web.client;

import com.tys.olshop.item.api.api.CategoryApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author TYS
 * @date 2020/4/25 19:01
 * Feature:商品分类FeignClient
 */
@FeignClient(value = "item-service")
public interface CategoryClient extends CategoryApi {
}
