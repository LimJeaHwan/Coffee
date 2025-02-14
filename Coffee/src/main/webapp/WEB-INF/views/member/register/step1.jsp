<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<!-- 부가적인 테마 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<style>
input{
-webkit-appearance: auto;
appearance: auto;
}
</style>
<div class="panel-body">
	<div class="row">
		<div class="col-lg-12">
			<h4>이용약관</h4>
			<div class="panel-body" style="border: 1px solid #ccc">
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
					Vestibulum tincidunt est vitae ultrices accumsan. Aliquam ornare
					lacus adipiscing, posuere lectus et, fringilla augue. Lorem ipsum
					dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor
					incididunt ut labore et dolore magna aliqua.</p>
			</div>
			<br />
			<h4>개인정보</h4>
			<div class="panel-body" style="border: 1px solid #ccc">
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
					Vestibulum tincidunt est vitae ultrices accumsan. Aliquam ornare
					lacus adipiscing, posuere lectus et, fringilla augue. Lorem ipsum
					dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor
					incididunt ut labore et dolore magna aliqua.</p>
			</div>
			<br />
			<form role="form" action="/register/step2">
				<div class="form-group">
					<label class="checkbox-inline"> <input type="checkbox"
						name="agree" value="true">동의합니다.
					</label>
				</div>
				<button type="submit" class="btn btn-default">다음 단계</button>
			</form>
		</div>
	</div>
</div>
