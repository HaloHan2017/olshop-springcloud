package com.tys.olshop.item.mapper;

import com.tys.olshop.item.api.pojo.Category;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface CategoryMapper extends Mapper<Category> {
    @Select("SELECT * FROM tb_category WHERE id IN (SELECT category_id FROM tb_category_brand WHERE brand_id = #{brandId})")
    List<Category> queryCategoriesByBrandId(Long brandId);
}
