<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<s:iterator value="%{error}">
	<div class="alert alert-danger fade in" role="alert">
		<button type="button" class="close" data-dismiss="alert">
			<span aria-hidden="true">×</span><span class="sr-only">Close</span>
		</button>
		<strong>${title}</strong>${content}
	</div>
</s:iterator>
<s:iterator value="%{warn}">
	<div class="alert alert-warning fade in" role="alert">
		<button type="button" class="close" data-dismiss="alert">
			<span aria-hidden="true">×</span><span class="sr-only">Close</span>
		</button>
		<strong>${title}</strong>${content}
	</div>
</s:iterator>