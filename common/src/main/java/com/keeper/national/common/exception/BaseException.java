package com.keeper.national.common.exception;

import com.keeper.national.common.constant.Status;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @ClassName BaseException
 * @Descriptino TODO
 * @Author myzhen
 * @Date 2020/5/2 下午3:59
 * @Version 1.0
 **/
@Data
@EqualsAndHashCode(callSuper = true)
public class BaseException extends RuntimeException {
    private Integer code;
    private String message;

    public BaseException(Status status) {
        super(status.getMessage());
        this.code = status.getCode();
        this.message = status.getMessage();
    }

    public BaseException(Integer code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }
}
