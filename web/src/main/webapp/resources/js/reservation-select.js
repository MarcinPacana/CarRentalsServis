$(document).ready(function()
{
	$('#button1').click(function()
	{
		$('#content-box').css('left','350px');	
		$('#background').css('left','-500px');	
		
		$('#option1').css('opacity','0');
		
		$('#option1-other').css('opacity','0');
		
		$('#option2-other').css('display','block');	
		
		$('#option2').css('display','block');
		
		setTimeout(function()
		{
			$('#option1').css('display','none');
		},500);
		
		
			setTimeout(function()
		{
			$('#option2').css('opacity','1');
		},600);
		
		setTimeout(function()
		{
			$('#option2-other').css('opacity','1');
		},1000);
		
		setTimeout(function()
		{
			$('#option1-other').css('display','none');
		},500);
	})
	
	
	$('#button2').click(function()
	{
		$('#content-box').css('left','-150px');
		$('#background').css('left','0px');	
		
		$('#option2-other').css('opacity','0');
		
		$('#option2').css('opacity','0');
		
		
		
		
		
		setTimeout(function()
		{
			$('#option2').css('display','none');
		},402);
		
		setTimeout(function()
		{
			$('#option1').css('display','block');
		},404);
		
		setTimeout(function()
		{
			$('#option1').css('opacity','1');
		},405);
		
		setTimeout(function()
		{
			$('#option2-other').css('display','none');
		},500);
		
		setTimeout(function()
		{
			$('#option1-other').css('display','block');
			$('#option1-other').css('opacity','1');
		},1000);
	})
})