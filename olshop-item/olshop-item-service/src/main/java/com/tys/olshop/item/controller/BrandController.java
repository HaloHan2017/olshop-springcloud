package com.tys.olshop.item.controller;

import com.tys.olshop.common.core.PageResult;
import com.tys.olshop.common.exception.ServiceException;
import com.tys.olshop.item.api.pojo.Brand;
import com.tys.olshop.item.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author TYS
 * @date 2020/4/18 14:00
 */
@CrossOrigin
@RestController
@RequestMapping("brand")
public class BrandController {
    @Autowired
    private BrandService brandService;

    @GetMapping("page")
    public ResponseEntity<PageResult<Brand>> queryBrandByPage(
            @RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "rows", defaultValue = "5") Integer rows,
            @RequestParam(value = "sortBy", required = false) String sortBy,
            @RequestParam(value = "desc", defaultValue = "false") Boolean desc,
            @RequestParam(value = "key", required = false) String key) {
        PageResult<Brand> result = brandService.queryBrandByPageAndSort(page, rows, sortBy, desc, key);
        if (Objects.isNull(result) || CollectionUtils.isEmpty(result.getItems())) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(result);
    }

    @PostMapping
    public ResponseEntity<Void> saveBrand(Brand brand, @RequestParam("categories") String categoryIdsString) {
        brandService.saveBrand(brand, parseLongFromString(categoryIdsString));
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteBrand(@RequestParam("id") Long brandId) {
        brandService.deleteBrandById(brandId);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    private List<Long> parseLongFromString(String categoryIdsString) {
        List<Long> categoryIds = new ArrayList<>();
        if (StringUtils.isEmpty(categoryIdsString)) {
            throw new ServiceException("商品类别不能为空");
        }
        if (categoryIdsString.contains(",")) {
            String[] longStrArr = categoryIdsString.split(",");
            for (String longStr : longStrArr) {
                categoryIds.add(Long.parseLong(longStr));
            }
        } else {
            categoryIds.add(Long.parseLong(categoryIdsString));
        }
        return categoryIds;
    }
}
