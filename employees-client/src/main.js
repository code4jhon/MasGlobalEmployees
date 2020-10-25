import Vue from 'vue'
import App from './App.vue'
import ElementUI from 'element-ui';
import locale from 'element-ui/lib/locale/lang/en'
import 'element-ui/lib/theme-chalk/index.css';
import Vue2Filters from 'vue2-filters'

Vue.use(ElementUI, { locale })
Vue.use(Vue2Filters)

Vue.config.productionTip = false
Vue.config.serverBaseUrl = 'http://localhost:8080'

new Vue({
  render: h => h(App),
}).$mount('#app')
