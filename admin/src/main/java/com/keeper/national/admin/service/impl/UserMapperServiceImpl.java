package com.keeper.national.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.keeper.national.admin.domain.User;
import com.keeper.national.admin.mapper.UserMapper;
import com.keeper.national.admin.service.UserMapperService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName UserMapperServiceImpl
 * @Descriptino TODO
 * @Author myzhen
 * @Date 2020/5/2 下午5:01
 * @Version 1.0
 **/
@Service
public class UserMapperServiceImpl extends ServiceImpl<UserMapper, User> implements UserMapperService {

}
