<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<style>
input{
-webkit-appearance: auto;
appearance: auto;
}
</style>
<h2>회원 목록</h2>

<table border="1">
	<tr>
		<th align="center" width="60">회원번호</th>
		<th align="center" width="80">아이디</th>
		<th align="center" width="80">비밀번호</th>
		<th align="center" width="100">이름</th>
		<th align="center" width="150">이메일</th>
		<th align="center" width="150">핸드폰번호</th>
		<th align="center" width="200">주소</th>
		<th align="center" width="80">포인트</th>
		<th align="center" width="150">가입일</th>
	</tr>
	<c:choose>
		<c:when test="${empty list}">
			<td colspan="9">
			없음
			</td>
		</c:when>
		<c:otherwise>
			<c:forEach items="${list}" var="list">
				<tr>
					<td align="center">${list.m_no}</td>
					<td align="center">${list.m_id}</td>
					<td align="center">${list.m_pwd}</td>
					<td align="center">${list.m_name}</td>
					<td align="center">${list.m_email}</td>
					<td align="center">${list.m_phone}</td>
					<td align="center">${list.m_addr}</td>
					<td align="center">${list.m_point}</td>
					<td align="center">
					<fmt:formatDate pattern="yyyy-MM-dd HH:mm" value="${list.m_reg_date}"/>
					</td>
				</tr>
			</c:forEach>
		</c:otherwise>
	</c:choose>
</table>