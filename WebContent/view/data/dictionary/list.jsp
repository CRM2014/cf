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
				<h3>数据字典管理</h3>
				<!-- 数据显示与交互内容开始 -->
				<div class="workpage well well-lg">

					<form class="form-inline" role="form">
						<div class="form-group">
							<div class="input-group">
								<div class="input-group-addon">类别</div>
								<input class="form-control" type="text" placeholder="">
							</div>
						</div>

						<div class="form-group">
							<div class="input-group">
								<div class="input-group-addon">条目</div>
								<input class="form-control" type="text" placeholder="">
							</div>
						</div>

						<div class="form-group">
							<div class="input-group">
								<div class="input-group-addon">值</div>
								<input class="form-control" type="text" placeholder="">
							</div>
						</div>

						<button type="submit" class="btn btn-default">
							<span class="glyphicon glyphicon-search"></span> 查询
						</button>
						<a role="button" class="btn btn-default" 
							href="${ctx }/data/data-add.action" type="button"> 
							<span class="glyphicon glyphicon-plus"></span> 新建
						</a>

					</form>

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
						<tr>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
							<td align="center"><a role="button" class="btn btn-default"
								href="modify.html">修改
									</button> <a role="button" class="btn btn-default" href="list.html">删除
										</button></td>
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
		var pageInfo = new PageInfo(5);
		pageInfo.generate();
	</script>
	<!-- js结束 -->

</body>
</html>