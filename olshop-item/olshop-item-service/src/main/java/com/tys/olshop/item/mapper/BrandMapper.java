package com.tys.olshop.item.mapper;

import com.tys.olshop.item.api.pojo.Brand;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author TYS
 * @date 2020/4/18 13:52
 */
public interface BrandMapper extends Mapper<Brand> {
    @Insert("INSERT INTO tb_category_brand (category_id, brand_id) VALUES (#{categoryId},#{brandId})")
    void insertCategoryBrand(@Param("categoryId") Long categoryId, @Param("brandId") Long brandId);
}
