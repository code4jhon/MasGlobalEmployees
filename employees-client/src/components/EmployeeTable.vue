<template>
  <el-table
    :data="employees"
    stripe
    :fit="true">
    <el-table-column
      prop="id"
      label="ID"
      width="50">
    </el-table-column>
    <el-table-column
      prop="name"
      label="Name"
      width="150">
    </el-table-column>
    <el-table-column
      prop="contractTypeName"
      label="Contract Type"
      width="150">
    </el-table-column>
    <el-table-column
      prop="roleName"
      label="Role Name"
      width="150">
    </el-table-column>
    <el-table-column
      prop="hourlySalary"
      label="Hourly Salary"
      width="150">
    </el-table-column>
    <el-table-column
      prop="monthlySalary"
      label="Monthly Salary"
      width="150">
    </el-table-column>
    <el-table-column
      prop="annualSalary"
      label="Anual Salary">
    </el-table-column>
  </el-table>
</template>

<script>
  export default {
    props: ['employeeData'],


    computed: {
      employees () {
        const data = this.employeeData || []

        return data.map(this.formatEmployeeData)
      }
    },

    methods: {
      formatEmployeeData (employee) {
        return {
          id: employee.id,
          name: employee.name,
          contractTypeName: employee.contractTypeName === 'HourlySalaryEmployee' ? 'Hourly' : 'Monthly',
          roleName: employee.roleName,
          hourlySalary: employee.contractTypeName === 'HourlySalaryEmployee' ? this.$options.filters.currency(employee.hourlySalary) : 'N/A',
          monthlySalary: employee.contractTypeName === 'MonthlySalaryEmployee' ? this.$options.filters.currency(employee.monthlySalary) : 'N/A',
          annualSalary: this.$options.filters.currency(employee.annualSalary)
        }
      }
    }
  }
</script>


