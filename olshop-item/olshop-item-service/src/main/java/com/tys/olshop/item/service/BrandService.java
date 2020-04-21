package com.tys.olshop.item.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.tys.olshop.common.core.PageResult;
import com.tys.olshop.item.api.pojo.Brand;
import com.tys.olshop.item.mapper.BrandMapper;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author TYS
 * @date 2020/4/18 14:01
 */
@Service
public class BrandService {
    @Autowired
    private BrandMapper brandMapper;

    public PageResult<Brand> queryBrandByPageAndSort(Integer page, Integer rows, String sortBy, Boolean desc, String key) {
        PageHelper.startPage(page, rows);
        Example example = new Example(Brand.class);
        if (StringUtils.isNotBlank(key)) {
            example.createCriteria().andLike("name", "%" + key + "%")
                    .orEqualTo("letter", key);
        }
        if (StringUtils.isNotBlank(sortBy)) {
            String orderByClause = sortBy + (desc ? " DESC" : " ASC");
            example.setOrderByClause(orderByClause);
        }
        Page<Brand> pageInfo = (Page<Brand>) brandMapper.selectByExample(example);
        return new PageResult<>(pageInfo.getTotal(), pageInfo);
    }

    @Transactional
    public void saveBrand(Brand brand, List<Long> categoryIds) {
        brandMapper.insert(brand);
        Long brandId = brand.getId();
        for (Long categoryId : categoryIds) {
            brandMapper.insertCategoryBrand(categoryId, brandId);
        }
    }

    public void deleteBrandById(Long brandId) {
        brandMapper.deleteByPrimaryKey(brandId);
    }

    public List<Brand> queryBrandsByCategoryId(Long categoryId) {
        return brandMapper.queryBrandsByCategoryId(categoryId);
    }
}
