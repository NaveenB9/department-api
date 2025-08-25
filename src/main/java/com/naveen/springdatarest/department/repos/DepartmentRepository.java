package com.naveen.springdatarest.department.repos;

import org.springframework.data.repository.CrudRepository;

import com.naveen.springdatarest.department.entities.Department;

public interface DepartmentRepository extends CrudRepository<Department, Long> {

}
