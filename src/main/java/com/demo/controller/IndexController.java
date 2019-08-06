package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 黄豪强
 * @create 2019/8/6 14:15
 */
@Controller
@RequestMapping("/")
public class IndexController {
    @RequestMapping("index")
    public String index()
    {
        return "index";
    }
}
