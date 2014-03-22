$(function() {
	var url = $("#contextPath").val()+'/test/?req=req';
	$.ajax({
		type : 'POST',
		url : url,
		data : null,
		dataType : 'json',
		cache : false,
		success : function(data) {
			 $("#tt").val(data.req);
		}
	});
	
});