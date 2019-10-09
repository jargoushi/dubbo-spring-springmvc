package com.rwb.service.impl;

import com.rwb.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * @Version 1.0
 * @Author:ruwb
 * @Date:2019/10/9
 * @Content:
 */
@Service
public class DemoServiceImpl  implements DemoService {

    public String sayHello(String name) {
        return "hello" + name;
    }
}
