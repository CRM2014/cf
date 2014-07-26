<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="/view/common/header.jsp"%>
<%@ include file="/view/common/css.jsp"%>
</head>
<body>
	<!-- 顶部开始 -->
	<%@ include file="/view/common/top.jsp"%>
	<!-- 顶部结束 -->
	<div class="container-fluid">
		<div class="row">
			<!-- 菜单开始 -->
			<%@ include file="/view/common/menu.jsp"%>
			<!-- 菜单结束 -->
			<!-- 主要内容开始 -->
			<div class="col-md-10 col-md-offset-2 main">
				<!-- 页面路径开始 -->
				<h5 class="page-header">
					<ol class="breadcrumb">
						<li>个人中心</li>
					</ol>
				</h5>
				<!-- 页面路径结束 -->
								<!-- 提示开始 -->
				<%@ include file="/view/common/message.jsp"%>
				<!-- 提示结束 -->
				<!-- 数据显示与交互内容开始 -->
				<div class="form-horizontal">
					<div class="form-group">
						<label for="inputEmail3" class="col-sm-4 control-label">编号：</label>
						<label for="inputEmail3" class="col-sm--3 control-label">${currentUser.usId }</label>
					</div>
					<div class="form-group">
						<label for="inputEmail3" class="col-sm-4 control-label">用户名：</label>
						<label for="inputEmail3" class="col-sm--3 control-label">${currentUser.usUserName }</label>
					</div>
					<div class="form-group">
						<label for="inputEmail3" class="col-sm-4 control-label">用户姓名：</label>
						<label for="inputEmail3" class="col-sm--3 control-label">${currentUser.usName }</label>
					</div>
					<div class="form-group">
						<label for="inputEmail3" class="col-sm-4 control-label">用户角色：</label>
						<label for="inputEmail3" class="col-sm--3 control-label">${currentUser.usRole }</label>
					</div>
					<div class="form-group">
						<label for="inputEmail3" class="col-sm-4 control-label">本次登录时间：</label>
						<label for="inputEmail3" class="col-sm--3 control-label">${currentUser.usLoginTime }</label>
					</div>
					<div class="form-group">
						<label for="inputEmail3" class="col-sm-4 control-label">上次登录时间：</label>
						<label for="inputEmail3" class="col-sm--3 control-label">${currentUser.usLastLoginTime }</label>
					</div>
					<div class="form-group">
						<label for="inputEmail3" class="col-sm-4 control-label">用户创建时间：</label>
						<label for="inputEmail3" class="col-sm--3 control-label">${currentUser.usCreateTime }</label>
					</div>
					<div class="form-group">
						<div class="col-sm-6">
							<a data-toggle="modal" href="#" data-target="#loginout"
								class="btn btn-default col-sm-offset-9" role="button">修改密码</a>
						</div>

					</div>

					<!-- 数据显示与交互内容结束 -->
				</div>
				<!-- 主要内容结束 -->
			</div>
		</div>
		<!-- 密码框开始 -->
		<div class="modal fade" id="loginout" tabindex="-1" role="dialog"
			aria-labelledby="mySmallModalLabel" aria-hidden="true">
			<div class="modal-dialog modal-lg">
				<div class="modal-content">

					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">
							<span aria-hidden="true">×</span><span class="sr-only">Close</span>
						</button>
						<h4 class="modal-title" id="mySmallModalLabel">确认注销？</h4>
					</div>
					<div class="modal-body">
						<form class="form-horizontal" role="form"
							action="${ctx }/account/account-passwordModify.action">

							<div class="form-group">
								<label for="inputEmail3"
									class="col-sm-3 col-sm-offset-1 control-label">原密码：</label>
								<div class="col-sm-4">
									<input type="password" class="form-control checkable"
									data-content="非空" name="oldPassword">
								</div>
							</div>

							<div class="form-group">
								<label for="inputEmail3"
									class="col-sm-3 col-sm-offset-1 control-label">新密码：</label>
								<div class="col-sm-4">
									<input type="password" class="form-control checkable" reg="/^[A-Za-z0-9]{6,20}$/"
									data-content="只包含字母和数字" name="newPassword">
								</div>
							</div>
							<div class="form-group">
								<label for="inputEmail3"
									class="col-sm-3 col-sm-offset-1 control-label">确认密码：</label>
								<div class="col-sm-4">
									<input type="password" class="form-control" name="rePassword">
								</div>
							</div>
							<div class="form-group">
								<button type="submit"
									class="btn btn-default col-sm-offset-4 col-sm-1">确认</button>
							</div>
						</form>

					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- 密码框结束 -->
	<!-- js开始 -->
	<%@ include file="/view/common/js.jsp"%>
	<script type="text/javascript">
		var pageInfo = new PageInfo(0);
		pageInfo.generate();
		
		$("form").submit(function() {
			return check();
		});
	</script>
	<!-- js结束 -->
</body>
</html>