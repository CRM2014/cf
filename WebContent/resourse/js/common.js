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

function warn(msg) {
	var content = $("#warn").html();
	content += "<div class='alert alert-warning fade in' role='alert'>";
	content += "<button type='button' class='close' data-dismiss='alert'><span aria-hidden='true'>×</span><span class='sr-only'>Close</span></button>"
	content += "<strong>" + msg + "</strong></div>";
	$("#warn").html(content);
}
$(document).ajaxSend(function(event, jqXHR, ajaxOptions) {

});

$(document).ajaxError(function(event, jqXHR, ajaxSettings, thrownError) {

});

$(document).ajaxSuccess(function(event, jqXHR, ajaxOptions) {

});

$(document).ajaxComplete(function(event, jqXHR, ajaxOptions) {

});

$(".checkable").each(function() {
	if ($(this).attr("data-toggle") == undefined)
		$(this).attr("data-toggle", "popover");
	if ($(this).attr("data-trigger") == undefined)
		$(this).attr("data-trigger", "focus");
	if ($(this).attr("data-content") == undefined)
		$(this).attr("data-content", "！");
	if ($(this).attr("data-placement") == undefined)
		$(this).attr("data-placement", "right");
	if ($(this).attr("reg") == undefined)
		$(this).attr("reg", "/^[A-Za-z0-9]+$/");
});

function check() {
	var b = true;
	$(".checkable").each(function() {
		var reg = eval($(this).attr("reg"));
		if (!reg.test($(this).val())) {
			b = false;
			$(this).popover('show');
		}
	});
	return b;
}

$(".checkable").blur(function() {
	$(this).popover('destroy');
});