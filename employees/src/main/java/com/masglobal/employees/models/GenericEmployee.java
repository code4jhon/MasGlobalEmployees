package com.masglobal.employees.models;

public class GenericEmployee {
  private int id;
  private String name;
  private String contractTypeName;
  private int roleId;
  private String roleName;
  private String roleDescription;
  private float hourlySalary;
  private float monthlySalary;
  private float annualSalary;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getContractTypeName() {
    return contractTypeName;
  }

  public void setContractTypeName(String contractTypeName) {
    this.contractTypeName = contractTypeName;
  }

  public int getRoleId() {
    return roleId;
  }

  public void setRoleId(int roleId) {
    this.roleId = roleId;
  }

  public String getRoleDescription() {
    return roleDescription;
  }

  public void setRoleDescription(String roleDescription) {
    this.roleDescription = roleDescription;
  }

  public float getHourlySalary() {
    return hourlySalary;
  }

  public void setHourlySalary(float hourlySalary) {
    this.hourlySalary = hourlySalary;
  }

  public float getMonthlySalary() {
    return monthlySalary;
  }

  public void setMonthlySalary(float monthlySalary) {
    this.monthlySalary = monthlySalary;
  }

  public void setAnnualSalary (float salary) {
    this.annualSalary = salary;
  }

  public float getAnnualSalary () {
    return annualSalary;
  }

  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }
}
