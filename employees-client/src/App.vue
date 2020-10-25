<template>
  <div id="app">
    <img class="logo" alt="Mas Global Logo" src="./assets/masGlobal.png">
    <search-form v-on:search-click="onSearch"></search-form>
    <div v-if="errorLoading" class="error-msg"> {{ errorMsg }}</div>
    <employees-table :employeeData="employeeData" v-loading="isLoading"></employees-table>
  </div>
</template>

<script>
import Vue from 'vue'
import SearchForm from './components/SearchForm'
import EmployeesTable from './components/EmployeeTable'

export default {
  name: 'App',
  components: {
    SearchForm,
    EmployeesTable
  },

  data () {
    return {
      logoSrc: './assets/masGlobal.png',
      isLoading: false,
      errorLoading: false,
      errorMsg: 'There was an error loading the employees, please try again later.',
      employeeData: []
    }
  },

  methods: {
    onSearch (employeeId) {
      const me = this
      
      me.isLoading = true
      me.errorLoading = false
      employeeId = employeeId || ''

      fetch(`${Vue.config.serverBaseUrl}/api/v1/employee/${employeeId}`, {
        method: 'GET'
      }).then(me.onProcessResponse, this.onErrorLoading)
        .then(me.onLoadEmployees)
        .then(me.updateEmployeeData)
    },

    onProcessResponse (res) {
      return res.text()
    },

    onLoadEmployees (responseBodyAsText) {
      try {
        const bodyAsJson = JSON.parse(responseBodyAsText);
        return bodyAsJson;
      } catch (e) {
        Promise.reject({body:responseBodyAsText, type:'unparsable'});
      }
    },

    onErrorLoading () {
      this.isLoading = false
      this.errorLoading = true
    },

    updateEmployeeData (employees) {      
      if (employees) {
        employees = Array.isArray(employees) ? employees : [employees]
      } else {
        employees = []
      }

      this.employeeData = employees
      this.isLoading = false
    }
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin: 60px 20px 20px 20px;
}

.error-msg {
  font-weight: 600;
}

.logo {
  width: 200px;
  height: 200px;
  margin-bottom: 50px;
}
</style>
