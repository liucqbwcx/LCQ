package com.cast.credit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class FreemarKerController {
    @RequestMapping("/freemarKer")
    public String freemarKer(Model model){
        model.addAttribute("hello","ajgsdad");
        return "demo";
    }
}
