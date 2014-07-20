<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<s:if test="%{error!=null&&error!=''}">
	<div class="alert alert-danger fade in" role="alert">
		<button type="button" class="close" data-dismiss="alert">
			<span aria-hidden="true">×</span><span class="sr-only">Close</span>
		</button>
		<strong>${error}</strong>
	</div>
</s:if>
<s:if test="%{warn!=null&&warn!=''}">
	<div class="alert alert-warning fade in" role="alert">
		<button type="button" class="close" data-dismiss="alert">
			<span aria-hidden="true">×</span><span class="sr-only">Close</span>
		</button>
		<strong>${warn}</strong>
	</div>
</s:if>