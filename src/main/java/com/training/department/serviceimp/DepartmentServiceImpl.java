package com.training.department.serviceimp;

import com.training.department.entities.Department;
import com.training.department.exception.DepartmentNotFoundException;
import com.training.department.repository.DepartmentRepository;
import com.training.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@Slf4j
public class DepartmentServiceImpl implements DepartmentService {

  @Autowired
  private DepartmentRepository departmentRepository;

  @Override
  public Department getDepartment(long id) {
    throw new DepartmentNotFoundException("Department not found with id: " + id);
  }

  @Override
  public List<Department> findAll() {
    return List.of();
  }

  @Override
  public Department save(Department department) {
    System.out.println(department.getName());
    departmentRepository.save(department);

    return department;
  }

  @Override
  public Department findDepartmentById(long id) {
    System.out.println("Inside findById method");
    Department department = departmentRepository.findById(id).get();
    if (department == null) {
      throw new DepartmentNotFoundException("Department not found with id: " + id);
    }
    return department;
  }

  @Override
  public Department updateDepartment(long id, Department department) {
    Department oldDepartment = departmentRepository.findById(id).get();
    if (Objects.nonNull(department.getName()) && !"".equalsIgnoreCase(department.getName())) {
      oldDepartment.setName(department.getName());
    }
    return departmentRepository.save(oldDepartment);
  }
}
