package com.tys.olshop.search.client;

import com.tys.olshop.search.ElasticSearchServiceApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

/**
 * @author TYS
 * @date 2020/4/22 21:30
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ElasticSearchServiceApplication.class)
public class CategoryClientTest {
    @Autowired
    private CategoryClient categoryClient;

    @Test
    public void testQueryCategories() {
        ResponseEntity<List<String>> names = categoryClient.queryNameByIds(Arrays.asList(1L, 2L, 3L));
        names.getBody().forEach(System.out::println);
    }
}