package com.mybatis.controller;

import com.mybatis.dao.EmployeeMapper;
import com.mybatis.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @Autowired
    EmployeeMapper mapper;

    @RequestMapping("/")
    public ModelAndView showHome(){

//        System.out.println(mapper.getAllEmployees());

        ModelAndView mav = new ModelAndView("list-employee");

        mav.addObject("listemployees",mapper.getAllEmployees());

        return mav;
    }

    @RequestMapping("/showFormForAddEmployee")
    public ModelAndView showForm(){

        ModelAndView mav = new ModelAndView("add-employee");

        mav.addObject("employee", new Employee());

        return mav;

    }

    @RequestMapping("/saveProcess")
    public String saveProcess(@ModelAttribute("employee") Employee employee){

        mapper.saveEmployee(employee);

        return "redirect:/";

    }

    @RequestMapping("/deleteemployee")
    public String deleteEmployee(@RequestParam("employeeId") int employeeId){
        mapper.deleteEmployee(employeeId);
        System.out.println(employeeId);
        return "redirect:/";
    }

    @RequestMapping("/editemployee")
    public ModelAndView editEmployee(@RequestParam("employeeId") int employeeId){
        System.out.println("Employee Id : " + employeeId);
        ModelAndView mav = new ModelAndView("add-employee");
        Employee employee = mapper.findById(employeeId);
        mav.addObject("employee", employee);
        return mav;
    }
}
