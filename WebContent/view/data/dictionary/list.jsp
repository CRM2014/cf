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
						<li>数据字典管理</li>
					</ol>
				</h5>
				<!-- 页面路径结束 -->
				<h3>数据字典管理</h3>
				<!-- 数据显示与交互内容开始 -->
				<form action="${ctx }/data/data-list.action" method="post"
					id="main-form">
					<div class="workpage well well-lg">
						<div class="form-inline">
							<div class="form-group">
								<div class="input-group">
									<div class="input-group-addon">类别</div>
									<input class="form-control" type="text" placeholder=""
										name="condition.dadiType" value="${condition.dadiType}">
								</div>
							</div>

							<div class="form-group">
								<div class="input-group">
									<div class="input-group-addon">条目</div>
									<input class="form-control" type="text" placeholder=""
										name="condition.dadiItem" value="${condition.dadiItem}">
								</div>
							</div>

							<div class="form-group">
								<div class="input-group">
									<div class="input-group-addon">值</div>
									<input class="form-control" type="text" placeholder=""
										name="condition.dadiValue" value="${condition.dadiValue}">
								</div>
							</div>

							<button type="submit" class="btn btn-default">
								<span class="glyphicon glyphicon-search"></span> 查询
							</button>
							<a role="button" class="btn btn-default"
								href="${ctx }/data/data-add.action" type="button"> <span
								class="glyphicon glyphicon-plus"></span> 新建
							</a>

						</div>

						<br> <br>
						<table class="table table-bordered" align="center" valign="middle">
							<tr>
								<td align="center">数据字典ID</td>
								<td align="center">类别</td>
								<td align="center">条目</td>
								<td align="center">值</td>
								<td align="center">是否可编辑</td>
								<td align="center">操作</td>
							</tr>
							<s:iterator value="%{page.list}" id="p">
								<tr>
									<td>${dadiId}</td>
									<td>${dadiType}</td>
									<td>${dadiItem}</td>
									<td>${dadiValue}</td>
									<td>${dadiEnableEdit}</td>
									<td align="center"><s:if test="#p.dadiEnableEdit!=false">
											<a role="button" class="btn btn-default"
												href="${ctx }/data/data-modify.action?dictionary.dadiId=${dadiId}">编辑</a>
										</s:if> <a role="button" class="btn btn-default"
										href="#${ctx }/data/data-deleteData.action?dictionary.dadiId=${dadiId}"
										onclick="comfirmDelete($(this))">删除</a></td>
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