/**
 * 
 */

function PageInfo(level) {
	this.level = level;
}

PageInfo.prototype.generate = function() {
	$("#collapse-" + this.level).addClass("in");
};
