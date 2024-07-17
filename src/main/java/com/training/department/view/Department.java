package com.training.department.view;

import java.util.ArrayList;
import java.util.List;

public class Department {
  private long id;
  private String name;

  private List<Employee> employees = new ArrayList<>();

  public Department(long id, String name, List<Employee> employees) {
    this.id = id;
    this.name = name;
    this.employees = employees;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public List<Employee> getEmployees() {
    return employees;
  }

  public void setEmployees(List<Employee> employees) {
    this.employees = employees;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Department{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", employees=" + employees +
            '}';
  }
}
