package com.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.dubbo.TestDubboApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestDubboController {

    @Reference(version = "1.0.0", timeout = 300)
    private TestDubboApi testDubboApi;



    @GetMapping("/dubbo")
    public void testDubboMethod(){
        testDubboApi.testDubbo();
    }
}
