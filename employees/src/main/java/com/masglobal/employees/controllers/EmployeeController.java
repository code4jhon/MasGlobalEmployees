package com.masglobal.employees.controllers;

import com.masglobal.employees.services.EmployeeService;
import com.masglobal.employees.models.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("api/v1/employee")
public class EmployeeController {

  @GetMapping
  public ArrayList<Employee> list() {
    return EmployeeService.getEmployees();
  }

  @GetMapping("/{id}")
  public Employee get(@PathVariable("id") long id) {
    return new Employee();
  }
}
