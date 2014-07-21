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
				<h3>查看联系人</h3>
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
				<div class="workpage well well-lg">
					<form class="form-horizontal" role="form">

						<div class="form-group">
							<label for="name" class="col-sm-2 control-label">姓名：</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" disabled="disabled"
									name="contactperson.copeName" value="${contactperson.copeName }">
							</div>

							<label for="sex" class="col-sm-2 control-label">性别：</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" disabled="disabled"
									name="contactperson.copeSex" value="${contactperson.copeSex }">
							</div>
						</div>

						<div class="form-group">
							<label for="level" class="col-sm-2 control-label">职位：</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" disabled="disabled"
									name="contactperson.copePosition" value="${contactperson.copePosition }">
							</div>
						</div>

						<div class="form-group">
							<label for="tel" class="col-sm-2 control-label">办公室电话：</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" disabled="disabled"
									name="contactperson.copeTel" value="${contactperson.copeTel }">
							</div>
							<label for="phone" class="col-sm-2 control-label">手机：</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" disabled="disabled"
									name="contactperson.copePhone" value="${contactperson.copePhone }">
							</div>
						</div>

						<div class="form-group">
							<label for="note" class="col-sm-2 control-label">备注：</label>
							<div class="col-sm-8">
								<textarea type="text" class="form-control" disabled="disabled"
								name="contactperson.copeNote" value="${contactperson.copeNote }">
							</textarea>
							</div>
						</div>

						<div class="form-group">
							<div class="col-sm-6">
								<a role="button" href="customer/contact-edit.action?contactperson.copeId=${contactperson.copeId}"
									class="btn btn-default btn-lg col-sm-offset-9">编辑</a>
							</div>
							<div class="col-sm-6">
								<a role="button" href="customer/contact-list.action"
									class="btn btn-default btn-lg">返回</a>
							</div>
						</div>
					</form>
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