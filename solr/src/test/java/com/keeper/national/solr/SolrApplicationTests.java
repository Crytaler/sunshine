package com.keeper.national.solr;

import com.keeper.national.solr.domain.SolrProductDO;
import org.apache.solr.client.solrj.response.UpdateResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SolrApplication.class)
public class SolrApplicationTests {

    @Autowired
    private SolrTemplate solrTemplate;

    @Test // 插入一条记录
    public void testInsert() {
        SolrProductDO ans = solrTemplate.getById("test", 2, SolrProductDO.class).get();
        System.out.println(ans);
    }

    @Test // 插入一条记录
    public void save() {
        SolrProductDO docDO = new SolrProductDO();
        docDO.setId(4);
        docDO.setTitle("addByBean");
        docDO.setContent("新增一个测试文档");
        docDO.setType("1");

        UpdateResponse response = solrTemplate.saveBean("test", docDO);
        solrTemplate.commit("test");
        System.out.println(response);
    }

    @Test
    public void get() {
        SolrProductDO ans = solrTemplate.getById("test", 4, SolrProductDO.class).get();
        System.out.println("queryById: " + ans);

        Collection<SolrProductDO> list = solrTemplate.getByIds("test", Arrays.asList(1, 2), SolrProductDO.class);
        System.out.println("queryByIds: " + list);
    }
}
