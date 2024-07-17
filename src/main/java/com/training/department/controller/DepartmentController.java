package com.training.department.controller;

import com.training.department.repository.DepartmentRepository;
import com.training.department.view.Department;
import com.training.department.view.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

  private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);
  @Autowired
  private DepartmentRepository repository;

  @GetMapping
  public List<Department> getAllDepartments() {
    return repository.findAll();
  }

  @PostMapping
  public Department add(@RequestBody Department department) {
    LOGGER.info("Deparment added: {}", department);
    return repository.addDepartment(department);
  };

  @GetMapping("{id}")
  public Department get(@PathVariable Long id) {
    return repository.findById(id);
  }
}
