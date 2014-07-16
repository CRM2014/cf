<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="col-md-2 sidebar">
	<div class="panel-group" id="accordion">
		<div class="panel panel-default">
			<div class="panel-heading">
				<h4 class="panel-title">
					<a data-toggle="collapse" data-parent="#accordion"
						href="#collapse-1">营销管理</a>
				</h4>
			</div>
			<div id="collapse-1" class="panel-collapse collapse">
				<div class="panel-body">
					<div class="accordion-inner">
						<a href="${ctx}/marketing/developmentPlan-list.action">销售机会管理</a>
					</div>
					<div class="accordion-inner">
						<a href="${ctx}/marketing/marketingOpportunities-list.action"> 客户开发计划</a>
					</div>
				</div>
			</div>
		</div>

		<div class="panel panel-default">
			<div class="panel-heading">
				<h4 class="panel-title">
					<a data-toggle="collapse" data-parent="#accordion"
						href="#collapse-2">客户管理</a>
				</h4>
			</div>
			<div id="collapse-2" class="panel-collapse collapse">
				<div class="panel-body">
					<div class="accordion-inner">
						<a href="${ctx}/customer/customer-list.action">客户信息管理</a>
					</div>
					<div class="accordion-inner">
						<a href="${ctx}/customer/runoff-list.action">客户流失管理</a>
					</div>
				</div>
			</div>
		</div>
		<div class="panel panel-default">
			<div class="panel-heading">
				<h4 class="panel-title">
					<a data-toggle="collapse" data-parent="#accordion"
						href="#collapse-3">服务管理</a>
				</h4>
			</div>
			<div id="collapse-3" class="panel-collapse collapse">
				<div class="panel-body">
					<div class="accordion-inner">
						<a href="${ctx}/service/service-add.action">服务创建</a>
					</div>
					<div class="accordion-inner">
						<a href="${ctx}/service/serviceCustomer-assign.actionl">服务分配</a>
					</div>
					<div class="accordion-inner">
						<a href="${ctx}/service/serviceCustomer-deal.action">服务处理</a>
					</div>
					<div class="accordion-inner">
						<a href="${ctx}/service/serviceCustomer-feedback.action">服务反馈</a>
					</div>
					<div class="accordion-inner">
						<a href="${ctx}/service/serviceCustomer-archiving.action">服务归档</a>
					</div>
				</div>
			</div>
		</div>

		<div class="panel panel-default">
			<div class="panel-heading">
				<h4 class="panel-title">
					<a data-toggle="collapse" data-parent="#accordion"
						href="#collapse-4">统计报表</a>
				</h4>
			</div>
			<div id="collapse-4" class="panel-collapse collapse">
				<div class="panel-body">
					<div class="accordion-inner">
						<a href="${ctx}/statistics/statistics-contribution.action">客户贡献分析</a>
					</div>
					<div class="accordion-inner">
						<a href="${ctx}/statistics/statistics-constitute.action">客户构成分析</a>
					</div>
					<div class="accordion-inner">
						<a href="${ctx}/statistics/statistics-analyze.action">客户服务分析</a>
					</div>
					<div class="accordion-inner">
						<a href="${ctx}/statistics/statistics-drain.action">客户流失分析</a>
					</div>
				</div>
			</div>
		</div>
		

		<div class="panel panel-default">
			<div class="panel-heading">
				<h4 class="panel-title">
					<a data-toggle="collapse" data-parent="#accordion"
						href="#collapse-5">基础数据</a>
				</h4>
			</div>
			<div id="collapse-5" class="panel-collapse collapse">
				<div class="panel-body">
					<div class="accordion-inner">
						<a href="${ctx}/database/database-init.action">数据字典管理</a>
					</div>
					<div class="accordion-inner">
						<a href="${ctx}/database/database-product.action">查询产品信息</a>
					</div>
					<div class="accordion-inner">
						<a href="${ctx}/database/database-depot.action">查询库存</a>
					</div>
				</div>
			</div>
		</div>
		<div class="panel panel-default">
			<div class="panel-heading">
				<h4 class="panel-title">
					<a data-toggle="collapse" data-parent="#accordion"
						href="#collapse-6">用户管理</a>
				</h4>
			</div>
			<div id="collapse-6" class="panel-collapse collapse">
				<div class="panel-body">
					<div class="accordion-inner">
						<a href="../account/list.html">查看用户</a>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>