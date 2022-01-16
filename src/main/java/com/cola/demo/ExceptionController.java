package com.cola.demo;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author Cola
 * @description
 * @date 2022/1/15
 * @email 1020151695@qq.com
 */
@RestControllerAdvice
public class ExceptionController {

    @ExceptionHandler(value = EnumException.class)
    public R handleException(EnumException e){
        return R.codeEnum(e.code,e.message);
    }
}
