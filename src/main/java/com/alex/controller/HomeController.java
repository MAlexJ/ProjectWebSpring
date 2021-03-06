package com.alex.controller;


import com.alex.constant.Constant;
import com.alex.entity.SessionScopeData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes(types = SessionScopeData.class)
public class HomeController {

    @Autowired
    private Constant constant;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showPageGET(SessionScopeData scopeData, Model model) {
        if (scopeData == null)
            model.addAttribute(new SessionScopeData());
        return constant.PAGE;
    }
}
