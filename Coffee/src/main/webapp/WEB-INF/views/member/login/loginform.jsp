<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<style>
input{
-webkit-appearance: auto;
appearance: auto;
}
</style>
<h2>${error}</h2>
<h2>${logout}</h2>

<form action="/login" method="post">
	<div>
		<input type="text" name="m_id" placeholder="ID">
	</div>
	<div>
		<input type="password" name="m_pwd" placeholder="Password">
	</div>
	<div>
		<input type="submit" value="로그인">
	</div>
	<input type="hidden" name="${_scrf.parameteName}" value="${_csrf.token}">
</form>