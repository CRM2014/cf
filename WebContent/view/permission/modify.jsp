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
				<h3>编辑用户</h3>
				<!-- 提示开始 -->
				<%@ include file="/view/common/message.jsp"%>
				<!-- 提示结束 -->
				<!-- 数据显示与交互内容开始 -->
				<div class="workpage well well-lg">
					<form class="form-horizontal" role="form"
						action="${ctx }/permission/permission-modifyUser.action"
						method="post">
						<div class="form-group">
							<label class="col-sm-3 col-sm-offset-1 control-label">编号：</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" disabled
									value="${ user.usId}"> <input type="hidden"
									name="user.usId" value="${ user.usId}">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-3 col-sm-offset-1 control-label">用户名：</label>
							<div class="col-sm-4">
								<input type="text" class="form-control"
									reg="/^[a-zA-Z0-9]{2,10}$/" data-content="2-10个字母或数字"
									name="user.usUserName" value="${ user.usUserName}" disabled>
							</div>
						</div>

						<div class="form-group">
							<label class="col-sm-3 col-sm-offset-1 control-label">用户姓名：</label>
							<div class="col-sm-4">
								<input type="text" class="form-control checkable"
									reg="/^[\s\S]{2,10}$/" data-content="2-10个字符"
									name="user.usName" value="${ user.usName}">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-3 col-sm-offset-1 control-label">用户角色：</label>
							<div class="col-sm-4">
								<input type="hidden" value="${ user.usRole}" id="usRole">
								<select class="form-control" name="user.usRole">
									<s:iterator value="roles" id="r">
										<option>${r}</option>
									</s:iterator>
								</select>
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-6">
								<button type="submit"
									class="btn btn-default btn-lg col-sm-offset-9">保存</button>
							</div>
							<div class="col-sm-6">
								<a role="button"
									href="${ctx }/permission/permission-list.action"
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
		var pageInfo = new PageInfo(6);
		pageInfo.generate();
		$("[name='user.usRole']").val($("#usRole").val());

		$("form").submit(function() {
			var b = check();
			if (b) {
				$.ajax({
					url : '${ctx }/ajax/permission-checkExistUserName.action;',
					async : false,
					data : {
						data : $("[name='user.usUserName']").val()
					},
					success : function(data, textStatus, jqXHR) {
						var obj = eval(data);
						if (obj == true) {
							b = true;
						} else {
							b = false;
							var e = $("[name='user.usUserName']");
							var orig = e.attr("data-content");
							e.attr("data-content", "用户名已存在");
							e.popover('show');
							e.attr("data-content", orig);
						}
					}
				});
			}
			return b;
		});
	</script>
	<!-- js结束 -->

</body>
</html>