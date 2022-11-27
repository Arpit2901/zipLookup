package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;



import com.demo.bean.Department;
import com.demo.entity.DepartmentEntity;



@Repository
public class DepartmentDaoImp {
    @Autowired
    private DepartmentDao dao;
    
    public String addDepartment(Department department) {
        DepartmentEntity departmentEntity=new DepartmentEntity();
        departmentEntity.setdId(department.getdId());
        departmentEntity.setdName(department.getdName());
        departmentEntity.setdHead(department.getdHead());
        dao.save(departmentEntity);
        return "Department added successfully";
    }



}