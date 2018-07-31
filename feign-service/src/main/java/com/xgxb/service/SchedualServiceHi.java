package com.xgxb.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * create by SYSTEM  on  2018/7/31 13:34
 */
@FeignClient(value = "service-hi",fallback = SchedualServiceHiFallback.class )
public interface SchedualServiceHi {

    @RequestMapping(value = "/hi")
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
