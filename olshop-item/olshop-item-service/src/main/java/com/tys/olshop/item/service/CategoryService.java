package com.tys.olshop.item.service;

import com.tys.olshop.item.api.pojo.Category;
import com.tys.olshop.item.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    public List<Category> queryCategoriesByParentId(Long parentId) {
        Category category = new Category();
        category.setParentId(parentId);
        return categoryMapper.select(category);
    }

    public List<Category> queryCategoriesByBrandId(Long brandId) {
        return categoryMapper.queryCategoriesByBrandId(brandId);
    }

    public List<String> queryNameByIds(List<Long> ids) {
        return categoryMapper.selectByIdList(ids).stream().map(Category::getName).collect(Collectors.toList());
    }
}
