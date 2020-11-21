<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<div align="right">
<button id="myBtn"><spring:message code="header.login" /></button>
</div>

<div id="myModal" class="modal">
	<div class="modal-content">
	<span id="close">&times;</span>
		<div align="center">
		<form>
		아이디  <input type="text" size="15"><br>
		비밀번호<input type="password" size="15"><br>
		</form>
		</div>
	</div>
</div>
<style>
.modal{
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
#close{
color:#aaa;
float:right;
font-size:28px;
font-weight:bold;
}
#close:hover,
#close:focus{
color:black;
text-decoration:none;
cursor:pointer;
}
</style>
<script>
var modal = document.getElementById('myModal');
var btn = document.getElementById("myBtn");
var close = document.getElementById("close")

btn.onclick = function(){
	modal.style.display = "block";
}

close.onclick = function(){
	modal.style.display = "none";
}

window.onclick = function(event){
	if(event.target == modal){
		modal.style.display = "none";
	}
}

</script>