<template>
<div>
  <Nav></Nav>
  <form>
    <div class="form-group">
      <label for="email">Email:</label>
      <input type="email" class="form-control" id="email" placeholder="Enter email">
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="pwd" placeholder="Enter password">
    </div>
    <div class="checkbox">
      <label><input type="checkbox"> Remember me</label>
    </div>
    <button @click="loginChk" class="btn btn-default">Submit</button>
    <button @click="get" class="btn btn-default">조회</button>
    <button @click="post" class="btn btn-default">입력</button>
    <button @click="put" class="btn btn-default">수정</button>
    <button @click="del" class="btn btn-default">삭제</button>
  </form>
  <Footer></Footer>
</div>
</template>

<script>
import Nav from '@/components/common/Nav.vue'
import Footer from'@/components/common/Footer.vue'
import axios from 'axios'

export default {
  components: {
    Nav,
    Footer
  },
  methods: {
    loginChk(){
      axios.get('/customers/get/count')
      .then(d=>{
        alert(`GET SUCCESS : ${d.data.customerId}`)
        this.$router.push({path:'/'})
      }).catch(e=>{
        alert('ERROR')
      })
    },
    get(){
      axios.get('/customers/get/id')
      .then(d=>{
        alert(`GET SUCCESS : ${d.data.customerId}`)
      })
      .catch(e=>{
        alert('ERROR');
      })
    },
    post(){
      axios.post('/customers/post')
      .then(d=>{
        alert(`POST SUCCESS : ${d.data.result}`)
      })
      .catch(e=>{
        alert('ERROR');
      })
    },
    put(){
      axios.put('/customers/put/id')
      .then(d=>{
        alert(`PUT SUCCESS : ${d.data.result}`)
      })
      .catch(e=>{
        alert('ERROR');
      })
    },
    del(){
      axios.delete('/customers/delete/id')
      .then(d=>{
        alert(`DELETE SUCCESS : ${d.data.result}`);
      })
      .catch(e=>{
        alert('ERROR');
      })
    }
  }
}
</script>

<style scoped>
</style>