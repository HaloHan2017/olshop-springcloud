package com.tys.olshop.item.mapper;

import com.tys.olshop.item.api.pojo.Category;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface CategoryMapper extends Mapper<Category> {
}
