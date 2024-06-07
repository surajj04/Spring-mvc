package org.byetech.controller;

import org.byetech.model.Alien;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("add")
    public String add(@ModelAttribute Alien alien) {
        return "result";
    }


}
