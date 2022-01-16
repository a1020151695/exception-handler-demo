package com.cola.demo;

import com.sun.org.apache.bcel.internal.classfile.Code;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.annotation.sql.DataSourceDefinition;

/**
 * @author Cola
 * @description
 * @date 2022/1/15
 * @email 1020151695@qq.com
 */
@Data
@AllArgsConstructor
public class R {
    private Integer code;
    private String message;

    static R codeEnum(int code,String message){
        return new R(code,message);
    }

    static R success(){
        return new R(CodeEnum.success.code, "成功");
    }
    static R fail(){
        return new R(CodeEnum.fail.code, "失败");
    }
}
