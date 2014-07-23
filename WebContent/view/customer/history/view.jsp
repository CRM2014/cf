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
						<li>客户管理</li>
						<li><a href="${ctx }/customer/customer-list.action">客户信息管理</a></li>
						<li><a href="${ctx }/customer/history-list.action?customer.cuId=${customer.cuId}">客户信息管理</a></li>
						<li>历史订单详情</li>
					</ol>
				</h5>
				<!-- 页面路径结束 -->
				<h3>查看${customer.cuName }历史订单明细</h3>
				<!-- 导航栏开始 -->
				<ul class="nav nav-tabs col-sm-offset-6 " role="tablist">
					<li><a
						href="${ctx }/customer/customer/customer-view.action?customer.cuId=${customer.cuId}">基本信息</a></li>
					<li><a href="${ctx }/customer/contact-list.action?customer.cuId=${customer.cuId}">联系人管理</a></li>
					<li class="active"><a href="${ctx }/customer/history-list.action?customer.cuId=${customer.cuId}">历史订单管理</a></li>
					<li><a href="${ctx }/customer/communicate-list.action?customer.cuId=${customer.cuId}">交往记录管理</a></li>
				</ul>
				<!-- 导航栏结束 -->
				<!-- 数据显示与交互内容开始 -->
				<div class="workpage well well-lg">
					<form class="form-horizontal" role="form"
						action="${ctx }/customer/history-view.action"
						method="post">
						<div class="form-group">
							<label for="inputEmail3" class="col-sm-2 control-label">编号：</label>
							<div class="col-sm-3">${orderRecord.orreId}</div>
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
								<!-- Table -->
								<table class="table">
									<tr>
										<td align="center">产品编号</td>
										<td align="center">产品名称</td>
										<td align="center">数量</td>
									</tr>
									<s:iterator value="%{orderRecord.orderrecordproducts}">
										<tr>
											<td align="center">${product.prId}</td>
											<td align="center">${product.prName}</td>
											<td align="center">${orreprNum}</td>
										</tr>
									</s:iterator>
								</table>
							</div>
						</div>
						<div align="center">
							<a role="button" class="btn btn-default" href="customer/history-list.action?customer.cuId=${customer.cuId}">返回</a>
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