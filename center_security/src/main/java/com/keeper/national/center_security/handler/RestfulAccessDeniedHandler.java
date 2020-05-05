package com.keeper.national.center_security.handler;

import cn.hutool.json.JSONUtil;
import com.keeper.national.common.util.ResponseResult;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName RestfulAccessDeniedHandler
 * @Descriptino 当访问接口没有权限时，自定义的返回结果
 * @Author myzhen
 * @Date 2020/5/5 下午2:01
 * @Version 1.0
 **/
@Component
public class RestfulAccessDeniedHandler implements AccessDeniedHandler {

    @Override
    public void handle(HttpServletRequest request,
                       HttpServletResponse response,
                       AccessDeniedException e) throws IOException, ServletException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        response.getWriter().println(JSONUtil.parse(ResponseResult.forbidden(e.getMessage())));
        response.getWriter().flush();
    }
}
