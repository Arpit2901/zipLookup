package com.demo.dao;


import org.springframework.data.repository.CrudRepository;

import com.demo.entity.DepartmentEntity;

public interface DepartmentDao extends CrudRepository<DepartmentEntity, Integer>{

}
