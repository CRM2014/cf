﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="col-md-2 sidebar">
	<div class="panel-group" id="accordion">
		<div class="panel panel-default menu-hide" id="menu-1">
			<div class="panel-heading">
				<h4 class="panel-title">
					<a data-toggle="collapse" data-parent="#accordion"
						href="#collapse-1">营销管理</a>
				</h4>
			</div>
			<div id="collapse-1" class="panel-collapse collapse">
				<div class="panel-body">
					<div class="accordion-inner menu-hide" id="menu-1-1">
						<a href="${ctx}/marketing/chance-list.action">销售机会管理</a>
					</div>
					<div class="accordion-inner menu-hide" id="menu-1-2">
						<a href="${ctx}/marketing/plan-list.action"> 客户开发计划</a>
					</div>
				</div>
			</div>
		</div>

		<div class="panel panel-default menu-hide" id="menu-2">
			<div class="panel-heading">
				<h4 class="panel-title">
					<a data-toggle="collapse" data-parent="#accordion"
						href="#collapse-2">客户管理</a>
				</h4>
			</div>
			<div id="collapse-2" class="panel-collapse collapse">
				<div class="panel-body">
					<div class="accordion-inner menu-hide" id="menu-2-1">
						<a href="${ctx}/customer/customer-list.action">客户信息管理</a>
					</div>
					<div class="accordion-inner menu-hide" id="menu-2-2">
						<a href="${ctx}/customer/drain-list.action">客户流失管理</a>
					</div>
				</div>
			</div>
		</div>
		<div class="panel panel-default menu-hide" id="menu-3">
			<div class="panel-heading">
				<h4 class="panel-title">
					<a data-toggle="collapse" data-parent="#accordion"
						href="#collapse-3">服务管理</a>
				</h4>
			</div>
			<div id="collapse-3" class="panel-collapse collapse">
				<div class="panel-body">
					<div class="accordion-inner menu-hide" id="menu-3-1">
						<a href="${ctx}/service/service-add.action">服务创建</a>
					</div>
					<div class="accordion-inner menu-hide" id="menu-3-2">
						<a href="${ctx}/service/assign-list.action">服务分配</a>
					</div>
					<div class="accordion-inner menu-hide" id="menu-3-3">
						<a href="${ctx}/service/deal-list.action">服务处理</a>
					</div>
					<div class="accordion-inner menu-hide" id="menu-3-4">
						<a href="${ctx}/service/feedback-list.action">服务反馈</a>
					</div>
					<div class="accordion-inner menu-hide" id="menu-3-5">
						<a href="${ctx}/service/archive-list.action">服务归档</a>
					</div>
				</div>
			</div>
		</div>

		<div class="panel panel-default menu-hide" id="menu-4">
			<div class="panel-heading">
				<h4 class="panel-title">
					<a data-toggle="collapse" data-parent="#accordion"
						href="#collapse-4">统计报表</a>
				</h4>
			</div>
			<div id="collapse-4" class="panel-collapse collapse">
				<div class="panel-body">
					<div class="accordion-inner menu-hide" id="menu-4-1">
						<a href="${ctx}/statistics/statistics-contribution.action">客户贡献分析</a>
					</div>
					<div class="accordion-inner menu-hide" id="menu-4-2">
						<a href="${ctx}/statistics/statistics-composition.action">客户构成分析</a>
					</div>
					<div class="accordion-inner menu-hide" id="menu-4-3">
						<a href="${ctx}/statistics/statistics-service.action">客户服务分析</a>
					</div>
					<div class="accordion-inner menu-hide" id="menu-4-4">
						<a href="${ctx}/statistics/statistics-drain.action">客户流失分析</a>
					</div>
				</div>
			</div>
		</div>


		<div class="panel panel-default menu-hide" id="menu-5">
			<div class="panel-heading">
				<h4 class="panel-title">
					<a data-toggle="collapse" data-parent="#accordion"
						href="#collapse-5">基础数据</a>
				</h4>
			</div>
			<div id="collapse-5" class="panel-collapse collapse">
				<div class="panel-body">
					<div class="accordion-inner menu-hide" id="menu-5-1">
						<a href="${ctx}/data/data-list.action">数据字典管理</a>
					</div>
					<div class="accordion-inner menu-hide" id="menu-5-2">
						<a href="${ctx}/data/product-list.action">查询产品信息</a>
					</div>
					<div class="accordion-inner menu-hide" id="menu-5-3">
						<a href="${ctx}/data/stock-list.action">查询库存</a>
					</div>
				</div>
			</div>
		</div>
		<div class="panel panel-default menu-hide" id="menu-6">
			<div class="panel-heading">
				<h4 class="panel-title">
					<a data-toggle="collapse" data-parent="#accordion"
						href="#collapse-6">权限管理</a>
				</h4>
			</div>
			<div id="collapse-6" class="panel-collapse collapse">
				<div class="panel-body">
					<div class="accordion-inner menu-hide" id="menu-6-1">
						<a href="${ctx}/permission/permission-list.action">用户列表</a>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<input type="hidden" value="${currentUser.usRole}" id="current-role" />
<s:iterator value="permissions" id="o" status="st">
	<input type="hidden" value="${o.role}" id="role-${st.index}" />
	<input type="hidden" value="${o.open}" id="open-${st.index}" />
</s:iterator>