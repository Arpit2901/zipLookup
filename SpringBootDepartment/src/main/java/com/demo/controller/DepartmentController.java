package com.demo.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;




import com.demo.bean.Department;
import com.demo.dao.DepartmentDao;
import com.demo.dao.DepartmentDaoImp;



@RestController
public class DepartmentController {
    @Autowired
    DepartmentDaoImp dao;
    
    @RequestMapping(value="/createDepartment",method=RequestMethod.POST)
    public String createDepartment() {
 
        return dao.addDepartment(new Department (13,"information","Arpit"));
    }
    @RequestMapping(value="/display",method=RequestMethod.GET)
    public String display() {
        return "In display";
    }
}