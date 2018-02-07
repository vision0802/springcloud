package com.vision.github.springcloud.eureka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/** @author ganminghui */
@RestController public class IndexController {
    @Autowired private Environment environment;

    @RequestMapping("/hi") public String home(@RequestParam String name) {
        return "hi "+name+",i am from port:" +environment.getProperty("server.port");
    }
}
