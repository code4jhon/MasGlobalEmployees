package com.masglobal.employees.models;

import org.springframework.beans.BeanUtils;

public class InternalEmployee extends GenericEmployee{

  public InternalEmployee (GenericEmployee employee) {
    float annualSalary = employee.getMonthlySalary() *  12;

    BeanUtils.copyProperties(employee, this);
    this.setAnnualSalary(annualSalary);
  }
}
