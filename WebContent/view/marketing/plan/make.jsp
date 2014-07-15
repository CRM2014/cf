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
				<!-- 数据显示与交互内容开始 -->
				<div class="workpage well well-lg">
					<form class="form-horizontal" role="form">
						<div class="form-group">
							<label for="inputEmail3" class="col-sm-2 control-label">编号：</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" id="" disabled>
							</div>
							<label for="inputEmail3" class="col-sm-2 control-label">机会来源：</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" id="" disabled>
							</div>
						</div>
						<div class="form-group">
							<label for="inputEmail3" class="col-sm-2 control-label">客户名称：</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" id="" disabled>
							</div>
							<label for="inputEmail3" class="col-sm-2 control-label">成功几率：</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" id="" disabled>
							</div>
						</div>
						<div class="form-group">
							<label for="inputEmail3" class="col-sm-2 control-label">概要：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="" disabled>
							</div>
						</div>
						<div class="form-group">
							<label for="inputEmail3" class="col-sm-2 control-label">联系人：</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" id="" disabled>
							</div>
							<label for="inputEmail3" class="col-sm-2 control-label">联系电话：</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" id="" disabled>
							</div>
						</div>
						<div class="form-group">
							<label for="inputEmail3" class="col-sm-2 control-label">机会描述：</label>
							<div class="col-sm-8">
								<textarea class="form-control" rows="3" disabled></textarea>
							</div>
						</div>
						<div class="form-group">
							<label for="inputEmail3" class="col-sm-2 control-label">创建人：</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" id="" disabled>
							</div>
							<label for="inputEmail3" class="col-sm-2 control-label">创建时间：</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" id="" disabled>
							</div>
						</div>
						<div class="form-group">
							<label for="inputEmail3" class="col-sm-2 control-label">指派给：</label>
							<div class="col-sm-3">
								<select class="form-control" disabled>
									<option>1</option>
									<option>2</option>
									<option>3</option>
									<option>4</option>
									<option>5</option>
								</select>
							</div>
                            <label for="" class="col-sm-2 control-label">创建时间：</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" id="Text1" disabled>
							</div>
							
						</div>
					</form>
               <div class="workpage well well-lg"> 
                   	<table class="table table-bordered" align="center" valign="middle">
						<tr>
							<td align="center">日期</td>
							<td align="center">计划项</td>
							<td align="center">操作</td>
						</tr>
						<tr>
							<td></td>
							<td><input type="text" class="form-control" id="Text3" ></td>
							<td align="center">
								 <a role="button" href="../marketing.plan/execute.jsp" class="btn btn-default">修改</a>
								 <a role="button" class="btn btn-default">删除</a>
							</td>
						</tr>
					</table>
                   	<form class="form-form-inline" role="form">
                           <div class="form-group">
							<label for="" class="col-sm-2 control-label">计划项：</label>
							<div class="col-sm-7">
								<input type="text" class="form-control" id="Text2" >
							</div>
                               
						 <a role="button" href="../marketing.plan/make.jsp" class="btn btn-default btn-lg"> <span class="glyphicon glyphicon-save"></span>保存</a>
					
						</div>
                           </form>
                   </div>
				</div>
				<!-- 数据显示与交互内容结束 -->
				</div>
			<!-- 主要内容结束 -->
		</div>
	</div>
	
	<!-- js开始 -->
	<%@ include file="/view/common/js.jsp"%>
	<script type="text/javascript">
		var pageInfo = new PageInfo(3);
		pageInfo.generate();
	</script>
	<!-- js结束 -->

</body>
</html>