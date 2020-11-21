<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<div align="left" class="menu">
	<ul>
		<li>
			<a href="/" class="menulist"><spring:message code="header.home" /></a>
		</li>
		<li>
			<a href="/menu/list" class="menulist"><spring:message code="menu.menu" /></a>
		</li>
		<li>
			<a href="/menu/list" class="menulist"><spring:message code="menu.notice.member" /></a>
		</li>
		<li>
			<a href="/menu/list" class="menulist"><spring:message code="menu.shop" /></a>
		</li>
	</ul>
</div>

<style>
.bgblue{
	
}
.menu{
height:10%;
background:skyblue;
}
.menu ul li {
list-style:none;
float:left;
width:20%;
height:100%;
line-height:350%;
text-align:center;
}
.menulist{
font-size:30px;
color:#FFFFFF;
}
.menulist:link{
font-size:30px;
text-decoration:none;
color:write;
}
.menulist:visited{
font-size:20px;
text-decoration:none;
color:write;
}
.menulist:hover{
font-size:30px;
text-decoration:none;
color:write;
}
</style>
