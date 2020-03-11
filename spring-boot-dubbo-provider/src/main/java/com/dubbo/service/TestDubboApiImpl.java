package com.dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.TestDubboApi;


@Service(version = "1.0.0",timeout = 3000)
public class TestDubboApiImpl implements TestDubboApi {


    @Override
    public void testDubbo() {
        System.err.println("provider");
    }
}
