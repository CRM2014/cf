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
						<li>服务管理</li>
						<li>服务创建</li>
					</ol>
				</h5>
				<!-- 页面路径结束 -->
				<h3>XX客户联系人信息</h3>
				<!-- 导航栏开始 -->
				<ul class="nav nav-tabs col-sm-offset-6" role="tablist">
					<li><a href="../customer.basic/view.html">基本信息</a></li>
					<li class="active"><a href="../customer.contact/list.html">联系人管理</a></li>
					<li><a href="../customer.history/list.html">历史订单管理</a></li>
					<li><a href="../customer.communicate/list.html">交往记录管理</a></li>
				</ul>
				<!-- 导航栏结束 -->
				<!-- 数据显示与交互内容开始 -->
				<div class="workpage well well-lg">

					<form class="form-inline" role="form">
						<div class="form-group">
							<div class="input-group">
								<div class="input-group-addon">姓名</div>
								<input class="form-control" type="text" placeholder="">
							</div>
						</div>

						<div class="form-group">
							<div class="input-group">
								<div class="input-group-addon">职位</div>
								<input class="form-control" type="text" placeholder="">
							</div>
						</div>

						<div class="form-group">
							<div class="input-group">
								<div class="input-group-addon">手机</div>
								<input class="form-control" type="text" placeholder="">
							</div>
						</div>

						<button type="submit" class="btn btn-default">
							<span class="glyphicon glyphicon-search"></span> 查询
						</button>
						<a role="button" class="btn btn-default" style="" href="customer/contact-add.action">添加联系人</a>
					</form>

					<br> <br>
					<table class="table table-bordered" align="center" valign="middle">
						<tr>
							<td align="center">编号</td>
							<td align="center">姓名</td>
							<td align="center">性别</td>
							<td align="center">职位</td>
							<td align="center">办公室电话</td>
							<td align="center">手机号</td>
							<td align="center">操作</td>
						</tr>
						<tr>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
							<td align="center"><a role="button" class="btn btn-default"
								href="customer/contact-view.action">查看</a> <a role="button" class="btn btn-default"
								href="customer/contact-edit.action">编辑</a> <a role="button" class="btn btn-default">删除</a>
							</td>
						</tr>
					</table>
				</div>
				<!-- 数据显示与交互内容结束 -->
				
				</div>
			<!-- 主要内容结束 -->
		</div>
	</div>
	
	<!-- js开始 -->
	<%@ include file="/view/common/js.jsp"%>
	<script type="text/javascript">
		var pageInfo = new PageInfo(2);
		pageInfo.generate();
	</script>
	<!-- js结束 -->

</body>
</html>