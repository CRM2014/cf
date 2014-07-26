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
						<li>处理服务</li>
					</ol>
				</h5>
				<!-- 页面路径结束 -->
				<h3>处理服务</h3>
								<!-- 提示开始 -->
				<%@ include file="/view/common/message.jsp"%>
				<!-- 提示结束 -->
				<!-- 数据显示与交互内容开始 -->
				<div class="workpage well well-lg">
					<form class="form-horizontal" role="form"
					action="${ctx }/service/deal-dealService.action" method="post">
						<div class="form-group">
							<label for="inputEmail3" class="col-sm-2 control-label">编号：</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" disabled
									value="${ servicecustomer.secuId}"> <input type="hidden"
									name="servicecustomer.secuId" value="${ servicecustomer.secuId}">
							</div>
							<label for="inputEmail3" class="col-sm-2 control-label">服务类型：</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" disabled
									value="${ servicecustomer.service.seType}"> 
							</div>
						</div>
						<div class="form-group">
							<label for="inputEmail3" class="col-sm-2 control-label">客户：</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" disabled
									value="${ servicecustomer.customer.cuName}"> 
							</div>
							<label for="inputEmail3" class="col-sm-2 control-label">产品：</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" disabled
									value="${ servicecustomer.service.product.prName}"> 
							</div>
						</div>
						<div class="form-group">
							<label for="inputEmail3" class="col-sm-2 control-label">概要：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" disabled
									value="${ servicecustomer.service.seMain}"> 
							</div>

						</div>
						<div class="form-group">
							<label for="inputEmail3" class="col-sm-2 control-label">创建人</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" disabled
									value="${ servicecustomer.service.user.usName}"> 
							</div>
							<label for="inputEmail3" class="col-sm-2 control-label">创建时间</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" disabled
									value="${ servicecustomer.service.seCreateTime}"> 
							</div>
						</div>

						<div class="form-group">
							<label for="inputEmail3" class="col-sm-2 control-label">分配给</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" disabled
									value="${ servicecustomer.userByUsDealId.usName}">
							</div>
							<label for="inputEmail3" class="col-sm-2 control-label">分配时间</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" disabled
									value="${ servicecustomer.secuAllocationTime}">
							</div>
						</div>
						<div class="form-group">
							<label for="inputEmail3" class="col-sm-2 control-label">服务处理：</label>
							<div class="col-sm-8">
								<textarea class="form-control checkable" reg="/^[\s\S]{1,}$/" data-content="非空"
								 rows="3" name="servicecustomer.secuDeal" value="${ servicecustomer.secuDeal}"></textarea>
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-6">
								<button type="submit" class="btn btn-default btn-lg col-sm-offset-9">保存</button>
							</div>
							<div class="col-sm-6">
								<a role="button"
									href="${ctx }/service/deal-list.action"
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
		
		$("form").submit(function() {
			return check();
		});
	</script>
	<!-- js结束 -->

</body>
</html>