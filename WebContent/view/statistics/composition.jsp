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
						<li>统计报表</li>
						<li>客户构成分析</li>
					</ol>
				</h5>
				<!-- 页面路径结束 -->
				<h3>客户构成分析</h3>
				<!-- 数据显示与交互内容开始 -->
				<form action="${ctx }/permission/permission-list.action"
					method="post" id="main-form">
					<div class="workpage well well-lg">

						<div class="form-inline" role="form">

							<select class="form-control">
								<option>全部</option>
								<option>按编号</option>
								<option>按等级</option>
								<option>按客户数量</option>
							</select>

							<button type="submit" class="btn btn-default">
								<span class="glyphicon glyphicon-search"></span> 查询
							</button>
							<a role="button" class="btn btn-default" data-toggle="modal"
								data-target="#chart">客户构成比例</a>
						</div>

						<br> <br>
						<table class="table table-bordered" align="center" valign="middle">
							<tr>
								<td align="center">编号</td>
								<td align="center">等级</td>
								<td align="center">客户数量</td>
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
				</form>
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
					<h4 class="modal-title" id="mySmallModalLabel">客户构成比例</h4>
				</div>

				<div class="modal-body">
					<div class="row">
						<div class="col-md-offset-1 col-md-5">
							<canvas id="canvas" width="300" height="300" />
						</div>
						<div>
							<br>
							<h4>
								1级客户：<span id="cuNum-1"></span>
							</h4>
							<br>
							<h4>
								2级客户：<span id="cuNum-2"></span>
							</h4>
							<br>
							<h4>
								3级客户：<span id="cuNum-3"></span>
							</h4>
							<br>
							<h4>
								4级客户：<span id="cuNum-4"></span>
							</h4>
							<br>
							<h4>
								5级客户：<span id="cuNum-5"></span>
							</h4>

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

		$('#chart').on('shown.bs.modal', function(e) {
			$.ajax({
				url : '${ctx }/ajax/statistics-conposition.action;',
				success : function(data, textStatus, jqXHR) {
					console.info(data);
					value = eval("(" + data + ")");
					var pieData = [ {
						value : 0,
						color : "#F7464A",
						highlight : "#FF5A5E",
						label : "1级客户"
					}, {
						value : 0,
						color : "#46BFBD",
						highlight : "#5AD3D1",
						label : "2级客户"
					}, {
						value : 0,
						color : "#FDB45C",
						highlight : "#FFC870",
						label : "3级客户"
					}, {
						value : 0,
						color : "#949FB1",
						highlight : "#A8B3C5",
						label : "4级客户"
					}, {
						value : 0,
						color : "#4D5360",
						highlight : "#616774",
						label : "5级客户"
					} ];
					for (var i = 0; i < pieData.length; i++) {
						pieData[i].value = Number(value[0][i]);
						$("#cuNum-" + (i + 1)).html(value[0][i]);
					}
					var ctx = $("#canvas").get(0).getContext("2d");
					window.myPie = new Chart(ctx).Pie(pieData);
				},
				error : function(jqXHR, textStatus, errorThrown) {
					alert(textStatus + errorThrown);
				}
			});

		});
	</script>
	<!-- js结束 -->

</body>
</html>