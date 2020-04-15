package com.tys.olshop.item.service;

import com.tys.olshop.item.api.pojo.Category;
import com.tys.olshop.item.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    public List<Category> queryListByParent(Long parentId) {
        Category category = new Category();
        category.setParentId(parentId);
        return this.categoryMapper.select(category);
    }
}
