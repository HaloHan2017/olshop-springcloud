package com.tys.goods.web.service;

import java.util.Map;

/**
 * @author TYS
 * @date 2020/4/25 19:27
 * Feature:商品详情页后台
 */
public interface GoodsService {
    Map<String, Object> loadModel(Long spuId);
}
