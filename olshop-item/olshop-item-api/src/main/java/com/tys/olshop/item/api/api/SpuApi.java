package com.tys.olshop.item.api.api;

import com.tys.olshop.common.core.PageResult;
import com.tys.olshop.item.api.bo.SpuBo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author TYS
 * @date 2020/4/21 22:27
 */
@RequestMapping("spu")
public interface SpuApi {
    @GetMapping("page")
    ResponseEntity<PageResult<SpuBo>> querySpuByPage(
            @RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "rows", defaultValue = "5") Integer rows,
            @RequestParam(value = "desc", defaultValue = "false") Boolean desc,
            @RequestParam(value = "saleable", defaultValue = "true") Boolean saleable);
}
