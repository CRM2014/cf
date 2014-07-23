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
				<h3>客户贡献分析</h3>
				<!-- 数据显示与交互内容开始 -->
				<div class="workpage well well-lg">

				<form action="${ctx }/customer/customer-list.action" method="post"
					id="main-form">
					<div class="form-inline">
						<div class="form-group">
							<div class="input-group">
								<div class="input-group-addon">客户名称</div>
									<input class="form-control" type="text" placeholder=""
										name="condition.cuName" value="${condition.cuName}">
							</div>
						</div>

						<div class="form-group">
							<div class="input-group">
								<div class="input-group-addon">年份</div>
								<input class="form-control" type="text" placeholder="">
							</div>
						</div>
						<select class="form-control">
							<option>全部</option>
							<option>按编号</option>
							<option>按客户名称</option>
							<option>按订单金额</option>
						</select>


						<button type="submit" class="btn btn-default">
							<span class="glyphicon glyphicon-search"></span> 查询
						</button>
						<button class="btn btn-default" data-toggle="modal"
							data-target="#chart">订单数量走势</button>
					</div>
					<br> <br>
					<table class="table table-bordered" align="center" valign="middle">
						<tr>
							<td align="center" >编号</td>
							<td align="center">客户名称</td>
							<td align="center">订单金额（元）</td>
						</tr>
						<s:iterator value="page.list" status="st">
							<tr>
								<td align="center">${st.index+1 }</td>
								<s:iterator value="page.list[#st.index]" id="i">
									<td align="center">${i }</td>
								</s:iterator>
							</tr>
						</s:iterator>
					</table>
				</div>
				<!-- 数据显示与交互内容结束 -->
			</div>
			<!-- 主要内容结束 -->
		</div>
	</div>
	<!-- 统计图表开始 -->
	<div class="modal fade" id="chart" tabindex="-1" role="dialog"
		aria-labelledby="mySmallModalLabel" aria-hidden="true">
		<div class="modal-dialog modal-lg">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">
						<span aria-hidden="true">×</span><span class="sr-only">Close</span>
					</button>
					<h4 class="modal-title" id="mySmallModalLabel">订单数量走势</h4>
				</div>

				<div class="modal-body">
					<div class="row">
						<div class="col-md-offset-1 col-md-10">
							<canvas id="canvas" style="height: 450px"></canvas>
						</div>

					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- 统计图表结束 -->
	<!-- js开始 -->
	<%@ include file="/view/common/js.jsp"%>
	<script type="text/javascript">
		var pageInfo = new PageInfo(4);
		pageInfo.generate();

		$('#chart')
				.on(
						'shown.bs.modal',
						function(e) {
							$
									.ajax({
										url : '${ctx }/ajax/statistics-contribution.action',
										success : function(data, textStatus,
												jqXHR) {
											arr = eval("(" + data + ")");
											var lineChartData = {
												labels : [ "7月", "8月", "9月",
														"10月", "11月", "12月",
														"1月", "2月", "3月", "4月",
														"5月", "6月", ],
												datasets : [ {
													label : "订单数量走势",
													fillColor : "rgba(220,220,220,0.2)",
													strokeColor : "rgba(220,220,220,1)",
													pointColor : "rgba(220,220,220,1)",
													pointStrokeColor : "#fff",
													pointHighlightFill : "#fff",
													pointHighlightStroke : "rgba(220,220,220,1)",
													data : arr
												} ]

											};
											var ctx = $("#canvas").get(0)
													.getContext("2d");
											window.myLine = new Chart(ctx)
													.Line(lineChartData, {
														responsive : true
													});
										},
										error : function(jqXHR, textStatus,
												errorThrown) {
											alert(textStatus + errorThrown);
										}
									});
						});
	</script>
	<!-- js结束 -->
</body>
</html>