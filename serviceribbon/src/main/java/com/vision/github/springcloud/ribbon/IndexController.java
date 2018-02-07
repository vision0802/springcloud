package com.vision.github.springcloud.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/** @author ganminghui */
@RestController public class IndexController {
    @Autowired private IndexService indexService;

    @RequestMapping("/hi") public String home(@RequestParam String name) {
        return indexService.hiService(name);
    }
}
