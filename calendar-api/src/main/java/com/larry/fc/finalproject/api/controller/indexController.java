package com.larry.fc.finalproject.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

import static com.larry.fc.finalproject.api.service.LoginService.LOGIN_SESSION_KEY;

@Controller
public class indexController {

    public String index(Model model, HttpSession session,
                        @RequestParam(required = false) String redirect){
        model.addAttribute("redirect", redirect);
        model.addAttribute("isSignIn", session.getAttribute(LOGIN_SESSION_KEY) != null);
        return "index";
    }
}
