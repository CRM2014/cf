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
				<h3>编辑联系人</h3>
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
								<!-- 提示开始 -->
				<%@ include file="/view/common/message.jsp"%>
				<!-- 提示结束 -->
				<!-- 数据显示与交互内容开始 -->
				<div class="workpage well well-lg">
					<form class="form-horizontal"
						action="${ctx }/customer/contact-modify.action" role="form"
						method="post">
						<input type="hidden" name="contactperson.copeId"
							value="${contactperson.copeId }">
						<div class="form-group">
							<label  class="col-sm-2 control-label">姓名：</label>
							<div class="col-sm-3">
								<input type="text" class="form-control checkable" data-content="非空"
									reg="/^\S{1,20}$/" name="contactperson.copeName"
									value="${contactperson.copeName }">
							</div>

							<label  class="col-sm-2 control-label">性别：</label>
							<div class="col-sm-3">
								<input id="copeSex" type="hidden"
									value="${contactperson.copeSex }"> <select
									class="form-control" name="contactperson.copeSex">
									<option value="男">男</option>
									<option>女</option>
								</select>
							</div>
						</div>

						<div class="form-group">
							<label  class="col-sm-2 control-label">职位：</label>
							<div class="col-sm-3">
								<input type="text" class="form-control checkable" data-content="非空"
									reg="/^[\s\S]{1,20}$/" name="contactperson.copePosition"
									value="${contactperson.copePosition }">
							</div>
						</div>

						<div class="form-group">
							<label  class="col-sm-2 control-label">办公室电话：</label>
							<div class="col-sm-3">
								<input type="text" class="form-control checkable"
									reg="/^[0-9]{6,11}$/" name="contactperson.copeTel"
									value="${contactperson.copeTel }">
							</div>
							<label  class="col-sm-2 control-label">手机：</label>
							<div class="col-sm-3">
								<input type="text" class="form-control checkable"
									reg="/^(\d{2,3}-)?\d{11}$/" name="contactperson.copePhone"
									value="${contactperson.copePhone }">
							</div>
						</div>

						<div class="form-group">
							<label  class="col-sm-2 control-label">备注：</label>
							<div class="col-sm-8">
								<textarea class="form-control" name="contactperson.copeNote">${contactperson.copeNote }</textarea>
							</div>
						</div>

						<div class="form-group">
							<div class="col-sm-6">
								<button type="submit"
									class="btn btn-default btn-lg col-sm-offset-9">保存</button>
							</div>
							<div class="col-sm-6">
								<a role="button"
									href="customer/contact-list.action?customer.cuId=${customer.cuId}"
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
		$("[name='contactperson.copeSex']").val($("#copeSex").val());
		$("form").submit(function() {
			return check();
		});
	</script>
	<!-- js结束 -->

</body>
</html>