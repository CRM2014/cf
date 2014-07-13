/**
 * 
 */

function PageInfo(level) {
	this.level = level;
}

PageInfo.prototype.generateMenu = function() {
	$("#collapse-" + this.level).collapse();
};
