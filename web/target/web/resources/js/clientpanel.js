$(document).ready(function()
	{
		function buttonCancel()
		{
			$('#button-edit').css('display','block');
			$('#button-save').css('display','none');
			$('#button-cancel').css('display','none');
			$('#p-client-name').attr('disabled','true');
			$('#p-client-surname').attr('disabled','true');
			$('#p-client-dateofB').attr('disabled','true');
			$('#p-client-Email').attr('disabled','true');
		}
		
		$('#person-data-button').click(function()
		{
			$('#person-data').css('display','block');
			$('#change-password').css('display','none');
			$('#reservation').css('display','none');
		})
		
		
		$('#change-password-button').click(function()
		{
			$('#person-data').css('display','none');
			$('#change-password').css('display','block');
			$('#reservation').css('display','none');
			buttonCancel();
		})
		
		$('#button-edit').click(function()
		{
			$('#button-edit').css('display','none');
			$('#button-save').css('display','block');
			$('#button-cancel').css('display','block');
			$('#p-client-name').removeAttr('disabled');
			$('#p-client-surname').removeAttr('disabled');
			$('#p-client-dateofB').removeAttr('disabled');
			$('#p-client-Email').removeAttr('disabled');	
		})
		
		$('#button-cancel').click(buttonCancel);
		
		$('#reservations-button').click(function()
		{
			$('#person-data').css('display','none');
			$('#change-password').css('display','none');
			$('#reservation').css('display','block');
			buttonCancel();
		})
	}
)