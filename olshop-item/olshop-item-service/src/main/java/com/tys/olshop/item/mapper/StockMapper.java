package com.tys.olshop.item.mapper;

import com.tys.olshop.item.api.pojo.Stock;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.additional.idlist.SelectByIdListMapper;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author TYS
 * @date 2020/4/20 21:39
 */
@Repository
public interface StockMapper extends Mapper<Stock>, SelectByIdListMapper<Stock, Long> {
}
