package com.tys.olshop.item.mapper;

import com.tys.olshop.item.api.pojo.Brand;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author TYS
 * @date 2020/4/18 13:52
 */
@Repository
public interface BrandMapper extends Mapper<Brand> {
    @Insert("INSERT INTO tb_category_brand (category_id, brand_id) VALUES (#{categoryId},#{brandId})")
    void insertCategoryBrand(@Param("categoryId") Long categoryId, @Param("brandId") Long brandId);

    @Select("SELECT b.* FROM tb_brand b LEFT JOIN tb_category_brand cb ON b.id = cb.brand_id WHERE cb.category_id = #{categoryId}")
    List<Brand> queryBrandsByCategoryId(Long categoryId);
}
