package com.masglobal.employees.services;

import com.masglobal.employees.models.Contractor;
import com.masglobal.employees.models.Employee;
import com.masglobal.employees.models.InternalEmployee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

public class EmployeeService {
  private static Employee[] loadEmployees () {
    final String uri = "http://masglobaltestapi.azurewebsites.net/api/employees";

    RestTemplate restTemplate = new RestTemplate();
    ResponseEntity<Employee[]> response = restTemplate.getForEntity(uri, Employee[].class);

    return response.getBody();
  }


  public static ArrayList<Employee> getEmployees () {
    Employee[] genericEmployees = loadEmployees();
    ArrayList<Employee> employees = new ArrayList<>();

    for (Employee employee : genericEmployees) {
      if (employee.getContractTypeName().equals("MonthlySalaryEmployee")) {
        InternalEmployee internalEmployee = new InternalEmployee(employee);
        employees.add(internalEmployee);
      } else if (employee.getContractTypeName().equals("HourlySalaryEmployee")) {
        Contractor contractorEmployee = new Contractor(employee);
        employees.add(contractorEmployee);
      }
    }

    return employees;
  }
}
