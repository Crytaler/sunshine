package com.keeper.national.admin.web;

import cn.hutool.core.lang.Dict;
import cn.hutool.core.util.StrUtil;
import com.keeper.national.admin.domain.User;
import com.keeper.national.admin.service.UserMapperService;
import com.keeper.national.admin.util.RedisUtil;
import com.keeper.national.common.constant.Status;
import com.keeper.national.common.exception.JsonException;
import com.keeper.national.common.util.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * @ClassName testController
 * @Descriptino TODO
 * @Author myzhen
 * @Date 2020/5/2 下午3:51
 * @Version 1.0
 **/
@RestController
@Api(tags = "测试用户")
public class testController {

    @Autowired
    private UserMapperService userMapperService;
    @Autowired
    private RedisUtil redisUtil;

    @GetMapping("/user")
    @ApiOperation(value = "用户参数")
    public ResponseResult getUser(){
        redisUtil.set("用户",userMapperService.list().toString());
        return ResponseResult.success(userMapperService.list());
    }
    @PostMapping("/insert")
    @ApiOperation(value = "用户参数")
    public ResponseResult saveUser(@RequestBody User user){
        boolean save = userMapperService.save(user);
        return ResponseResult.success(save);
    }
    /**
     * 测试方法
     *
     * @param who 测试参数
     * @return {@link Dict}
     */
    @GetMapping("/test")
    @ApiOperation(value = "用户参数")
    public Dict test(String who) {
        return Dict.create().set("who", StrUtil.isBlank(who) ? "me" : who);
    }


    @GetMapping("/json")
    public ResponseResult jsonException() {
        throw new JsonException(Status.UNKNOWN_ERROR);
    }
}
