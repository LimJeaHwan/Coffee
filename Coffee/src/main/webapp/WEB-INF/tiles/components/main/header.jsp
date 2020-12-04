<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
 
<div align="right">
<a href="/register/step1">회원가입</a>
<button id="LoginBtn"><spring:message code="header.login" /></button>
</div>

<!-- 로그인 모달 -->
<div id="LoginModal" class="loginmodal">
	<div class="modal-content">
	<span id="LoginClose">&times;</span>
		<div class="inner_login">
		<form>
		<table>
			<tr>
				<td>
				<div class="login_main">
					<input type="text"  placeholder="ID" id="id"/>
				</div>
				</td>
			</tr>
			<tr>
				<td>
				<div class="login_main">
					<input type="Password"  placeholder="Password" id="pwd"/>
				</div>
				</td>
			</tr>
			<tr>
				<td>
				<div class="login_footer">
					<input type="submit" size="15" value="로그인">
					<input type="button" id="Join" value="회원가입">
				</div>
				</td>
			</tr>
		</table>
		</form>
		</div>
		
	</div>
</div>

<!-- 회원가입 모달 -->
<div id="JoinModal" class="joinmodal">
	<div class="joinmodal-content">
		<span id="JoinClose">&times;</span>
		<div class="inner_join">
			<div class="inner_join">
			<form action="/join.do" method="POST">
				<div class="join_main">
					<spring:message code="join.id"/><input type="text" name="m_id"/>
				</div>
				<div class="join_main">
					<spring:message code="join.pwd"/><input type="password" name="m_pwd"/>
				</div>
				<div>
					<spring:message code="join.sex"/>:
					<label><input type="radio" name="m_sex" value="M" checked/><spring:message code="join.sex.male"/></label>
					<label><input type="radio" name="m_sex" value="F"/><spring:message code="join.sex.female"/></label>
				</div>
				<div class="join_main">
					<spring:message code="join.addr"/><input type="text" name="m_addr"/>
				</div>
				<div class="join_main">
					<spring:message code="join.phone"/><input type="text" name="m_phone"/>
				</div>
				<div class="join_footer">
					<input type="submit"/>
				</div>
			</form>
				
		</div>
				
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
#LoginClose,
#JoinClose{
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
    -webkit-appearance: none;
       -moz-appearance: none;
            appearance: none;
    border-image:none;
    border-style:none;
    border-color:white;
    
}



.join a{
	color:#767676;
	font-size:5px;
}
.joinmodal{
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

.joinmodal-content{
background-color:#fefefe;
position:absolute;
top:5%;
left:25%;
border:3px bold #888;
width:50%;
height:80%;
}
.inner_join {
    position: absolute;
    left: 51%;
    top: 51%;
    transform:translate(-50%, -50%); 
}

.join_main input {
	width:180px;
	height:30px;
    color:#767676;
    margin:10px 0 0 0;
    font: 400 13.3333px Arial;
    border: 2px solid #767676;
}
.join_footer input[type="submit"]{
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
</style>
<script>
var loginmodal = document.getElementById("LoginModal");
var btn = document.getElementById("LoginBtn");
var loginclose = document.getElementById("LoginClose")
var id =document.getElementById("id");
var pwd = document.getElementById("pwd");


var join = document.getElementById("Join");
var joinmodal = document.getElementById("JoinModal");
var joinclose = document.getElementById("JoinClose");
	
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
	else if(event.target == joinmodal){
		joinmodal.style.display = "none";
		id.value= '';
		pwd.value = '';
	}
}

join.onclick = function(){
	loginmodal.style.display = "none";
	joinmodal.style.display = "block";
}

joinclose.onclick = function(){
	joinmodal.style.display = "none";
}

</script>