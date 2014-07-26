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
						<li>客户流失管理</li>
					</ol>
				</h5>
				<!-- 页面路径结束 -->
				<h3>客户流失管理</h3>
								<!-- 提示开始 -->
				<%@ include file="/view/common/message.jsp"%>
				<!-- 提示结束 -->
				<!-- 数据显示与交互内容开始 -->
				<div class="workpage well well-lg">
					<br> <br>
					<table class="table table-bordered" align="center" valign="middle">
						<tr>
							<td align="center">客户ID</td>
							<td align="center">客户状态</td>
							<td align="center">操作</td>
						</tr>
						<s:iterator value="%{page.list}">
						<tr>
							<td>${customer.cuId}</td>
							<td>${ouflStatus}</td>
							<td align="center">
								<a role="button" class="btn btn-default"
									href="${ctx }/customer/drain-reprieve.action?outflow.ouflId=${ouflId}">暂缓流失</a> 
								<a role="button" class="btn btn-default" 
									href="${ctx }/customer/drain-confirm.action?outflow.ouflId=${ouflId}">确认流失</a>
								<a role="button" class="btn btn-default" 
								   href="#${ctx }/customer/drain-delete.action?outflow.ouflId=${ouflId}"
								   onclick="comfirmDelete($(this))">回复正常</a>
							</td>
								
						</tr>
						</s:iterator>
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
		var pageInfo = new PageInfo(2);
		pageInfo.generate();
	</script>
	<!-- js结束 -->

</body>
</html>