package com.keeper.national.common.constant;

import lombok.Getter;

/**
 * @ClassName Status
 * @Descriptino 异常状态封装码
 * @Author myzhen
 * @Date 2020/5/2 下午4:01
 * @Version 1.0
 **/
@Getter
public enum Status {
    /**
     * 操作成功
     */
    OK(200, "操作成功"),

    /**
     * 未知异常
     */
    UNKNOWN_ERROR(500, "服务器出错啦");
    /**
     * 状态码
     */
    private Integer code;
    /**
     * 内容
     */
    private String message;

    Status(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
