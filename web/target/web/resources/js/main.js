$(document).ready(function()
{

	$('#login').click(function()
		{
			$(this).next('.login-content').slideToggle();
			$(this).toggleClass('active');
		})

	var NavY = $('.nav-top').offset().top;

	var stickyNav = function()
	{
		var ScrollY = $(window).scrollTop();

		if (ScrollY > NavY)
		{
			$('.nav-top').addClass('sticky');
		}
		else
		{
			$('.nav-top').removeClass('sticky');
		}
	};

	stickyNav();

	$(window).scroll(function()
	{
		stickyNav();
	});


	if (zmiennaTestowa == false)
	{
		alert("zmienna testowa false");
	}

});



function setLogin(){
	alert("alert test jest OK");
}

$(function(){
	$('#date').combodate({
    minYear: 1940,
    maxYear: 2020,
    minuteStep: 10
	});
    $('#date').combodate();    
});

function downLog()
{
	$(this).next('.login-content').slideToggle();
	$(this).toggleClass('active');
}
	




