<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
</head>
<body>
	<div class="container-fluid">
		<div class="space"></div>
		<div class="row">

			<div class="col-md-4"></div>
			<div class="col-md-4">
				<br> <br> <br> <br> <br>
				<div class="workpage well">
					<form class="form-horizontal" role="form">
						<div class="container-fluid"></div>
						<h2 class="form-signin-heading text-center">CF客户关系管理系统</h2>
						<br>
						<div class="form-group">
							<label for="inputEmail3" class="col-sm-3 control-label">用户名：</label>
							<div class="col-sm-8">
								<input type="email" class="form-control" id="" placeholder="用户名">
							</div>
						</div>
						<div class="form-group">
							<label for="inputEmail3" class="col-sm-3 control-label">密码：</label>
							<div class="col-sm-8">
								<input type="password" class="form-control" id=""
									placeholder="密码">
							</div>
						</div>
						<div class="form-group">
							<label for="inputEmail3" class="col-sm-3 control-label">验证码：</label>
							<div class="col-sm-4">
								<input type="email" class="form-control" id="" placeholder="验证码">
							</div>
							<div class="col-sm-2">
								<a href="#"> <img alt="验证码"
									src="../../resourse/image/yanzhengma.png"></a>
							</div>
						</div>
						<div class="form-group"></div>
						<a role="button" class="btn btn-info btn-block"
							href="../account/user.html" type="submit">登录</a>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>