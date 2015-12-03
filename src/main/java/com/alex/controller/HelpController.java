package com.alex.controller;

import com.alex.constant.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelpController {

    @Autowired
    private Constant constant;

    @RequestMapping(value = "/help", method = RequestMethod.GET)
    public String showPageGET(Model model) {
        model.addAttribute("currentPage", "help");
        return constant.PAGE;
    }
}
