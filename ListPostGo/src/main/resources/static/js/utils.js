/**
 * 
 */

$(function() {
	$("#check").click(function() {
		$('[id^="address"]').each(function(idx1, element1){
			$('[id^="address"]').each(function(idx2, element2){
				if(idx1 < idx2 && element1.value == element2.value) {
					var id1 = element1.id;
					var id2 = element2.id;
					$('#' + id1).css('background-color','orange');
					$('#' + id2).css('background-color','orange');
					//console.log(idx1 + ' ' + idx2);
					//$('#address_' + (idx1 + 1) ).css('background-color','red');
					//$('#address_' + (idx2 + 1) ).css('background-color','red');
					
				};
			});
		});	 
	});
});