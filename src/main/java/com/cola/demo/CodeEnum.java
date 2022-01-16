package com.cola.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Cola
 * @description 错误类型枚举类
 * @date 2022/1/15
 * @email 1020151695@qq.com
 */
@AllArgsConstructor
public enum CodeEnum implements ExceptionAssert{
    success(200,"成功"),
    fail(400,"失败");

    int code;
    String message;

    /**
    * @author cola
    * @description 实现ExceptionAssert接口是为了再assert时，抛出的异常能获取到code和message
    * @date 2022/1/16
    * @email 1020151695@qq.com
    */
    @Override
    public int getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
