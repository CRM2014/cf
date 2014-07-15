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
				<h3>添加联系人</h3>
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
					<form class="form-horizontal" role="form">

						<div class="form-group">
							<label for="name" class="col-sm-2 control-label">姓名：</label>
							<div class="col-sm-3">
								<input type="email" class="form-control" id="customerName">
							</div>

							<label for="sex" class="col-sm-2 control-label">性别：</label>
							<div class="col-sm-3">
								<input type="email" class="form-control" id="">
							</div>
						</div>

						<div class="form-group">
							<label for="level" class="col-sm-2 control-label">职位：</label>
							<div class="col-sm-3">
								<input type="email" class="form-control" id="">
							</div>
						</div>

						<div class="form-group">
							<label for="tel" class="col-sm-2 control-label">办公室电话：</label>
							<div class="col-sm-3">
								<input type="email" class="form-control" id="">
							</div>
							<label for="phone" class="col-sm-2 control-label">手机：</label>
							<div class="col-sm-3">
								<input type="email" class="form-control" id="">
							</div>
						</div>

						<div class="form-group">
							<label for="note" class="col-sm-2 control-label">备注：</label>
							<div class="col-sm-8">
								<textarea type="email" class="form-control" rows="3"></textarea>
							</div>
						</div>

						<div class="form-group">
							<div class="col-sm-6">
								<a role="button" href="customer/contact-view.action"
									class="btn btn-default btn-lg col-sm-offset-9">保存</a>
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
		var pageInfo = new PageInfo(3);
		pageInfo.generate();
	</script>
	<!-- js结束 -->

</body>
</html>