var serviceURL = "/";

getOrderRecordList();

$(document).ajaxError(function(event, request, settings) {
	alert("Error accessing the server");
});

function getOrderRecordList() {
	$.getJSON(serviceURL + 'orderRecord', function(data) {
		var trHTML = '';
		$.each(data, function (i, item) {
			trHTML += '<tr><td>' + data[i].customerName + '</td><td>' + data[i].orderNumber + '</td><td>' + data[i].orderStatus + '</td></tr>';
		});

		$('#orders').append(trHTML);

	});
}