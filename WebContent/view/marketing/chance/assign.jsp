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
				<h3>指派销售机会</h3>
								<!-- 提示开始 -->
				<%@ include file="/view/common/message.jsp"%>
				<!-- 提示结束 -->
				<!-- 数据显示与交互内容开始 -->
				<div class="workpage well well-lg">
					<form class="form-horizontal" role="form"
					action="${ctx }/marketing/chance-modifySalechance.action"
						method="post">
						<div class="form-group">
							<label  class="col-sm-2 control-label">编号：</label>
							<div class="col-sm-3">
							<input type="hidden" class="form-control" name="salechance.sachId" value="${ salechance.sachId}">
								<input type="text" class="form-control" disabled value="${ salechance.sachId}">
							</div>
							<label  class="col-sm-2 control-label">机会来源：</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" disabled value="${ salechance.usOrigin}">
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">客户名称：</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" disabled value="${ salechance.usCustomerName}">
							</div>
							<label  class="col-sm-2 control-label">成功几率：</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" disabled value="${ salechance.usProbability}">
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">概要：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" disabled value="${ salechance.usMain}">
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">联系人：</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" disabled value="${ salechance.usContanct}">
							</div>
							<label  class="col-sm-2 control-label">联系电话：</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" disabled value="${ salechance.usContanctTel}">
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">机会描述：</label>
							<div class="col-sm-8">
								<textarea class="form-control" rows="3" disabled>${ salechance.usChanceDescribe}</textarea>
							</div>

						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">创建人：</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" disabled value="${ salechance.userByUsCreateId.usName}">
							</div>
							<label  class="col-sm-2 control-label">创建时间：</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" disabled value="${ salechance.usCreateTime}">
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">指派给：</label>
							<div class="col-sm-3">
							    <select class="form-control" name="userId">
									<s:iterator value="users" id="u">
										<option value="${ u.usId}">${u.usName }</option>
									</s:iterator>
								</select>
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-6">
								<button type="submit"
									class="btn btn-default btn-lg col-sm-offset-9">确认指派</button>
							</div>
							<div class="col-sm-6">
								<a role="button"
									href="${ctx }/marketing/chance-list.action"
									class="btn btn-default btn-lg">返回</a>
							</div>
						</div>
					</form>
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