package com.tys.olshop.item.api.api;

import com.tys.olshop.item.api.pojo.Brand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author TYS
 * @date 2020/4/21 22:27
 */
@RequestMapping("brand")
public interface BrandApi {
    @GetMapping("list")
    List<Brand> queryBrandByIds(@RequestParam("ids") List<Long> ids);
}
