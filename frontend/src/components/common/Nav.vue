<template>
  <div>
  <nav class="navbar navbar-default">
    <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">BIT</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><router-link to="/">Home</router-link></li>
      <li><router-link to="/calculator">계산기</router-link></li>
      <li><router-link to="/memberList">테이블</router-link></li>
      <li><router-link to="/joinform">회원가입</router-link></li>
      <li><router-link to="/loginform">로그인</router-link></li>
      <li><router-link to="/joinformproject">로그인2</router-link></li>
    </ul>
  </div>
</nav>
   </div> 
</template>
<script>
export default {
    
}
</script>
<style scoped>

</style>