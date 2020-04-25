package com.tys.olshop.search;

import com.tys.olshop.search.pojo.Goods;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author TYS
 * @date 2020/4/22 20:11
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ElasticsearchTests.class)
public class ElasticsearchTests {

//    @Autowired
//    private GoodsRepository goodsRepository;

//    @Autowired
//    private GoodsClient goodsClient;
//
//    @Autowired
//    private SearchService searchService;

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    @Test
    public void createIndex() {
//        System.out.println(elasticsearchTemplate);
        // 创建索引
        elasticsearchTemplate.createIndex(Goods.class);
        // 配置映射
        elasticsearchTemplate.putMapping(Goods.class);
    }

//    @Test
//    public void loadData(){
//        // 创建索引
//        elasticsearchTemplate.createIndex(Goods.class);
//        // 配置映射
//        elasticsearchTemplate.putMapping(Goods.class);
//        int page = 1;
//        int rows = 100;
//        int size = 0;
//        do {
//            // 查询分页数据
//            PageResult<SpuBo> result = goodsClient.querySpuByPage(page, rows, true, null);
//            List<SpuBo> spus = result.getItems();
//            size = spus.size();
//            // 创建Goods集合
//            List<Goods> goodsList = new ArrayList<>();
//            // 遍历spu
//            for (SpuBo spu : spus) {
//                try {
//                    Goods goods = searchService.buildGoods(spu);
//                    goodsList.add(goods);
//                } catch (Exception e) {
//                    break;
//                }
//            }
//
//            goodsRepository.saveAll(goodsList);
//            page++;
//        } while (size == 100);
//    }
}
