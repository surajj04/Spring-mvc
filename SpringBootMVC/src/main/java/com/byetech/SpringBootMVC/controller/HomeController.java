package com.byetech.SpringBootMVC.controller;

import com.byetech.SpringBootMVC.model.Alien;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @ModelAttribute
    public void modelData(Model model) {
        model.addAttribute("name", "Aliens");
    }


    @RequestMapping("/")
    public String home() {
        return "index";
    }

//    @RequestMapping("add")
//    public String add(@RequestParam("n1") int num1, @RequestParam("n2") int num2, HttpSession session) {
//        int sum = num1 + num2;
//        session.setAttribute("sum", sum);
//        return "result.jsp";
//    }

//    @RequestMapping("add")
//    public ModelAndView add(@RequestParam("n1") int num1, @RequestParam("n2") int num2) {
//        int sum = num1 + num2;
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("result");
//        mv.addObject("sum", sum);
//        return mv;
//    }

//    also you can use ModelMap

//    @RequestMapping("add")
//    public String add(@RequestParam("n1") int num1, @RequestParam("n2") int num2, Model m) {
//        int sum = num1 + num2;
//        m.addAttribute("sum", sum);
//        return "result";
//    }

    @RequestMapping("add")
    public String add(@ModelAttribute("alien") Alien alien) {
        return "result";
    }


}
