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

	try {
		var pageSize = parseInt($("#pageSize").val());
		$("[name='page.pageSize']").val(pageSize);
	} finally {
	}
	permission();
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

function permission() {
	var colNum = 6;
	var roleNum = 5;
	var currentRole = $("#current-role").val();
	for (var i = 1; i <= colNum; i++) {
		$("#menu-" + i).hide();
	}

	for (var i = 0; i < roleNum; i++) {
		var role = $("#role-" + i).val();
		var open = $("#open-" + i).val();
		if (currentRole == role) {

			var json = JSON.parse(open);

			var arr = (json + "").split(",");
			for (var j = 0; j < arr.length; j++) {
				$("#menu-" + arr[j]).show();
				var strs = arr[j].split("-");
				if (strs[1] != "" && strs[1] != "undefined")
					$("#menu-" + strs[0]).show();
			}
		}

	}

}