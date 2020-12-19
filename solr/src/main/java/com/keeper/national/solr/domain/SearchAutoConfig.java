package com.keeper.national.solr.domain;

import org.apache.solr.client.solrj.SolrClient;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.solr.core.SolrTemplate;
/**
 * @ClassName SearchAutoConfig
 * @Descriptino TODO
 * @Author myzhen
 * @Date 2020/8/4 上午11:40
 * @Version 1.0
 **/
@Configuration
public class SearchAutoConfig {

    @Bean
    @ConditionalOnMissingBean(SolrTemplate.class)
    public SolrTemplate solrTemplate(SolrClient solrClient) {
        return new SolrTemplate(solrClient);
    }
}
