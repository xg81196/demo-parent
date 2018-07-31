package com.xgxb.service;

/**
 * create by SYSTEM  on  2018/7/31 13:54
 */
public class SchedualServiceHiFallback implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
