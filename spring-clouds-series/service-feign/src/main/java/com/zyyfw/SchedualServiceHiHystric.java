package com.zyyfw;

import org.springframework.stereotype.Component;

/**
 * Created by zhengweiyfw on 2018/4/8.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
