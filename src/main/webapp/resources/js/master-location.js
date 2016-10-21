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
			, cache: true
		}
		, allowClear: true
		, placeholder: "ทั้งหมด"
	});

	$("#province").on("change", function() { 
		$("#district").val(null).trigger("change");
		$("#tambon").val(null).trigger("change");
		$("#kioskId").val(null).trigger("change");
	});
	
	$("#district").select2({
		ajax : {
			url : './rest/districts'
			, dataType : 'json'
			, type: "GET"
			, data: function (params) {
				return {
					q : params.term
					, provinceId : $("#province").val() 
				};
			}
			, processResults : function(data) {
				return {
					results : data.items
				};
			}
			, cache: true
		}
		, allowClear: true
		, placeholder: "ทั้งหมด"
	});
	
	$("#district").on("change", function() { 
		$("#tambon").val(null).trigger("change");
		$("#kioskId").val(null).trigger("change");
	});
	
	$("#tambon").select2({
		ajax : {
			url : './rest/tambons'
			, dataType : 'json'
			, type: "GET"
			, data: function (params) {
				return {
					q : params.term
					, districtId : $("#district").val()
				};
			}
			, processResults : function(data) {
				return {
					results : data.items
				};
			}
			, cache: true
		}
		, allowClear: true
		, placeholder: "ทั้งหมด"
	});
	
	$("#tambon").on("change", function() { 
		$("#kioskId").val(null).trigger("change");
	});
	
	$("#kioskId").select2({
		ajax : {
			url : './rest/kioskIds'
			, dataType : 'json'
			, type: "GET"
			, data: function (params) {
				return {
					q : params.term
					, provinceId : $("#province").val()
					, districtId : $("#district").val()
					, tambonId : $("#tambon").val()
				};
			}
			, processResults : function(data) {
				return {
					results : data.items
				};
			}
			, cache: true
		}
		, allowClear: true
		, placeholder: "ทั้งหมด"
	});
});