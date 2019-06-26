<template>
<div>
  <Nav></Nav>
  <form>
    <div class="form-group">
      <label for="email">Email:</label>
      <input type="email" class="form-control" id="email" placeholder="Enter email" v-model="email">
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="pwd" placeholder="Enter password" v-model="pwd">
    </div>
    <div class="checkbox">
      <label><input type="checkbox"> Remember me</label>
    </div>
    <button @click="loginChk" type="submit" class="btn btn-default">Submit</button>
  </form>
  <Footer></Footer>
</div>
</template>

<script>
import Nav from '@/components/common/Nav.vue'
import Footer from'@/components/common/Footer.vue'

export default {
  components: {
    Nav,
    Footer
  },
  methods: {
    loginChk(){
      alert('로그인 시도 '+ this.email + this.pwd);
      if(this.email === 'aaa@aaa.com' && this.pwd === '1234'){
        alert('로그인 성공');
        this.$router.push({path:'/'});
      }
    }
  }
}
</script>

<style scoped>
</style>