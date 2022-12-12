package com.bhavna.SpringMvc;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



import com.bhavna.bean.Employees;
import com.bhavna.dao.EmployeeDao;

@Controller
public class MainController {



   @Autowired
    EmployeeDao employeeDao;

   @RequestMapping("/eb")
    public String home() {
        return "index2";
    }

   @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveEmployee(@ModelAttribute Employees employee) {
        employeeDao.save(employee);
        return "redirect:/viewemp";
    }
    
    @RequestMapping("/viewemp")
    public String viewEmp(Model model) {
        List<Employees> list = employeeDao.getEmployee();
        System.out.println(list);
        model.addAttribute("list", list);
        return "viewemp";
    }
    
      @RequestMapping(value="/editemp/{id}")    
        public String edit(@PathVariable int id, Model m){    
            Employees emp=employeeDao.getEmpById(id);  
            System.out.println(emp);
            m.addAttribute("list",emp);  
            return "viewemp";    
        }  

}