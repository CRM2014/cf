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

					<form class="form-inline" role="form">
						<div class="form-group">
							<div class="input-group">
								<div class="input-group-addon">客户名称</div>
								<input class="form-control" type="text" placeholder="">
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

					</form>

					<br> <br>
					<table class="table table-bordered" align="center" valign="middle">
						<tr>
							<td align="center">编号</td>
							<td align="center">客户名称</td>
							<td align="center">订单金额（元）</td>
						</tr>
						<tr>
							<td align="center">1</td>
							<td></td>
							<td></td>
						</tr>
					</table>
				</div>
				<!-- 数据显示与交互内容结束 -->
				</div>
			<!-- 主要内容结束 -->
		</div>
	</div>
	
	<!-- js开始 -->
	<%@ include file="/view/common/js.jsp"%>
	<script type="text/javascript">
		var pageInfo = new PageInfo(4);
		pageInfo.generate();
	</script>
	<!-- js结束 -->

</body>
</html>