package org.sil.bridge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String loginPage2(){
        return "login";
    }

    @RequestMapping(value = "/index")
    public String indexPage(){
        return "index";
    }

    @RequestMapping(value = "/login")
    public String loginPage(){
        return "login";
    }

    @RequestMapping(value = "/choose-member")
    public String chooseMemberPage(){
        return "choose-member";
    }

    @RequestMapping(value = "/choose-projects")
    public String chooseProjectPage(){
        return "choose-project-title";
    }
}
