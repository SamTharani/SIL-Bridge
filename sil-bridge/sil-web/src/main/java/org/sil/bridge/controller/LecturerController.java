package org.sil.bridge.controller;


import org.sil.bridge.model.Lecturer;
import org.sil.bridge.service.LecturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class LecturerController {
    @Autowired
    private LecturerService lecturerService;

    @RequestMapping(value = "/lecturer/profile")
    public String dashBoardPage(){
        return "/lecturer/profile";
    }

    @RequestMapping(value = "/lecturer/home")
    public String LecturerHomePage(){
        return "lecturer/home";
    }

    @RequestMapping(value = "/lecturer/register",method = RequestMethod.GET)
    public String LecturerRegisterPage(Map<String,Object>map){
        map.put("lecturer",new Lecturer());
        return "lecturer/register";
    }

    @RequestMapping(value = "/lecturer/addLecturer", method = RequestMethod.POST)
    public String addLecturer(@ModelAttribute("lecturer") Lecturer lecturer) {
        lecturerService.addLecturer(lecturer);
        return "redirect:/lecturer/home";
    }

    @RequestMapping(value = "/lecturer/add-project")
    public String addProject(){
        return "lecturer/add-project";
    }


    @RequestMapping(value = "/lecturer/add-industry")
     public String addIndustry(){
        return "lecturer/add-industry";
    }

    @RequestMapping(value = "/lecturer/student-internship")
     public String studentInternship(){
        return "lecturer/student-internship";
    }

    @RequestMapping(value = "/lecturer/industry-internship")
    public String industryInternship(){
        return "lecturer/industry-internship";
    }

    @RequestMapping(value = "/lecturer/student-projects")
    public String studentProject(){
        return "lecturer/student-projects";

    }

    @RequestMapping(value = "/lecturer/industry-projects")
    public String industryProject(){
        return "lecturer/industry-projects";
    }

    @RequestMapping(value = "/lecturer/notification")
    public String lecturerNotification(){
        return "lecturer/notification";
    }
}
