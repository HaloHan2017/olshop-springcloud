package com.tys.olshop.search.controller;

import com.tys.olshop.common.core.PageResult;
import com.tys.olshop.search.bo.SearchRequest;
import com.tys.olshop.search.pojo.Goods;
import com.tys.olshop.search.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

/**
 * @author TYS
 * @date 2020/4/23 21:45
 */
@CrossOrigin
@RestController
@RequestMapping
public class SearchController {
    @Autowired
    private SearchService searchService;

    @PostMapping("page")
    public ResponseEntity<PageResult<Goods>> search(@RequestBody SearchRequest request) {
        PageResult<Goods> result = searchService.search(request);
        if (Objects.isNull(result)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(result);
    }
}
