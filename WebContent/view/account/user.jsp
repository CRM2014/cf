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
                <div >
                    <form class="form-horizontal" role="form">
                      
                            <div class="form-group">
                                <label for="inputEmail3" class="col-sm-4 control-label">编号：</label>
                                <label for="inputEmail3" class="col-sm--3 control-label">22222</label>
                            </div>
                            <div class="form-group">
                                <label for="inputEmail3" class="col-sm-4 control-label">用户名：</label>
                                <label for="inputEmail3" class="col-sm--3 control-label">宇神</label>
                            </div>
                            <div class="form-group">
                                <label for="inputEmail3" class="col-sm-4 control-label">用户姓名：</label>
                                <label for="inputEmail3" class="col-sm--3 control-label">齐宇</label>
                            </div>
                            <div class="form-group">
                                <label for="inputEmail3" class="col-sm-4 control-label">用户角色：</label>
                                <label for="inputEmail3" class="col-sm--3 control-label">销售主管</label>
                            </div>
                            <div class="form-group">
                                <label for="inputEmail3" class="col-sm-4 control-label">登录时间：</label>
                                <label for="inputEmail3" class="col-sm--3 control-label">2014-07-13 3：00 pm</label>
                            </div>
                            <div class="form-group">
                                <label for="inputEmail3" class="col-sm-4 control-label">上次登录时间：</label>
                                <label for="inputEmail3" class="col-sm--3 control-label">2014-07-12 3：00 pm</label>
                            </div>
                            <div class="form-group">
                                <label for="inputEmail3" class="col-sm-4 control-label">创建时间：</label>
                                <label for="inputEmail3" class="col-sm--3 control-label">2014-07-10 3：00 pm</label>
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
		var pageInfo = new PageInfo(3);
		pageInfo.generate();
	</script>
	<!-- js结束 -->

</body>
</html>