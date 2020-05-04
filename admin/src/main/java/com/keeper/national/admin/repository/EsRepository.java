package com.keeper.national.admin.repository;

import com.keeper.national.admin.domain.Item;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * @ClassName EsRepository
 * @Descriptino es
 * @Author myzhen
 * @Date 2020/5/4 下午3:06
 * @Version 1.0
 **/
public interface EsRepository extends ElasticsearchRepository<Item, Long> {

    /**
     * 根据价格区间查询
     *
     * @param price1
     * @param price2
     * @return
     */
    List<Item> findByPriceBetween(double price1, double price2);

}
