/**
 * 
 */

function PageInfo(level) {
	this.level = level;
}

PageInfo.prototype.generate = function() {
	try {
		$("#collapse-" + this.level).addClass("in");
	} finally {
	}
	;
	try {
		var pageSize = parseInt($("#pageSize").val());
		$("[name='page.pageSize']").val(pageSize);
	} finally {
	}
	;
};

function submitMain() {
	$('#main-form').submit();
}
function pre() {
	var e = $("[name='page.currentPage']");
	e.val(parseInt(e.val()) - 1);
	$('#main-form').submit();
}
function next() {
	var e = $("[name='page.currentPage']");
	e.val(parseInt(e.val()) + 1);
	$('#main-form').submit();
}

function comfirmDelete(btn) {
	var link = $("#modal-delete-link");
	var s = btn.attr("href").replace("#", "");
	link.attr("href", s);
	$('#modal-delete').modal('show');
}