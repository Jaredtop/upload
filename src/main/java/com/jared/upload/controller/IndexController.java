package com.jared.upload.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author chenjialing
 * @time 2021/6/16 16:53
 */
@Controller
public class IndexController {
    @GetMapping("")
    public String index(){
        return "index";
    }
}
