$(document).ready(function () {

    var select1 = document.getElementById("selectBox1");
    var select2 = document.getElementById("selectBox2");
    var select3 = document.getElementById("selectBox3");
    var select4 = document.getElementById("selectBox4");
    var select5 = document.getElementById("selectBox5");

    var tab1 = [false,false,false,false,false];

    select1.addEventListener("click", function() {showCheckboxes("checkboxes1",0); } );
    select2.addEventListener("click", function() {showCheckboxes("checkboxes2",1); } );
    select3.addEventListener("click", function() {showCheckboxes("checkboxes3",2); } );
    select4.addEventListener("click", function() {showCheckboxes("checkboxes4",3); } );
    select5.addEventListener("click", function() {showCheckboxes("checkboxes5",4); } );


    function showCheckboxes(box,flag)
    {
        if(!tab1[flag])
        {
            $("#"+box).css("display","block");
            setFlag(flag, true);
        }else
        {
            $("#"+box).css("display", "none");
            setFlag(flag,false);
        }
    }

    function setFlag(number,value)
    {
        console.log("weszlo do seta");
        tab1[number] = value;
        console.log("wyszlo z seta");

    }
});