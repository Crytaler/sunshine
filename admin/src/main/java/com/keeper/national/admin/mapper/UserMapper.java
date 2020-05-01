package com.keeper.national.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.keeper.national.admin.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Descriptino TODO
 * @Author myzhen
 * @Date 2020/5/1 下午2:20
 * @Version 1.0
 **/
@Mapper
@Component
public interface UserMapper extends BaseMapper<User> {

    List<User> selectUser();
}
