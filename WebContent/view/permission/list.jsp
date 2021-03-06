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
						<li>权限列表</li>
						<li>用户列表</li>
					</ol>
				</h5>
				<!-- 页面路径结束 -->
				<h3>用户列表</h3>
								<!-- 提示开始 -->
				<%@ include file="/view/common/message.jsp"%>
				<!-- 提示结束 -->
				<!-- 数据显示与交互内容开始 -->
				<form action="${ctx }/permission/permission-list.action"
					method="post" id="main-form">
					<div class="workpage well well-lg">
						<div class="form-inline">
							<div class="form-group">
								<div class="input-group">
									<div class="input-group-addon">用户名</div>
									<input class="form-control" type="text" placeholder=""
										name="condition.usUserName" value="${condition.usUserName}">
								</div>
							</div>

							<div class="form-group">
								<div class="input-group">
									<div class="input-group-addon">用户角色</div>
									<input class="form-control" type="text" placeholder=""
										name="condition.usRole" value="${condition.usRole}">
								</div>
							</div>

							<button type="submit" class="btn btn-default"
								onclick="$('#currentPage').val(1)">
								<span class="glyphicon glyphicon-search"></span>查询
							</button>
							<a role="button" class="btn btn-default"
								href="${ctx }/permission/permission-add.action" type="button">
								<span class="glyphicon glyphicon-plus"></span>新建
							</a>
						</div>

						<br> <br>

						<table class="table table-bordered" align="center" valign="middle">

							<tr>
								<td align="center">编号</td>
								<td align="center">用户名</td>
								<td align="center">用户姓名</td>
								<td align="center">用户角色</td>
								<td align="center">操作</td>
							</tr>
							<s:iterator value="%{page.list}">
								<tr>
									<td>${usId}</td>
									<td>${usUserName}</td>
									<td>${usName }</td>
									<td>${usRole }</td>
									<td align="center"><a role="button"
										href="${ctx }/permission/permission-modify.action?user.usId=${usId}"
										class="btn btn-default">编辑</a> <a role="button"
										href="#${ctx }/permission/permission-deleteUser.action?user.usId=${usId}"
										onclick="comfirmDelete($(this))" class="btn btn-default">删除</a></td>
								</tr>
							</s:iterator>
						</table>
						<div class="text-center">
							<!-- 分页栏开始 -->
							<%@ include file="/view/common/page.jsp"%>
							<!-- 分页栏结束 -->
						</div>
					</div>
				</form>
				<!-- 数据显示与交互内容结束 -->
			</div>
			<!-- 主要内容结束 -->
		</div>
	</div>

	<!-- js开始 -->
	<%@ include file="/view/common/js.jsp"%>
	<script type="text/javascript">
		$(document).ready(function() {
			var pageInfo = new PageInfo(6);
			pageInfo.generate();
		});
	</script>
	<!-- js结束 -->
</body>
</html>