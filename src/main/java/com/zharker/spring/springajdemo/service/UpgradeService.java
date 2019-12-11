package com.zharker.spring.springajdemo.service;

import org.springframework.stereotype.Service;

@Service
public class UpgradeService {

    public String queryProcess(String event){
        System.out.println(event);
        return event+" is in processing";
    }


}
