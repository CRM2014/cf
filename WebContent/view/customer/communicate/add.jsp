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
				<h3>添加XX客户交往记录</h3>
				<!-- 导航栏开始 -->
				<ul class="nav nav-tabs col-sm-offset-6 " role="tablist">
					<li><a href="${ctx }/customer/basic/basic-list.action">基本信息</a></li>
					<li><a href="${ctx }/customer/contact/contact-list.action">联系人管理</a></li>
					<li><a href="${ctx }/customer/history/history-list.action">历史订单管理</a></li>
					<li class="active"><a href="${ctx }/customer/communicate/communicate-list.action">交往记录管理</a></li>
				</ul>
				<!-- 导航栏结束 -->
				<!-- 数据显示与交互内容开始 -->
				<div class="workpage well well-lg">
					<form class="form-horizontal" role="form"
						action="${ctx }/customer/cummunicate/communicate-addUser.action"
						method="post">
						<div class="form-group">
							<label for="inputEmail3" class="col-sm-2 control-label">编号：</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" name="contactRecord.coreId"
									value="${ contactRecord.coreId}">
							</div>
							<label for="inputEmail3" class="col-sm-2 control-label">客户：</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" name="contactRecord.customer.cuName"
									value="${ contactRecord.customer.cuName}">
							</div>
						</div>
						<div class="form-group">
							<label for="inputEmail3" class="col-sm-2 control-label">交往时间：</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" name="contactRecord.coreDate"
									value="${ contactRecord.coreDate}">
							</div>
							<label for="inputEmail3" class="col-sm-2 control-label">交往地点：</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" name="contactRecord.corePlace"
									value="${ contactRecord.corePlace}">
							</div>
						</div>
						<div class="form-group">
							<label for="inputEmail3" class="col-sm-2 control-label">概要：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" name="contactRecord.coreMain"
									value="${ contactRecord.coreMain}">
							</div>
						</div>
						<div class="form-group">
							<label for="inputEmail3" class="col-sm-2 control-label">描述：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" name="contactRecord.coreDescription"
									value="${ contactRecord.coreDescription}">
							</div>
						</div>
						<div class="form-group">
							<label for="inputEmail3" class="col-sm-2 control-label">详情：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" name="contactRecord.coreDetail"
									value="${ contactRecord.coreDetail}">
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-6">
								<button type="submit"
									class="btn btn-default btn-lg col-sm-offset-9">保存</button>
							</div>
							<div class="col-sm-6">
								<a role="button" href="${ctx }/customer/communicate/communicate-list.action"
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