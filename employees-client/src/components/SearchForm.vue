<template>
  
  <el-form :inline="true" :model="formInline" class="demo-form-inline">
    <el-form-item label="Search by Employee ID">
      <el-input type="number" v-model="formInline.employeeId"  placeholder="Type the user ID" clearable></el-input>
    </el-form-item>

    <el-form-item>
      <el-button type="primary" @click="onSubmit">Search</el-button>
    </el-form-item>
  </el-form>
  
</template>

<script>
  export default {
    data() {
      return {
        formInline: {
          employeeId: ''
        }
      }
    },
    methods: {
      onSubmit() {
        this.$emit('search-click', this.formInline.employeeId)
      }
    }
  }
</script>