<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<ul class="pager">
	<li class="col-md-8">共有<label>${page.count}</label>条记录 每页显示<select
		onchange="submitMain()" name="page.pageSize"><option>10</option>
			<option>20</option>
			<option>30</option>
			<option value="0">全部</option></select>条 第${page.currentPage }页/共${page.countPage}页
		<input type="hidden" value="${page.pageSize }" id="pageSize">
		<input type="hidden" value="${page.currentPage}" id="currentPage">
	<li>
	<li><input style="width: 30px" type="text"
		value="${page.currentPage}" name="page.currentPage">
		<button type="submit">跳转</button></li>
	<s:if test="%{page.currentPage > 1}">
		<li><a href="#" onclick="pre()">上一页</a></li>
	</s:if>
	<s:if test="%{page.currentPage < page.countPage}">
		<li><a href="#" onclick="next()">下一页</a></li>
	</s:if>
</ul>