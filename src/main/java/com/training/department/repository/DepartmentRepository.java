package com.training.department.repository;

import com.training.department.view.Department;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DepartmentRepository {
  private List<Department> departments = new ArrayList<>();

  public Department addDepartment(Department department) {
    departments.add(department);
    return department;
  }

  public Department findById(Long id) {
    return departments.stream().filter(department -> department.getId() == id).findFirst().orElseThrow();
  }

  public List<Department> findAll() {
    return departments;
  }
}
