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
						<li>数据基础</li>
						<li>产品信息查询</li>
					</ol>
				</h5>
				<!-- 页面路径结束 -->
				<h3>产品信息查询</h3>
								<!-- 提示开始 -->
				<%@ include file="/view/common/message.jsp"%>
				<!-- 提示结束 -->
				<!-- 数据显示与交互内容开始 -->
				<form action="${ctx }/data/product-list.action" method="post"
					id="main-form">
					<div class="workpage well well-lg">

						<div class="form-inline">
							<div class="form-group">
								<div class="input-group">
									<div class="input-group-addon">产品名称</div>
									<input class="form-control" type="text" placeholder=""
										name="condition.prName" value="${condition.prName}">
								</div>
							</div>

							<div class="form-group">
								<div class="input-group">
									<div class="input-group-addon">产品型号</div>
									<input class="form-control" type="text" placeholder=""
										name="condition.prModel" value="${condition.prModel}">
								</div>
							</div>

							<button type="submit" class="btn btn-default">
								<span class="glyphicon glyphicon-search"></span> 查询
							</button>

						</div>

						<br> <br>
						<table class="table table-bordered" align="center" valign="middle">
							<tr>
								<td align="center">产品名称</td>
								<td align="center">型号</td>
								<td align="center">等级</td>
								<td align="center">单位</td>
								<td align="center">单价</td>
								<td align="center">货位</td>
								<td align="center">件数</td>
								<td align="center">备注</td>
							</tr>
							<s:iterator value="%{page.list}">

								<tr>
									<td>${prName}</td>
									<td>${prModel}</td>
									<td>${prLevel}</td>
									<td>${prUnit}</td>
									<td>${prPrice}</td>
									<td>${prPosition}</td>
									<td>${prNumber}</td>
									<td>${prRemark}</td>
								</tr>
							</s:iterator>
						</table>
						<div class="text-center">
							<!-- 分页栏开始 -->
							<%@ include file="/view/common/page.jsp"%>
							<!-- 分页栏结束 -->
						</div>
					</div>
				</form>
				<!-- 数据显示与交互内容结束 -->
			</div>
			<!-- 主要内容结束 -->
		</div>
	</div>

	<!-- js开始 -->
	<%@ include file="/view/common/js.jsp"%>
	<script type="text/javascript">
		var pageInfo = new PageInfo(5);
		pageInfo.generate();
	</script>
	<!-- js结束 -->

</body>
</html>