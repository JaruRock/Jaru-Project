$(function() {

	$.get("./rest/1/tambons", function(data) { console.log($.parseJSON(data)); });
	
});