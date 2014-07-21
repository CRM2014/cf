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
						<li><a href="${ctx }/customer/basic/customer-list.action">客户信息管理</a></li>
						<li>交往记录</li>
					</ol>
				</h5>
				<!-- 页面路径结束 -->
				<h3>${customer.cuName }交往记录管理</h3>
				<!-- 导航栏开始 -->
				<ul class="nav nav-tabs col-sm-offset-6 " role="tablist">
					<li><a href="${ctx }/customer/basic/basic-list.action?customer.cuId=${customer.cuId}">基本信息</a></li>
					<li><a href="${ctx }/customer/contact/contact-list.action?customer.cuId=${customer.cuId}">联系人管理</a></li>
					<li><a href="${ctx }/customer/history/history-list.action?customer.cuId=${customer.cuId}">历史订单管理</a></li>
					<li class="active"><a href="${ctx }/customer/communicate/communicate-list.action?customer.cuId=${customer.cuId}">交往记录管理</a></li>
				</ul>
				<!-- 导航栏结束 -->
				<!-- 数据显示与交互内容开始 -->
				<div class="workpage well well-lg">
					<form action="${ctx }/communicate/communicate-list.action?customer.cuId=${customer.cuId}" method="post" id="main-form">
					<div class="form-inline">
						<div class="form-group">
							<div class="input-group">
								<div class="input-group-addon">交往时间</div>
								<input class="form-control" type="text" placeholder=""
										name="condition.coreDate" value="${condition.coreDate}">
							</div>
						</div>
						<div class="form-group">
							<div class="input-group">
								<div class="input-group-addon">交往地址</div>
								<input class="form-control" type="text" placeholder=""
										name="condition.corePlace" value="${condition.corePlace}">
							</div>
						</div>

						<button type="submit" class="btn btn-default">
							<span class="glyphicon glyphicon-search"></span> 查询
						</button>
						<a role="button" class="btn btn-default"
							href="${ctx }/customer/communicate/communicate-add.action">
							<span class="glyphicon glyphicon-plus"></span>新建
						</a>
						</div>
					</form>
					<br> <br>
					<table class="table table-bordered" align="center" valign="middle">
						<tr>
							<td align="center">编号</td>
							<td align="center">交往日期</td>
							<td align="center">交往地址</td>
							<td align="center">概要</td>
							<td align="center">操作</td>
						</tr>
						<s:iterator value="%{page.list}">
							<tr>
								<td>${coreId}</td>
								<td>${coreDate}</td>
								<td>${corePlace}</td>
								<td>${coreMain}</td>
								<td align="center">
									<a role="button" class="btn btn-default"
									href="${ctx }/customer/communicate/communicate-view.action?contactRecord.coreId=${coreId}">查看
									</a>
									<a role="button" class="btn btn-default"
									href="${ctx }/customer/communicate/communicate-edit.action?contactRecord.coreId=${coreId}">修改
									</a>
									<a role="button" href="#${ctx }/customer/communicate/communicate-deleteUser.action?contactRecord.coreId=${coreId}"
									onclick="comfirmDelete($(this))" class="btn btn-default">删除
									</a>
								</td>
							</tr>
						</s:iterator>
					</table>
					<!-- 分页栏开始 -->
					<%@ include file="/view/common/page.jsp"%>
					<!-- 分页栏结束 -->
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