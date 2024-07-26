package com.training.department.service;

import com.training.department.entities.Department;

import java.util.List;


public interface DepartmentService {
  Department getDepartment(long id);

  List<Department> findAll();

  Department save(Department department);

  Department findDepartmentById(long id);

  Department updateDepartment(long id, Department department);
}
