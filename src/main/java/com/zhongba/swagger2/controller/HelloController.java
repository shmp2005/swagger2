package com.zhongba.swagger2.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@Api(value = "hello控制器api", tags = {"api", "客户接口"})
@RestController
public class HelloController {

    @ApiOperation(value = "Say something", notes = "bla bla")
    @GetMapping("/say")
    public String say() {
        return LocalDateTime.now().toString();
    }
}
