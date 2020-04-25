package com.tys.olshop.search.repository;

import com.tys.olshop.search.pojo.Goods;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @author TYS
 * @date 2020/4/21 22:42
 */
@Repository
public interface GoodsRepository extends ElasticsearchRepository<Goods, Long> {
}
