package com.cola.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Cola
 * @description
 * @date 2022/1/15
 * @email 1020151695@qq.com
 */
@RestController
public class Hello {

    @GetMapping("/")
    public R hello() throws Exception {
        // 不相等就抛异常
        CodeEnum.fail.assertIsEquals(1,2);
        return R.success();
    }

}
