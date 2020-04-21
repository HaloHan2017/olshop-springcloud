package com.tys.olshop.item.api.bo;

import com.tys.olshop.item.api.pojo.Sku;
import com.tys.olshop.item.api.pojo.Spu;
import com.tys.olshop.item.api.pojo.SpuDetail;
import lombok.Data;

import javax.persistence.Transient;
import java.util.List;

/**
 * @author TYS
 * @date 2020/4/19 22:38
 */
@Data
public class SpuBo extends Spu {
    @Transient
    String categoryName;// 商品分类名称
    @Transient
    String brandName;// 品牌名称
    @Transient
    SpuDetail spuDetail;// 商品详情
    @Transient
    List<Sku> skuList;// sku列表
}
