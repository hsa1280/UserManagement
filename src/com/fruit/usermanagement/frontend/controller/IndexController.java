package com.fruit.usermanagement.frontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by shian_mac on 8/16/15.
 */


@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping
    public String getIndexPage() {
        return "index";
    }
}