package com.tys.olshop.item.controller;

import com.tys.olshop.item.api.pojo.Specification;
import com.tys.olshop.item.service.SpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

/**
 * @author TYS
 * @date 2020/4/19 22:06
 */
@CrossOrigin
@RestController
@RequestMapping("spec")
public class SpecificationController {
    @Autowired
    private SpecificationService specificationService;

    @GetMapping("{id}")
    public ResponseEntity<String> querySpecificationByCategoryId(@PathVariable("id") Long categoryId) {
        Specification specification = specificationService.querySpecificationByCategoryId(categoryId);
        if (Objects.isNull(specification)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(specification.getSpecifications());
    }
}
