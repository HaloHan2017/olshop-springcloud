package com.tys.olshop.item.mapper;

import com.tys.olshop.item.api.pojo.Sku;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author TYS
 * @date 2020/4/18 13:52
 */
@Repository
public interface SkuMapper extends Mapper<Sku> {
    @Select("SELECT a.*,b.stock FROM tb_sku a,tb_stock b WHERE a.id=b.sku_id AND a.spu_id=#{spuId}")
    List<Sku> querySkuListById(Long spuId);
}
