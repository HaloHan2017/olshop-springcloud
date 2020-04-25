package com.tys.olshop.search.listener;

import com.tys.olshop.search.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author TYS
 * @date 2020/4/21 22:51
 */
@Component
public class GoodsListener {

    @Autowired
    private SearchService searchService;

//    /**
//     * 处理insert和update的消息
//     */
//    @RabbitListener(bindings = @QueueBinding(
//            value = @Queue(value = "leyou.create.index.queue",durable = "true"), //队列持久化
//            exchange = @Exchange(
//                    value = "leyou.item.exchange",
//                    ignoreDeclarationExceptions = "true",
//                    type = ExchangeTypes.TOPIC
//            ),
//            key = {"item.insert","item.update"}
//    ))
//    public void listenCreate(Long id) throws Exception{
//        if (id == null){
//            return;
//        }
//        //创建或更新索引
//        this.searchService.createIndex(id);
//    }
//
//    @RabbitListener(bindings = @QueueBinding(
//            value = @Queue(value = "leyou.delete.index.queue",durable = "true"), //队列持久化
//            exchange = @Exchange(
//                    value = "leyou.item.exchange",
//                    ignoreDeclarationExceptions = "true",
//                    type = ExchangeTypes.TOPIC
//            ),
//            key = {"item.delete"}
//    ))
//    public void listenDelete(Long id){
//        if (id == null){
//            return;
//        }
//
//        //删除索引
//        this.searchService.deleteIndex(id);
//    }
}
