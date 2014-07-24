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
						<li>客户基本信息</li>
					</ol>
				</h5>
				<!-- 页面路径结束 -->
				<h3>编辑客户基本信息</h3>
				<!-- 导航栏开始 -->
				<ul class="nav nav-tabs col-sm-offset-6 " role="tablist">
					<li class="active"><a
						href="${ctx }/customer/customer/customer-view.action?customer.cuId=${customer.cuId}">基本信息</a></li>
					<li><a
						href="${ctx }/customer/contact/contact-list.action?customer.cuId=${customer.cuId}">联系人管理</a></li>
					<li><a
						href="${ctx }/customer/history/history-list.action?customer.cuId=${customer.cuId}">历史订单管理</a></li>
					<li><a
						href="${ctx }/customer/communicate/communicate-list.action?customer.cuId=${customer.cuId}">交往记录管理</a></li>
				</ul>
				<!-- 导航栏结束 -->
				<!-- 数据显示与交互内容开始 -->
				<div class="workpage well well-lg">
					<form class="form-horizontal" role="form"
						action="${ctx}/customer/customer-save.action" method="post">
						<div class="form-group">
							<label for="name" class="col-sm-2 control-label">客户名称：</label>
							<div class="col-sm-3">
								<input type="text" class="form-control checkable" name="customer.cuName"
									value="${customer.cuName}"> <input type="hidden"
									name="customer.cuId" value="${customer.cuId}">
							</div>

							<label for="zone" class="col-sm-2 control-label">所在地区：</label>
							<div class="col-sm-3">
								<input type="text" class="form-control checkable" name="customer.cuZone"
									value="${customer.cuZone}">
							</div>
						</div>

						<div class="form-group">
							<label for="level" class="col-sm-2 control-label">客户等级：</label>
							<div class="col-sm-3">
								<input type="text" class="form-control checkable" name="customer.cuLevel"
									value="${customer.cuLevel}">
							</div>
							<label for="credit" class="col-sm-2 control-label">信 用 度：</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" name="customer.cuCredit"
									value="${customer.cuCredit}">
							</div>
						</div>

						<div class="form-group">
							<label for="addr" class="col-sm-2 control-label">地 址：</label>
							<div class="col-sm-3">
								<input type="text" class="form-control checkable"
									name="customer.cuAddress" value="${customer.cuAddress}">
							</div>
							<label for="postal" class="col-sm-2 control-label">邮政编码：</label>
							<div class="col-sm-3">
								<input type="text" class="form-control checkable" name="customer.cuPostal"
									value="${customer.cuPostal}">
							</div>
						</div>

						<div class="form-group">
							<label for="tel" class="col-sm-2 control-label">电 话：</label>
							<div class="col-sm-3">
								<input type="text" class="form-control checkable" reg="/^(d{3,4}-)?[1-9]d{6,7}$/" name="customer.cuTel"
									value="${customer.cuTel}">
							</div>
							<label for="fac" class="col-sm-2 control-label">传 真：</label>
							<div class="col-sm-3">
								<input type="text" class="form-control"
									name="customer.cuFacsimile" value="${customer.cuFacsimile}">
							</div>
						</div>

						<div class="form-group">
							<label for="relation" class="col-sm-2 control-label">联系方式：</label>
							<div class="col-sm-3">
								<input type="text" class="form-control checkable" reg="/^(+d{2,3}-)?d{11}$/ 
									name="customer.cuRelation" value="${customer.cuRelation}">
							</div>
							<label for="legal" class="col-sm-2 control-label">法 人：</label>
							<div class="col-sm-3">
								<input type="text" class="form-control checkable" name="customer.cuLegal"
									value="${customer.cuLegal}">
							</div>
						</div>

						<div class="form-group">
							<label for="web" class="col-sm-2 control-label">公司网址：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control checkable" name="customer.cuWeb"
									value="${customer.cuWeb}">
							</div>
						</div>

						<div class="form-group">
							<label for="bank" class="col-sm-2 control-label">开户银行：</label>
							<div class="col-sm-3">
								<input type="text" class="form-control checkable" name="customer.cuBank"
									value="${customer.cuBank}">
							</div>
							<label for="bankAccount" class="col-sm-2 control-label">银行账号：</label>
							<div class="col-sm-3">
								<input type="text" class="form-control checkable" reg="^\S{0,19}$"
									name="customer.cuBankAccount" value="${customer.cuBankAccount}">
							</div>
						</div>

						<div class="form-group">
							<label for="registerCapital" class="col-sm-2 control-label">注册资金：</label>
							<div class="col-sm-3">
								<input type="text" class="form-control"
									name="customer.cuRegisterCapital"
									value="${customer.cuRegisterCapital}">
							</div>
							<label for="turnoverNum" class="col-sm-2 control-label">年营业额：</label>
							<div class="col-sm-3">
								<input type="text" class="form-control"
									name="customer.cuTurnover" value="${customer.cuTurnover}">
							</div>
						</div>

						<div class="form-group">
							<label for="landTaxNum" class="col-sm-2 control-label">营业执照注册号：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control checkable"
									name="customer.cuTurnoverNum" value="${customer.cuTurnoverNum}">
							</div>
						</div>

						<div class="form-group">
							<label for="landTaxNum" class="col-sm-2 control-label">地税登记号：</label>
							<div class="col-sm-3">
								<input type="text" class="form-control checkable"
									name="customer.cuLandTaxNum" value="${customer.cuLandTaxNum}">
							</div>
							<label for="NationTaxNum" class="col-sm-2 control-label">国税登记号：</label>
							<div class="col-sm-3">
								<input type="text" class="form-control checkable"
									name="customer.cuNationTaxNum"
									value="${customer.cuNationTaxNum}">
							</div>
						</div>

						<div class="form-group">
							<label for="usName" class="col-sm-2 control-label">所属客户经理：</label>
							<div class="col-sm-3">
								<input type="hidden" id="userId" value="${customer.user.usId}">
								<select class="form-control" name="userId">
									<s:iterator value="users" id="u">
										<option value="${ u.usId}">${u.usName }</option>
									</s:iterator>
								</select>
							</div>
							<label for="satisfy" class="col-sm-2 control-label">客户满意度：</label>
							<div class="col-sm-3">
								<input type="text" class="form-control"
									name="customer.cuSatisfy" value="${customer.cuSatisfy}">
							</div>
						</div>

						<div class="form-group">
							<div class="col-sm-6">
								<button type="submit"
									class="btn btn-default btn-lg col-sm-offset-9">保存</button>
							</div>
							<div class="col-sm-6">
								<a role="button" href="customer/customer-list.action"
									class="btn btn-default btn-lg col-sm-offset-9">返回</a>
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

		$("[name='userId']").val($("#userId").val());
		
		$("form").submit(function() {
			return check();
		});
	</script>
	<!-- js结束 -->

</body>
</html>
