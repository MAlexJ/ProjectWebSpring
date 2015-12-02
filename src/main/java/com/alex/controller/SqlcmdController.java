package com.alex.controller;

import com.alex.constant.Constant;
import com.alex.entity.SessionScopeData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes(types = SessionScopeData.class)
@RequestMapping(value = "/sqlcmd")
public class SqlcmdController {

    @RequestMapping(method = RequestMethod.GET)
    public String showPageGET(SessionScopeData scopeData, Model model) {
        model.addAttribute(Constant.CURRENT_PAGE, "sqlcmd");
        if (scopeData.getConnect()) {
            model.addAttribute(Constant.CURRENT_CONNECT, true);
        }
        return Constant.PAGE;
    }

    @RequestMapping(method = RequestMethod.POST)
    public String showPagePOST(SessionScopeData scopeData, Model model,
                               @RequestParam("db_name") String db_name,
                               @RequestParam("user_name") String user_name,
                               @RequestParam("password") String password) {
        model.addAttribute(Constant.CURRENT_PAGE, "sqlcmd");
        try {
            //TODO validation request parameter
            //TODO Connect to DB
            if (db_name.equals("db") && user_name.equals("user") && password.equals("password")) {
                model.addAttribute(Constant.CURRENT_CONNECT, true);
                model.addAttribute(Constant.EXCEPTION_CONNECT, false);
                scopeData.setConnect(true);
            } else {
                throw new ArithmeticException();
            }
        } catch (Exception e) {
            model.addAttribute(Constant.EXCEPTION_CONNECT, true);
        }
        return Constant.PAGE;
    }
}
