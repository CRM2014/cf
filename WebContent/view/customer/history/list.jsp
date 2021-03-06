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
						<li><a href="${ctx }/customer/customer-list.action">客户信息管理</a></li>
						<li>客户历史订单</li>
					</ol>
				</h5>
				<!-- 页面路径结束 -->
				<h3>${customer.cuName }历史订单管理</h3>
				<!-- 导航栏开始 -->
				<ul class="nav nav-tabs col-sm-offset-6 " role="tablist">
					<li><a href="${ctx }/customer/customer/customer-view.action?customer.cuId=${customer.cuId}">基本信息</a></li>
					<li><a href="${ctx }/customer/contact-list.action?customer.cuId=${customer.cuId}">联系人管理</a></li>
					<li class="active"><a href="${ctx }/customer/history-list.action?customer.cuId=${customer.cuId}">历史订单管理</a></li>
					<li><a href="${ctx }/customer/communicate-list.action?customer.cuId=${customer.cuId}">交往记录管理</a></li>
				</ul>
				<!-- 导航栏结束 -->
								<!-- 提示开始 -->
				<%@ include file="/view/common/message.jsp"%>
				<!-- 提示结束 -->
				<!-- 数据显示与交互内容开始 -->
				<div class="workpage well well-lg">
					<form action="${ctx }/customer/history-list.action" method="post" id="main-form">
					<input type="hidden" name="customer.cuId" value=${customer.cuId }>
					<div class="form-inline">
						<div class="form-group">
							<div class="input-group">
								<div class="input-group-addon">下单时间</div>
								<input class="form-control" type="text" placeholder=""
										name="condition.orreDate" value="${condition.orreDate}">
							</div>
						</div>
						<div class="form-group">
							<div class="input-group">
								<div class="input-group-addon">订单状态</div>
								<select class="form-control" name="condition.orreStatus">
									<option value="1">已下单，未付款</option>
									<option value="2">已付款，待系统确认</option>
									<option value="3">已确认，未发货</option>
									<option value="4">已发货，未收到</option>
									<option value="5">已收到，未签字</option>
									<option value="6">订单完成</option>
								</select>
							</div>
						</div>
						<button type="submit" class="btn btn-default">
							<span class="glyphicon glyphicon-search"></span> 查询
						</button>
						</div>
					</form>
					<br> <br>
					<table class="table table-bordered" align="center" valign="middle">
						<tr>
							<td align="center">编号</td>
							<td align="center">下单日期</td>
							<td align="center">送货地址</td>
							<td align="center">订单状态</td>
							<td align="center">操作</td>
						</tr>
						<s:iterator value="%{page.list}">
							<tr>
								<td>${orreId}</td>
								<td>${orreDate}</td>
								<td>${orrePlace}</td>
								<td>${orreStatus}</td>
								<td align="center">
									<a role="button" class="btn btn-default"
									href="${ctx }/customer/history-view.action?orderRecord.orreId=${orreId}">查看
									</a>
									<a role="button" href="#${ctx }/customer/history-deleteUser.action?orderRecord.orreId=${orreId}"
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