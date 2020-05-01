package com.keeper.national.admin.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @ClassName user
 * @Descriptino TODO
 * @Author myzhen
 * @Date 2020/5/1 下午2:19
 * @Version 1.0
 **/

@Data
@TableName("User")
public class User {

    private Long id;

    private String name;

    private Integer gender;
}
