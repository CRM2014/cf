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
						<li>创建数据字典目录</li>
					</ol>
				</h5>
				<!-- 页面路径结束 -->
				<h3>创建数据字典目录</h3>
								<!-- 提示开始 -->
				<%@ include file="/view/common/message.jsp"%>
				<!-- 提示结束 -->
				<!-- 数据显示与交互内容开始 -->
				<div class="workpage well well-lg">
					<form class="form-horizontal"
						action="${ctx }/data/data-addData.action" role="form"
						method="post">

						<div class="form-group">
							<label 
								class="col-sm-3 col-sm-offset-1 control-label">类别：</label>
							<div class="col-sm-4">
								<input type="text" class="form-control checkable" reg="/^\S{1,20}$/" data-content="非空"
									name="dictionary.dadiType">
							</div>
						</div>
						<div class="form-group">
							<label 
								class="col-sm-3 col-sm-offset-1 control-label">条目：</label> 
							<div class="col-sm-4">
								<input type="text" class="form-control checkable" reg="/^[\s\S]{1,20}$/" data-content="非空"
									name="dictionary.dadiItem">
							</div>
						</div>
						<div class="form-group">
							<label 
								class="col-sm-3 col-sm-offset-1 control-label">值：</label>
							<div class="col-sm-4">
								<input type="text" class="form-control checkable" reg="/^\d{1,20}$/" data-content="数字"
									name="dictionary.dadiValue">
							</div>
						</div>
						<div class="form-group">
							<label 
								class="col-sm-3 col-sm-offset-1 control-label">是否可编辑：</label>
							<div class="col-sm-4">
								<input type="hidden" id="dadiEnableEdit"> <select
									class="form-control" name="dictionary.dadiEnableEdit">
									<option value="true">可以</option>
									<option value="false">不能</option>
								</select>
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-6">
								<button type="submit"
									class="btn btn-default btn-lg col-sm-offset-9">保存</button>
							</div>
							<div class="col-sm-6">
								<a role="button" href="${ctx }/data/data-list.action"
									class="btn btn-default btn-lg">返回</a>
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
			
			$("form").submit(function() {
				return check();
			});
		</script>
		<!-- js结束 -->
</body>
</html>