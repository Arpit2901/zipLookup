package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.bean.Employee;
import com.demo.dao.EmployeeDao;

@RestController
public class MyController {

@RequestMapping(value="/display", method=RequestMethod.GET)
public String display() {
    return "In display";
}

@RequestMapping(value="/getEmployee", method=RequestMethod.GET)
public List<Employee> getEmployee() {
    return EmployeeDao.getAllEmployee();
}

@RequestMapping(value="/getEmployeeByid/{id}",method=RequestMethod.GET)
public Employee generateEmployeebyId(@PathVariable("id") int id) {
    EmployeeDao obj=new EmployeeDao();
    Employee emp=obj.generateEmployeeById(id);
    return emp;
    
}

@GetMapping
public String mappingDemo() {
    return "In Mapping demo";
}

@PostMapping("/addEmployee")
public Employee addEmployee() {
    //EmployeeDao obj=new EmployeeDao();
    Employee e=new Employee(109,"Rahul",87);
    Employee emp=EmployeeDao.addEmployee(e);
    return emp;
    
}
}
