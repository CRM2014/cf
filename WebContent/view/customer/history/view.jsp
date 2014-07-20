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
				<h3>查看XX客户历史订单明细</h3>
				<!-- 导航栏开始 -->
				<ul class="nav nav-tabs col-sm-offset-6 " role="tablist">
					<li><a href="${ctx }/customer/basic/basic-list.action">基本信息</a></li>
					<li><a href="${ctx }/customer/contact/contact-list.action">联系人管理</a></li>
					<li class="active"><a href="${ctx }/customer/history/history-list.action">历史订单管理</a></li>
					<li><a href="${ctx }/customer/communicate/communicate-list.action">交往记录管理</a></li>
				</ul>
				<!-- 导航栏结束 -->
				<!-- 数据显示与交互内容开始 -->
				<div class="workpage well well-lg">
					<form class="form-horizontal" role="form"
						action="${ctx }/customer/history/history-view.action"
						method="post">
						<div class="form-group">
							<label for="inputEmail3" class="col-sm-2 control-label">编号：</label>
							<div class="col-sm-3">${orderRecord.orreID}</div>
							<label for="inputEmail3" class="col-sm-2 control-label">客户：</label>
							<div class="col-sm-3">${orderRecord.customer.cuName}</div>
						</div>
						<div class="form-group">
							<label for="inputEmail3" class="col-sm-2 control-label">下单时间：</label>
							<div class="col-sm-3">${orderRecord.orreDate}</div>
							<label for="inputEmail3" class="col-sm-2 control-label">订单状态：</label>
							<div class="col-sm-3">${orderRecord.orreStatus}</div>
						</div>
						<div class="form-group">
							<label for="inputEmail3" class="col-sm-2 control-label">送货地址：</label>
							<div class="col-sm-8">${orderRecord.orrePlace}</div>
						</div>
						<br>
						<div class="form-group">
							<label for="inputEmail3" class="col-sm-2 control-label">订单明细：</label>
							<div class="panel panel-default">
								<!-- Default panel contents -->
								<div class="panel-heading">Panel heading</div>
								<!-- Table -->
								<table class="table">
									<tr>
										<td align="center">产品编号</td>
										<td align="center">产品名称</td>
										<td align="center">数量</td>
									</tr>
									<s:iterator value="%{page.list.orderrecordproducts}">
										<tr>
											<td align="center">${product.prId}</td>
											<td align="center">${product.prName}</td>
											<td align="center">${orreprID}</td>
										</tr>
									</s:iterator>
								</table>
							</div>
						</div>
						<div align="center">
							<a role="button" class="btn btn-default" href="customer/history-list.action">返回</a>
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
		var pageInfo = new PageInfo(2);
		pageInfo.generate();
	</script>
	<!-- js结束 -->

</body>
</html>