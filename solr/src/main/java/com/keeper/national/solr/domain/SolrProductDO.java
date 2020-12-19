package com.keeper.national.solr.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

/**
 * @ClassName SolrProductDO
 * @Descriptino TODO
 * @Author myzhen
 * @Date 2020/8/4 上午11:04
 * @Version 1.0
 **/
@Data
@SolrDocument(collection = "test")
public class SolrProductDO {

    private Integer id;
    private String title;
    private String content;
    private String type;
    private Long create_at;
    private Long publish_at;
}
