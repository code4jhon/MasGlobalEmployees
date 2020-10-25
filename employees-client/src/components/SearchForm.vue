<template>
  
  <el-form :inline="true" :model="formInline" class="demo-form-inline">
    <el-form-item label="Search by Employee ID">
      <el-input v-model="formInline.employeeId"  placeholder="Type the user ID" clearable></el-input>
    </el-form-item>

    <el-form-item>
      <el-button type="primary" @click="onSubmit">Query</el-button>
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
        console.log('submit!');
      }
    }
  }
</script>