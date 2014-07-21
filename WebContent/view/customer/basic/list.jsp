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
						<li><a href="list.html">客户信息管理</a></li>
						<li>客户基本信息</li>
					</ol>
				</h5>
				<!-- 页面路径结束 -->
				<h3>客户信息管理</h3>

				<!-- 数据显示与交互内容开始 -->
				<form action="${ctx }/customer/customer-list.action" method="post"
					id="main-form">
					<div class="workpage well well-lg">
						<div class="form-inline">
							<div class="form-group">
								<div class="input-group">
									<div class="input-group-addon">客户名称</div>
									<input class="form-control" type="text" placeholder=""
										name="condition.cuName" value="${condition.cuName}">
								</div>
							</div>

							<div class="form-group">
								<div class="input-group">
									<div class="input-group-addon">客户等级</div>
									<input class="form-control" type="text" placeholder=""
										name="condition.cuLevel" value="${condition.cuLevel}">
								</div>
							</div>

							<div class="form-group">
								<div class="input-group">
									<div class="input-group-addon">客户经理</div>
									<input class="form-control" type="text" placeholder="">
								</div>
							</div>

							<button type="submit" class="btn btn-default">
								<span class="glyphicon glyphicon-search"></span>查询
							</button>

							<br> <br>
							<table class="table table-bordered" align="center"
								valign="middle">
								<tr>
									<td align="center">编号</td>
									<td align="center">客户名称</td>
									<td align="center">客户等级</td>
									<td align="center">客户经理</td>
									<td align="center">所在地区</td>
									<td align="center">操作</td>
								</tr>
								<s:iterator value="%{page.list}">
									<tr>
										<td>${cuId}</td>
										<td>${cuName}</td>
										<td>${cuLevel}</td>
										<td>
											<%-- ${user.usName} --%>
										</td>
										<td>${cuZone}</td>
										<td align="center"><a role="button"
											href="${ctx }/customer/customer-view.action?customer.cuId=${cuId}"
											class="btn btn-default">查看</a> <a role="button"
											href="${ctx }/customer/customer-edit.action?customer.cuId=${cuId}"
											class="btn btn-default">修改</a> <a role="button"
											href="#${ctx }/customer/customer-delete.action?customer.cuId=${cuId}"
											onclick="comfirmDelete($(this))" class="btn btn-default">删除</a>
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