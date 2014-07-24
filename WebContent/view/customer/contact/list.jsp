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
						<li>客户管理</li>
						<li><a href="${ctx }/customer/customer/customer-list.action">客户信息管理</a></li>
						<li>联系人信息管理</li>
					</ol>
				</h5>
				<!-- 页面路径结束 -->
				<h3>联系人列表</h3>
				<!-- 导航栏开始 -->
				<ul class="nav nav-tabs col-sm-offset-6 " role="tablist">
					<li><a
						href="${ctx }/customer/customer/customer-view.action?customer.cuId=${customer.cuId}">基本信息</a></li>
					<li class="active"><a
						href="${ctx }/customer/contact/contact-list.action?customer.cuId=${customer.cuId}">联系人管理</a></li>
					<li><a
						href="${ctx }/customer/history/history-list.action?customer.cuId=${customer.cuId}">历史订单管理</a></li>
					<li><a
						href="${ctx }/customer/communicate/communicate-list.action?customer.cuId=${customer.cuId}">交往记录管理</a></li>
				</ul>
				<!-- 导航栏结束 -->
				<!-- 数据显示与交互内容开始 -->
				<form action="${ctx }/customer/contact-list.action" method="post"
					id="main-form">
					<input type="hidden" name="customer.cuId" value="${customer.cuId}">
					<div class="workpage well well-lg">
						<div class="form-inline">
							<div class="form-group">
								<div class="input-group">
									<div class="input-group-addon">姓名</div>
									<input class="form-control" type="text" placeholder=""
										name="condition.copeName" value="${condition.copeName}">
								</div>
							</div>

							<div class="form-group">
								<div class="input-group">
									<div class="input-group-addon">职位</div>
									<input class="form-control" type="text" placeholder=""
										name="condition.copePosition"
										value="${condition.copePosition}">
								</div>
							</div>

							<div class="form-group">
								<div class="input-group">
									<div class="input-group-addon">手机</div>
									<input class="form-control" type="text" placeholder=""
										name="condition.copePhone" value="${condition.copePhone}">
								</div>
							</div>

							<button type="submit" class="btn btn-default">
								<span class="glyphicon glyphicon-search"></span> 查询
							</button>
							<a role="button" class="btn btn-default"
								href="${ctx }/customer/contact-add.action?customer.cuId=${customer.cuId}">添加联系人</a>
							<br> <br>
							<table class="table table-bordered" align="center"
								valign="middle">
								<tr>
									<td align="center">编号</td>
									<td align="center">姓名</td>
									<td align="center">性别</td>
									<td align="center">职位</td>
									<td align="center">办公室电话</td>
									<td align="center">手机号</td>
									<td align="center">操作</td>
								</tr>
								<s:iterator value="%{page.list}">
									<tr>
										<td>${copeId}</td>
										<td>${copeName}</td>
										<td>${copeSex}</td>
										<td>${copePosition }</td>
										<td>${copeTel }</td>
										<td>${copePhone }</td>
										<td align="center"><a role="button"
											class="btn btn-default"
											href="${ctx }/customer/contact-view.action?contactperson.copeId=${copeId}">查看</a>
											<a role="button" class="btn btn-default"
											href="${ctx }/customer/contact-edit.action?contactperson.copeId=${copeId}">编辑</a>
											<a role="button" class="btn btn-default"
											onclick="comfirmDelete($(this))"
											href="${ctx }/customer/contact-edit.action?contactperson.copeId=${copeId}">删除</a>
										</td>
									</tr>
								</s:iterator>

							</table>
							<div class="text-center">
								<!-- 分页栏开始 -->
								<%@ include file="/view/common/page.jsp"%>
								<!-- 分页栏结束 -->
							</div>
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
			var pageInfo = new PageInfo(2);
			pageInfo.generate();
		});
	</script>
	<!-- js结束 -->

</body>
</html>