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
						<a href="${ctx}/marketing/chance-list.action">销售机会管理</a>
					</div>
					<div class="accordion-inner">
						<a href="${ctx}/marketing/plan-list.action"> 客户开发计划</a>
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
						<a href="${ctx}/customer/drain-list.action">客户流失管理</a>
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
						<a href="${ctx}/service/assign-assign.action">服务分配</a>
					</div>
					<div class="accordion-inner">
						<a href="${ctx}/service/deal-deal.action">服务处理</a>
					</div>
					<div class="accordion-inner">
						<a href="${ctx}/service/feedback-feedback.action">服务反馈</a>
					</div>
					<div class="accordion-inner">
						<a href="${ctx}/service/archive-archive.action">服务归档</a>
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
						<a href="${ctx}/statistics/statistics-composition.action">客户构成分析</a>
					</div>
					<div class="accordion-inner">
						<a href="${ctx}/statistics/statistics-service.action">客户服务分析</a>
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
						<a href="${ctx}/data/data-list.action">数据字典管理</a>
					</div>
					<div class="accordion-inner">
						<a href="${ctx}/data/product-list.action">查询产品信息</a>
					</div>
					<div class="accordion-inner">
						<a href="${ctx}/data/stock-list.action">查询库存</a>
					</div>
				</div>
			</div>
		</div>
		<div class="panel panel-default">
			<div class="panel-heading">
				<h4 class="panel-title">
					<a data-toggle="collapse" data-parent="#accordion"
						href="#collapse-6">权限管理</a>
				</h4>
			</div>
			<div id="collapse-6" class="panel-collapse collapse">
				<div class="panel-body">
					<div class="accordion-inner">
						<a href="${ctx}/permission/permission-list.action">用户列表</a>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>