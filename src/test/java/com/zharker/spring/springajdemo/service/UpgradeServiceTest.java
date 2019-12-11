package com.zharker.spring.springajdemo.service;

import com.zharker.spring.springajdemo.SpringAjDemoApplicationTests;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class UpgradeServiceTest extends SpringAjDemoApplicationTests {

    @Autowired
    private UpgradeService upgradeService;

    @Test
    public void test(){
        upgradeService.queryProcess("can not compile");
    }
}
