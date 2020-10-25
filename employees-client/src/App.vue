<template>
  <div id="app">
    <img class="logo" alt="Mas Global Logo" src="./assets/masGlobal.png">
    <search-form></search-form>
    <employees-table></employees-table>
  </div>
</template>

<script>
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
      fit: true,
      logoSrc: './assets/masGlobal.png'
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

.logo {
  width: 200px;
  height: 200px;
  margin-bottom: 50px;
}
</style>
