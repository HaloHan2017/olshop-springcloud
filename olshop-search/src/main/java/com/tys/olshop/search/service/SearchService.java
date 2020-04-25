package com.tys.olshop.search.service;

import com.tys.olshop.item.api.pojo.Spu;
import com.tys.olshop.search.bo.SearchRequest;
import com.tys.olshop.search.pojo.Goods;
import com.tys.olshop.search.vo.SearchResult;

import java.io.IOException;

/**
 * @author TYS
 * @date 2020/4/23 21:45
 */
public interface SearchService {

    Goods buildGoods(Spu spu) throws IOException;

    SearchResult<Goods> search(SearchRequest searchRequest);

    void createIndex(Long id) throws IOException;

    void deleteIndex(Long id);
}
