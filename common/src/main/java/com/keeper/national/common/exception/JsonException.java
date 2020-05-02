package com.keeper.national.common.exception;

import com.keeper.national.common.constant.Status;
import lombok.Getter;

/**
 * @ClassName JsonException
 * @Descriptino TODO
 * @Author myzhen
 * @Date 2020/5/2 下午4:02
 * @Version 1.0
 **/
@Getter
public class JsonException extends BaseException {

    public JsonException(Status status) {
        super(status);
    }

    public JsonException(Integer code, String message) {
        super(code, message);
    }
}
