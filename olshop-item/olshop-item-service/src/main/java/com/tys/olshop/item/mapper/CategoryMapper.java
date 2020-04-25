package com.tys.olshop.item.mapper;

import com.tys.olshop.item.api.pojo.Category;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.additional.idlist.SelectByIdListMapper;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author TYS
 * @date 2020/4/18 13:52
 */
@Repository
public interface CategoryMapper extends Mapper<Category>, SelectByIdListMapper<Category, Long> {
    @Select("SELECT * FROM tb_category WHERE id IN (SELECT category_id FROM tb_category_brand WHERE brand_id = #{brandId})")
    List<Category> queryCategoriesByBrandId(Long brandId);
}
