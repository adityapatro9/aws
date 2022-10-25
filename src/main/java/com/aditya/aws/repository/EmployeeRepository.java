package com.aditya.aws.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aditya.aws.pojo.EmployeeEntity;

@Repository
public interface EmployeeRepository 
			extends CrudRepository<EmployeeEntity, Long> {

}

