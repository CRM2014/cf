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
						<li>营销管理</li>
						<li>销售机会管理</li>
					</ol>
				</h5>
				<!-- 页面路径结束 -->
				<h3>销售机会管理</h3>
				<!-- 数据显示与交互内容开始 -->
				<div class="workpage well well-lg">

					<form class="form-inline" role="form"
					action="${ctx }/marketing/chance-list.action"
						method="post">
						<div class="form-group">
							<div class="input-group">
								<div class="input-group-addon">客户名称</div>
								<input class="form-control" type="text" placeholder=""
									name="salechance.usCustomerName"
									value="${ salechance.usCustomerName}">
							</div>
						</div>

						<div class="form-group">
							<div class="input-group">
								<div class="input-group-addon">概要</div>
								<input class="form-control" type="text" placeholder=""
									name="salechance.usMain" value="${ salechance.usMain}">
							</div>
						</div>

						<div class="form-group">
							<div class="input-group">
								<div class="input-group-addon">联系人</div>
								<input class="form-control" type="text" placeholder=""
									name="salechance.usContanct" value="${ salechance.usContanct}">
							</div>
						</div>

						<button type="submit" class="btn btn-default">
							<span class="glyphicon glyphicon-search"></span> 查询
						</button>
						<a role="button" class="btn btn-default"
							href="${ctx }/marketing/chance-add.action"
							type="button"> <span class="glyphicon glyphicon-plus"></span>新建
						</a>

					</form>

					<br> <br>
					<table class="table table-bordered" align="center" valign="middle">
						<tr>
							<td align="center">编号</td>
							<td align="center">客户名称</td>
							<td align="center">概要</td>
							<td align="center">联系人</td>
							<td align="center">联系人电话</td>
							<td align="center">创建时间</td>
							<td align="center">操作</td>
						</tr>
						<s:iterator value="%{page.list}">
							<tr>
								<td>${sachId}</td>
								<td>${usCustomerName}</td>
								<td>${usMain}</td>
								<td>${usContanct}</td>
								<td>${usContanctTel}</td>
								<td>${usCreateTime}</td>

								<td align="center"><a role="button"
									href="${ctx }/marketing/chance-assign.action?salechance.sachId=${sachId}"
									class="btn btn-default">分配</a> <a role="button"
									href="${ctx }/marketing/plan-make.action?salechance.sachId=${sachId}"
									class="btn btn-default">制定开发计划</a> <a role="button"
									href="#${ctx }/marketing/chance-deleteSalechance.action?salechance.sachId=${sachId}"
									onclick="comfirmDelete($(this))" class="btn btn-default">删除</a></td>
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
		var pageInfo = new PageInfo(1);
		pageInfo.generate();
	</script>
	<!-- js结束 -->

</body>
</html>