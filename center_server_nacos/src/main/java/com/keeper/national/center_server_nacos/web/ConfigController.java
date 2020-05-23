package com.keeper.national.center_server_nacos.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ConfigController
 * @Descriptino TODO
 * @Author myzhen
 * @Date 2020/5/23 下午7:10
 * @Version 1.0
 **/

@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigController {

    @Value("${test.name}")
    private String useLocalCache;

    @RequestMapping("/get")
    public String get() {
        return useLocalCache;
    }
}
