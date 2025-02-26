package com.demo.spring_boot_web_demo;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

//    @RequestMapping("/")
//    public String home(){
//        System.out.println("home page called");
//        return "index.jsp";
//    }

//    prefix and suffix usage - prefix and suffix defined in application.properties
    @RequestMapping("/")
    public String home(){
        System.out.println("home page called");
        return "index";
    }

//    @RequestMapping("/add")
//    public String add(HttpServletRequest req, HttpSession session){
//        System.out.println("add method called");
//        int num1 = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));
//        int sum = num1+num2;
//        System.out.println("result is: " + sum);
//        session.setAttribute("result", sum);
//        return "result.jsp";
//    }

//    variables are of same name in jsp and add function
//    @RequestMapping("/add")
//    public String add(int num1, int num2, HttpSession session){
//        System.out.println("add method called");
//        int sum = num1+num2;
//        System.out.println("result is: " + sum);
//        session.setAttribute("result", sum);
//        return "result.jsp";
//    }

//    RequestParam attribute
//    @RequestMapping("/add")
//    public String add(@RequestParam("num1") int a, @RequestParam("num2") int b, HttpSession session){
//        System.out.println("add method called");
//        int sum = a+b;
//        System.out.println("result is: " + sum);
//        session.setAttribute("result", sum);
//        return "result.jsp";
//    }

//    Model class
//    @RequestMapping("/add")
//    public String add(@RequestParam("num1") int a, @RequestParam("num2") int b, Model model){
//        System.out.println("add method called");
//        int sum = a+b;
//        System.out.println("result is: " + sum);
//        model.addAttribute("result", sum);
//        return "result.jsp";
//    }

//    prefix and suffix usage - prefix and suffix defined in application.properties
//    @RequestMapping("/add")
//    public String add(@RequestParam("num1") int a, @RequestParam("num2") int b, Model model){
//        System.out.println("add method called");
//        int sum = a+b;
//        System.out.println("result is: " + sum);
//        model.addAttribute("result", sum);
//        return "result";
//    }

//    ModelAndView class
    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("num1") int a, @RequestParam("num2") int b, ModelAndView mv){
        System.out.println("add method called");
        int sum = a+b;
        System.out.println("result is: " + sum);
        mv.addObject("result", sum);
        mv.setViewName("result"); //jsp name
        return mv;
    }

//    @RequestMapping("/alien_details") //parameter - form action from jsp
//    public ModelAndView addAlienDetails(@RequestParam("aid") int a, @RequestParam("aname") String b, ModelAndView mv){
//        System.out.println("add alien details method called");
//        Alien alien = new Alien();
//        alien.setAid(a);
//        alien.setAname(b);
//        mv.addObject("alien", alien);
//        mv.setViewName("result"); //jsp name
//        return mv;
//    }

    //ModelAttribute usage
//    @RequestMapping("/alien_details")
//    public String addAlienDetails(@ModelAttribute("alien") Alien a){
//        return "result";
//    }

    //ModelAttribute is optional if the parameter is same as in the jsp
    @RequestMapping("/alien_details")
    public String addAlienDetails(Alien alien){
        return "result";
    }

    //ModelAttribute for dynamic changing contents
    @ModelAttribute("course")
    public String courseDetails(){
        return "java";
    }

}
