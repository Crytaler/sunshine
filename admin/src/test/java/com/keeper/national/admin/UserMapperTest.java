package com.keeper.national.admin;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.keeper.national.admin.domain.User;
import com.keeper.national.admin.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @ClassName UserMapperTest
 * @Descriptino TODO
 * @Author myzhen
 * @Date 2020/5/1 下午2:40
 * @Version 1.0
 **/
@Slf4j
public class UserMapperTest extends AdminApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void selectUser() {
        List<User> users = userMapper.selectUser();
        log.info(users.toString());
    }

    @Test
    public void testMp() {

        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.lambda().eq(User::getName,"test");
        List<User> users = userMapper.selectList(wrapper);
        log.info(users.toString());
    }
}
