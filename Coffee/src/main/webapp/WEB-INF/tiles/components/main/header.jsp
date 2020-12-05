<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>



<div align="right">
<a href="/register/step1">회원가입</a>
<button id="LoginBtn"><spring:message code="header.login" /></button>
</div>

<!-- 로그인 모달 -->
<div id="LoginModal" class="loginmodal">
	<div class="modal-content">
	<span id="LoginClose">&times;</span>
		<div class="inner_login">
		<form:form role="form" modelAttribute="loginCommand" action="/login" method="post">
		
		</form:form>
		</div>
		
	</div>
</div>

<style>
.loginmodal{
display:none;
position:fixed;
z-index:1;
left:0;
top:0;
width:100%;
height:100%;
oveflow:auto;
background-color: rgb(0,0,0);
background-color: rgba(0,0,0,0.4);
}
.modal-content{
background-color:#fefefe;
position:absolute;
top:25%;
left:30%;
border:3px bold #888;
width:30%;
height:30%;
}
.modal-join{
background-color:#fefefe;
position:absolute;
top:25%;
left:30%;
border:3px bold #888;
width:30%;
height:30%;
}
#LoginClose{
color:#aaa;
float:right;
font-size:28px;
font-weight:bold;
}
#LoginClose:hover,
#LoginClose:focus,
#JoinClose:hover,
#JoinClose:focus
{
color:black;
text-decoration:none;
cursor:pointer;
}
.inner_login {
    position: absolute;
    left: 51%;
    top: 51%;
    transform:translate(-50%, -50%); 
}
.login_main input {
	width:180px;
	height:30px;
    color:#767676;
    margin:10px 0 0 0;
    font: 400 13.3333px Arial;
    border: 2px solid #767676;
}
.login_footer input[type="submit"]{
	width:100px;
	height:30px;
	background-color:black;
    border: 1px solid #767676;
    margin:10px 0 0 0;
    color:white;
    font: 400 13.3333px Arial;
    text-align:center;
    outline:none;
    cursor:pointer;
}

.login_footer input[type="button"],
.login_footer input[type="button"]:focus{
	color:#767676;
	font-size:5px;
	border:0;
	outline:none;
	cursor:pointer;
}

input {
    -webkit-writing-mode: horizontal-tb !important;
    text-rendering: auto;
    color: initial;
    letter-spacing: normal;
    word-spacing: normal;
    text-transform: none;
    text-indent: 0px;
    text-shadow: none;
    display: inline-block;
    text-align: start;
    background-color: white;
    cursor: text;
    margin: 0em;
    padding: 1px 0px;
    border-width: 2px;
    -webkit-appearance: auto;
       -moz-appearance: none;
            appearance: auto;
    border-image:none;
    border-style:none;
    border-color:white;
    
}

</style>
<script>
var loginmodal = document.getElementById("LoginModal");
var btn = document.getElementById("LoginBtn");
var loginclose = document.getElementById("LoginClose")
var id =document.getElementById("id");
var pwd = document.getElementById("pwd");

	
btn.onclick = function(){
	loginmodal.style.display = "block";
}

loginclose.onclick = function(){
	loginmodal.style.display = "none";
	id.value= '';
	pwd.value = '';
}


window.onclick = function(event){
	if(event.target == loginmodal){
		loginmodal.style.display = "none";
		id.value= '';
		pwd.value = '';
	}
}

</script>