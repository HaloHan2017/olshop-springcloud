package com.tys.olshop.item.service;

import com.tys.olshop.item.api.pojo.Specification;
import com.tys.olshop.item.mapper.SpecificationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author TYS
 * @date 2020/4/19 22:06
 */
@Service
public class SpecificationService {
    @Autowired
    private SpecificationMapper specificationMapper;

    public Specification querySpecificationByCategoryId(Long categoryId) {
        return specificationMapper.selectByPrimaryKey(categoryId);
    }
}
