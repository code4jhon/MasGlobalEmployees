package com.masglobal.employees.models;

import org.springframework.beans.BeanUtils;

public class Contractor extends Employee {

  public Contractor (Employee employee) {
    float annualSalary = employee.getHourlySalary() * 40 * 52; // hourly rate * 40hrs a week * 52 weeks

    BeanUtils.copyProperties(employee, this);
    this.setAnnualSalary(annualSalary);
  }
}
