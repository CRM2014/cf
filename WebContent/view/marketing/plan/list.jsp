﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
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
						<li>营销管理</li>
						<li>客户开发计划管理</li>
					</ol>
				</h5>
				<!-- 页面路径结束 -->
				<h3>客户开发计划管理</h3>
								<!-- 提示开始 -->
				<%@ include file="/view/common/message.jsp"%>
				<!-- 提示结束 -->
				<!-- 数据显示与交互内容开始 -->
				<div class="workpage well well-lg">

					<form class="form-inline" role="form"
						action="${ctx }/marketing/plan-list.action" method="post">
						<div class="form-group">
							<div class="input-group">
								<div class="input-group-addon">客户名称</div>
								<input class="form-control" type="text" placeholder=""
									name="condition.salechance.usCustomerName"
									value="${ condition.salechance.usCustomerName}">
							</div>
						</div>

						<div class="form-group">
							<div class="input-group">
								<div class="input-group-addon">计划项</div>
								<input class="form-control" type="text" placeholder=""
									name="condition.dePlan"
									value="${ condition.dePlan}">
							</div>
						</div>

						<button type="submit" class="btn btn-default">
							<span class="glyphicon glyphicon-search"></span> 查询
						</button>

					</form>

					<br> <br>
					<table class="table table-bordered" align="center" valign="middle">
						<tr>
							<td align="center">编号</td>
							<td align="center">客户名称</td>
							<td align="center">计划项</td>
							<td align="center">执行效果</td>
							<td align="center">创建时间</td>
							<td align="center">操作</td>
						</tr>
						<s:iterator value="%{page.list}">
							<tr>
								<td>${deId}</td>
								<td>${salechance.usCustomerName}</td>
								<td>${dePlan}</td>
								<td>${deResult}</td>
								<td>${deDate}</td>

								<td align="center"><a role="button"
									href="${ctx }/marketing/plan-execute.action?salechance.sachId=${salechance.sachId}"
									class="btn btn-default">执行计划</a></td>
							</tr>
						</s:iterator>
					</table>
					<div class="text-center">
						<!-- 分页栏开始 -->
						<%@ include file="/view/common/page.jsp"%>
						<!-- 分页栏结束 -->
					</div>
				</div>
				<!-- 数据显示与交互内容结束 -->
			</div>
			<!-- 主要内容结束 -->
		</div>
	</div>

	<!-- js开始 -->
	<%@ include file="/view/common/js.jsp"%>
	<script type="text/javascript">
		var pageInfo = new PageInfo(1);
		pageInfo.generate();
	</script>
	<!-- js结束 -->

</body>
</html>