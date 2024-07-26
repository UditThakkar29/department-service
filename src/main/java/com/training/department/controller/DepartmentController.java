package com.training.department.controller;

import com.training.department.entities.Department;
import com.training.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/department")
@Slf4j
public class DepartmentController {

  private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

  private DepartmentService departmentService;

  public DepartmentController(DepartmentService departmentService) {
    this.departmentService = departmentService;
  }

  @GetMapping
  public List<Department> getAllDepartments() {
    return departmentService.findAll();
  }

  @PostMapping
  public Department add(@RequestBody Department department) {
    LOGGER.info("Deparment added: {}", department);
    return departmentService.save(department);
  };

  @GetMapping("/{id}")
  public Department get(@PathVariable Long id) {
    LOGGER.info("Department find api");
    return departmentService.findDepartmentById(id);
  }

  @PatchMapping("/{id}")
  public Department update(@PathVariable Long id, @RequestBody Department department) {
    LOGGER.info("Department update api");
    return departmentService.updateDepartment(id, department);
  }
}
