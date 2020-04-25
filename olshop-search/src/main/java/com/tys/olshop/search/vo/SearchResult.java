package com.tys.olshop.search.vo;


import com.tys.olshop.common.core.PageResult;
import com.tys.olshop.item.api.pojo.Brand;
import com.tys.olshop.item.api.pojo.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Map;

/**
 * @Author: 98050
 * Time: 2018-10-12 21:06
 * Feature: 搜索结果存储对象
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SearchResult<Goods> extends PageResult<Goods> {
    private List<Category> categories;
    private List<Brand> brands;
    private List<Map<String, Object>> specs;

    public SearchResult(Long total, List<Goods> item, List<Category> categories, List<Brand> brands, List<Map<String, Object>> specs) {
        super(total, item);
        this.categories = categories;
        this.brands = brands;
        this.specs = specs;
    }

    public SearchResult(Long total, Long totalPage, List<Goods> item, List<Category> categories, List<Brand> brands) {
        super(total, totalPage, item);
        this.categories = categories;
        this.brands = brands;
    }

    public SearchResult(Long total, Long totalPage, List<Goods> item, List<Category> categories,
                        List<Brand> brands, List<Map<String, Object>> specs) {
        super(total, totalPage, item);
        this.categories = categories;
        this.brands = brands;
        this.specs = specs;
    }
}
