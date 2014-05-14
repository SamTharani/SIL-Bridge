package org.sil.bridge.controller;


import org.sil.bridge.model.Industry;
import org.sil.bridge.service.IndustryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class IndustryController {

    @Autowired
    private IndustryService industryService;

    @RequestMapping(value = "/industry/profile")
    public String industryProfilePage(){
        return "/industry/profile";
    }
    @RequestMapping(value = "/industry/home")
    public String IndustryHomePage(){
        return "industry/home";
    }
    @RequestMapping(value = "/industry/register",method = RequestMethod.GET)
    public String industryRegisterPage(Map<String,Object>map){
        map.put("industry",new Industry())  ;
        return "industry/register";
    }


    @RequestMapping(value = "/industry/addIndustry", method = RequestMethod.POST)
    public String addIndustry(@ModelAttribute("industry") Industry industry) {

        industryService.addIndustry(industry);
        return "redirect:/industry/home";
    }

    @RequestMapping(value = "/industry/add-vacancy")
    public String addNewVacancy(){
        return "industry/add-vacancy";
    }

    @RequestMapping(value = "/industry/vacancies")
    public String listVacancies(){
        return "industry/list-vacancy";
    }

    @RequestMapping(value = "/industry/vacancy-details")
    public String vacancyDetails(){
        return "industry/vacancy-details";
    }

    @RequestMapping(value = "/industry/message")
    public String industryMessagePage(){
        return "industry/message";
    }

    @RequestMapping(value = "/industry/notification")
    public String industryNotificationPage(){
        return "industry/notification";
    }


}
