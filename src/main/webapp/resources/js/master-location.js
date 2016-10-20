$(function() {

	$("#province").select2({
		ajax : {
			url : './rest/provinces'
			, dataType : 'json'
			, type: "GET"
			, data: function (params) {
				return {
					q : params.term
				};
			}
			, processResults : function(data) {
				return {
					results : data.items
				};
			}
			, minimumInputLength: 1
			, cache: true
		}
	});

});