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
public class DisconnectController {

    @Autowired
    private Constant constant;

    @RequestMapping(value = "/disconnect", method = RequestMethod.GET)
    public String showPageExitGET(SessionScopeData scopeData, Model model) {
        model.addAttribute(constant.CURRENT_PAGE, "sqlcmd");
        model.addAttribute(constant.CURRENT_CONNECT, false);
        scopeData.setConnect(false);
        return constant.PAGE;
    }

}
