package com.masglobal.employees.controllers;

import com.masglobal.employees.services.EmployeeService;
import com.masglobal.employees.models.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("api/v1/employee")
public class EmployeeController {

  @GetMapping
  @CrossOrigin(origins = "*")
  public ArrayList<Employee> list() {
    return EmployeeService.getEmployees();
  }

  @CrossOrigin(origins = "*")
  @GetMapping("/{id}")
  public Employee get(@PathVariable("id") long id) {

    return EmployeeService.getEmployeeById(id);
  }
}
