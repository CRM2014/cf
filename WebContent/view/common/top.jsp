<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="navbar navbar-fixed-top">
	<div class="container-fluid nopading navbar-header">
		<a href="#"> <img alt="" src="${ctx}/resourse/image/logo.png"
			width="250px" class="webicon-header" height="35px"></a>

		<div class="webname-header">
			<label class="webname-text">CF客户关系管理系统</label>
		</div>
		<div class="btn-group webbtn-header">
			<button class="btn btn-default dropdown-toggle"
				data-toggle="dropdown">
				${currentUser.usName }（${currentUser.usRole }）<span class="caret"></span>
			</button>
			<ul class="dropdown-menu" role="menu">
				<li><a data-toggle="modal" href="#" data-target="#modal-logout">注销</a></li>
				<li><a href="${ctx }/account/account-user.action">个人中心</a></li>
			</ul>
		</div>
	</div>
</div>

<!-- 注销确认框开始 -->
<div class="modal fade" tabindex="-1" role="dialog" id="modal-logout">
	<div class="modal-dialog modal-sm">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">
					<span aria-hidden="true">×</span><span class="sr-only">Close</span>
				</button>
				<h4 class="modal-title" id="mySmallModalLabel">确认注销？</h4>
			</div>
			<div class="modal-body">
				<a href="${ctx }/account/account-logoutUser.action">确认</a>
			</div>
		</div>
	</div>
</div>
<!-- 注销确认框结束 -->

<!-- 删除确认框开始 -->
<div class="modal fade" tabindex="-1" role="dialog" id="modal-delete">
	<div class="modal-dialog modal-sm">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">
					<span aria-hidden="true">×</span><span class="sr-only">Close</span>
				</button>
				<h4 class="modal-title">确认删除？</h4>
			</div>
			<div class="modal-body">
				<a id="modal-delete-link" href="#">确认</a>
			</div>
		</div>
	</div>
</div>
<!-- 删除确认框结束 -->