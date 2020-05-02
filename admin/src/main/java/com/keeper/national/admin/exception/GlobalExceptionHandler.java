package com.keeper.national.admin.exception;

import com.keeper.national.common.exception.JsonException;
import com.keeper.national.common.util.ResponseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName GlobalExceptionHandler
 * @Descriptino TODO
 * @Author myzhen
 * @Date 2020/5/2 下午4:03
 * @Version 1.0
 **/
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    private static final String DEFAULT_ERROR_VIEW = "error";

    /**
     * 统一 json 异常处理
     *
     * @param exception JsonException
     * @return 统一返回 json 格式
     */
    @ExceptionHandler(value = JsonException.class)
    @ResponseBody
    public ResponseResult jsonErrorHandler(JsonException exception) {
        log.error("【JsonException】:{}", exception.getMessage());
        return ResponseResult.ofException(exception);
    }
}
