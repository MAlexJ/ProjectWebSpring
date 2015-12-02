package com.alex.controller;

import com.alex.constant.Constant;
import com.alex.entity.SessionScopeData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes(types = SessionScopeData.class)
public class DisconnectController {

    @RequestMapping(value = "/disconnect", method = RequestMethod.GET)
    public String showPageExitGET(SessionScopeData scopeData, Model model) {
        model.addAttribute(Constant.CURRENT_PAGE, "sqlcmd");
        model.addAttribute(Constant.CURRENT_CONNECT, false);
        scopeData.setConnect(false);
        return Constant.PAGE;
    }

}
