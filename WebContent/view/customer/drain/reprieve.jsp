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
				<h3>暂缓客户流失</h3>
				<!-- 数据显示与交互内容开始 -->
				<div class="workpage well well-lg">
					<form class="form-horizontal" role="form"
						action="${ctx }/customer/drain-reprieveAdd.action"
						method="post">
						
						
						<input type="hidden" class="form-control" name="outflow.ouflId" value="${ outflow.ouflId}">
						<input type="text" class="form-control" name="outflow.ouflId" value="${ outflow.ouflId}" disabled>
						
						<div class="form-group">
							<label for="inputEmail3" class="col-sm-2 control-label">客户ID</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" name="outflow.customer.cuId"
									value="${ outflow.customer.cuId}" disabled>
								<input type="hidden" class="form-control" name="outflow.customer.cuId"
									value="${ outflow.customer.cuId}">
							</div>
							<label for="inputEmail3" class="col-sm-2 control-label">客户状态</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" name="outflow.ouflStatus"
									value="${ outflow.ouflStatus}" disabled>
								<input type="hidden" class="form-control" name="outflow.ouflStatus"
									value="${ outflow.ouflStatus}">
							</div>
						</div>
						<div class="form-group">
							<label for="inputEmail3" class="col-sm-2 control-label">暂缓措施</label>
							<div class="col-sm-8">
								<input class="form-control" rows="3" name="outflow.ouflAction"
									value="${ outflow.ouflAction}"></input>
							</div>

						</div>


						<div align="center">
							<button type="submit"
									class="btn btn-default ">保存</button>
							<a role="button" class="btn btn-default" href="customer/drain-list.action">返回</a>
							<a role="button" class="btn btn-default" 
									href="${ctx }/customer/drain-confirm.action?outflow.ouflId=${ouflId}">确认流失</a>
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
		var pageInfo = new PageInfo(2);
		pageInfo.generate();
	</script>
	<!-- js结束 -->

</body>
</html>