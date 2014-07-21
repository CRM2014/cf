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
				<!-- 数据显示与交互内容开始 -->
				<div class="workpage well well-lg">
					<diiv class="form-horizontal" role="form">
					<div class="form-group">
						<label for="inputEmail3" class="col-sm-2 control-label">编号：</label>
						<div class="col-sm-3">
							<input type="text" class="form-control" disabled
								value="${ salechance.sachId}">
						</div>
						<label for="inputEmail3" class="col-sm-2 control-label">机会来源：</label>
						<div class="col-sm-3">
							<input type="text" class="form-control" disabled
								value="${ salechance.usOrigin}">
						</div>
					</div>
					<div class="form-group">
						<label for="inputEmail3" class="col-sm-2 control-label">客户名称：</label>
						<div class="col-sm-3">
							<input type="text" class="form-control" disabled
								value="${ salechance.usCustomerName}">
						</div>
						<label for="inputEmail3" class="col-sm-2 control-label">成功几率：</label>
						<div class="col-sm-3">
							<input type="text" class="form-control" disabled
								value="${ salechance.usProbability}">
						</div>
					</div>
					<div class="form-group">
						<label for="inputEmail3" class="col-sm-2 control-label">概要：</label>
						<div class="col-sm-8">
							<input type="text" class="form-control" disabled
								value="${ salechance.usMain}">
						</div>
					</div>
					<div class="form-group">
						<label for="inputEmail3" class="col-sm-2 control-label">联系人：</label>
						<div class="col-sm-3">
							<input type="text" class="form-control" disabled
								value="${ salechance.usContanct}">
						</div>
						<label for="inputEmail3" class="col-sm-2 control-label">联系电话：</label>
						<div class="col-sm-3">
							<input type="text" class="form-control" disabled
								value="${ salechance.usContanctTel}">
						</div>
					</div>
					<div class="form-group">
						<label for="inputEmail3" class="col-sm-2 control-label">机会描述：</label>
						<div class="col-sm-8">
							<textarea class="form-control" rows="3" disabled
								value="${ salechance.usChanceDescribe}"></textarea>
						</div>
					</div>
					<div class="form-group">
						<label for="inputEmail3" class="col-sm-2 control-label">创建人：</label>
						<div class="col-sm-3">
							<input type="text" class="form-control" disabled
								value="${ salechance.userByUsCreateId.usName}">
						</div>
						<label for="inputEmail3" class="col-sm-2 control-label">创建时间：</label>
						<div class="col-sm-3">
							<input type="text" class="form-control" disabled
								value="${ salechance.usCreateTime}">
						</div>
					</div>
					<div class="form-group">
						<label for="inputEmail3" class="col-sm-2 control-label">指派给：</label>
						<div class="col-sm-3">
							<input type="text" class="form-control" disabled
								value="${ salechance.userByUsDesignationId.usName}">
						</div>
						<label for="" class="col-sm-2 control-label">创建时间：</label>
						<div class="col-sm-3">
							<input type="text" class="form-control" disabled
								value="${ salechance.usCreateTime}">
						</div>
					</div>
				</div>
				<div class="workpage well well-lg">
					<div class="form-inline">

						<table class="table table-bordered" align="center" valign="middle">

							<tr>
								<td align="center">日期</td>
								<td align="center">计划项</td>
								<td align="center">操作</td>
							</tr>

							<s:iterator value="%{developments}">
								<tr>
									<td>${deDate}</td>
									<td><input value="${dePlan}"></td>
									<td align="center"><a role="button"
										href="#${ctx }/marketing/plan-make.action?development.deId=${deId}"
										class="btn btn-default">修改</a> <a role="button"
										href="#${ctx }/marketing/plan-deleteDevelopment.action?development.deId=${deId}"
										onclick="comfirmDelete($(this))" class="btn btn-default">删除</a>
									</td>
								</tr>
							</s:iterator>
						</table>
						<form action="${ctx }/marketing/plan-addDevelopment.action"
							method="post">
							<input type="hidden" name="salechance.sachId"
								value="${salechance.sachId }">
							<div class="form-group">
								<label for="" class="col-sm-2 control-label">计划项：</label>
								<div class="col-sm-7">
									<input type="text" class="form-control"
										name="development.dePlan" value="${ development.dePlan}">
								</div>
								<button type="submit" class="btn btn-default btn-lg">保存</button>
							</div>
						</form>
					</div>
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