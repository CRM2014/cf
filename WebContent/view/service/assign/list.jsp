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
						<li>服务分配列表</li>
					</ol>
				</h5>
				<!-- 页面路径结束 -->
				<h3>服务分配列表</h3>
								<!-- 提示开始 -->
				<%@ include file="/view/common/message.jsp"%>
				<!-- 提示结束 -->
				<!-- 数据显示与交互内容开始 -->
				<div class="workpage well well-lg">
					<form class="form-inline" role="form"
						action="${ctx }/service/assign-list.action" method="post">
						<div class="form-group">
							<div class="input-group">
								<div class="input-group-addon">客户</div>
								<input class="form-control" type="text" placeholder=""
									name="condition.customer.cuName"
									value="${ condition.customer.cuName}">
							</div>
						</div>

						<div class="form-group">
							<div class="input-group">
								<div class="input-group-addon">概要</div>
								<input class="form-control" type="text" placeholder=""
									name="condition.service.seMain"
									value="${ condition.service.seMain}">
							</div>
						</div>

						<div class="form-group">
							<div class="input-group">
								<div class="input-group-addon">服务类型</div>
								<input class="form-control" type="text" placeholder=""
									name="condition.service.seType"
									value="${ condition.service.seType}">
							</div>
						</div>
						<br /> <br />
						<div class="form-group">
							<div class="input-group date form_date" data-date=""
								data-date-format="yyyy MM dd" data-link-field="dtp_input2"
								data-link-format="yyyy-mm-dd">
								<div class="input-group-addon">日期</div>
								<input class="form-control" size="16" type="text" value=""
									readonly> <span class="input-group-addon"><span
									class="glyphicon glyphicon-remove"></span></span> <span
									class="input-group-addon"><span
									class="glyphicon glyphicon-calendar"></span></span>
							</div>
							<input type="hidden" id="dtp_input2"
								value="${ condition.service.seCreateTime}"
								name="condition.service.seCreateTime"><br>
						</div>
						<button type="submit" class="btn btn-default">
							<span class="glyphicon glyphicon-search"></span> 查询
						</button>
					</form>

					<br> <br>
					<table class="table table-bordered" align="center" valign="middle">
						<tr>
							<td align="center">编号</td>
							<td align="center">产品</td>
							<td align="center">客户</td>
							<td align="center">概要</td>
							<td align="center">服务类型</td>
							<td align="center">创建人</td>
							<td align="center">创建日期</td>
							<td align="center">操作</td>
						</tr>
						<tr>

							<s:iterator value="%{page.list}">

								<tr>
									<td>${secuId}</td>
									<td>${service.product.prName}</td>
									<td>${customer.cuName}</td>
									<td>${service.seMain}</td>
									<td>${service.seType}</td>
									<td>${service.user.usName}</td>
									<td>${service.seCreateTime}</td>
									<td align="center"><a role="button"
										class="btn btn-default"
										href="${ctx }/service/assign-assign.action?servicecustomer.secuId=${secuId}">分配</a></td>
							</s:iterator>
						</tr>
					</table>
					<div class="text-center">
						<!-- 分页栏开始 -->
						<%@ include file="/view/common/page.jsp"%>
						<!-- 分页栏结束 -->
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
		var pageInfo = new PageInfo(3);
		pageInfo.generate();
	</script>
	<script type="text/javascript">
		$('.form_date').datetimepicker({
			language : 'zh-CN',
			weekStart : 1,
			todayBtn : 1,
			autoclose : 1,
			todayHighlight : 1,
			startView : 2,
			minView : 2,
			forceParse : 0
		});
	</script>
	<!-- js结束 -->

</body>
</html>