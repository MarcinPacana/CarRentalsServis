<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>RentCar - Rezerwacja</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">

    <meta name="description" content="Wypożycz auto" />
    <meta name="keywords" content="wypożyczalnia aut, samochody do najmu, tanie auta" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta author="Marcin Pacana" />

    <link rel="stylesheet" href="resources/css/main.css" />
    <link rel="stylesheet" href="resources/css/reservation-select.css" />

    <link href="https://fonts.googleapis.com/css2?family=Dancing+Script:wght@400;700&family=Source+Sans+Pro:ital,wght@0,900;1,700&display=swap" rel="stylesheet"/>
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Dancing+Script:wght@400;700&family=Source+Sans+Pro:ital,wght@0,900;1,700&display=swap');
    </style>
    <link href="https://fonts.googleapis.com/css2?family=Varela+Round&display=swap" rel="stylesheet">


</head>
<body>
<%@include file="WEB-INF/header.jsp" %>

<main>
    <div class="boxmat">

        <div id="content-box" class="content-box">

            <div id="background" class="background">
                <img src="resources/img/tlo1.jpg"></img>
            </div>

            <div id="option1" class="option1">
                <form>
                    <div class="select-car-info">
                        <label for="selected-car" value="Wybrałeś: ">Wybrałeś: <input id="selected-car" type="text" value="Audi" disabled="checked"></input></label>

                        <label for="selected-car-from" value="Wybrałeś: ">Od: <input id="selected-car-from" type="date" value="2020-01-01" disabled="checked"></input></label>

                        <label for="selected-car" value="Wybrałeś: ">Do: <input id="selected-car" type="date" value="2020-01-25" disabled="checked"></input></label>
                    </div>
                    <div class="user-input">
                        <input type="text" placeholder="imię"></input>
                        <input type="text" placeholder="nazwisko"></input>
                        <input type="email" placeholder="e-mail"></input>
                        <input type="email" placeholder="potwierdz e-mail"></input>
                    </div>

                    <button type="submit">ZAREZERWUJ</button>
                </form>
            </div>

            <div id="option2" class="option2">
                <form>
                    <div class="select-car-info">
                        <label for="selected-car" value="Wybrałeś: ">Wybrałeś: <input id="selected-car" type="text" value="Audi" disabled="checked"></input></label>

                        <label for="selected-car-from" value="Wybrałeś: ">Od: <input id="selected-car-from" type="date" value="2020-01-01" disabled="checked"></input></label>

                        <label for="selected-car" value="Wybrałeś: ">Do: <input id="selected-car" type="date" value="2020-01-25" disabled="checked"></input></label>
                    </div>
                    <div class="user-input2">
                        <input type="text" placeholder="imię"></input>
                        <input type="text" placeholder="nazwisko"></input>
                        <input type="email" placeholder="e-mail"></input>
                        <input type="email" placeholder="potwierdz e-mail"></input>
                        <input type="password" placeholder="ustaw hasło"></input>
                        <input type="password" placeholder="potwierdź hasło"></input>
                    </div>

                    <button type="submit">ZAREZERWUJ I UTWÓRZ KONTO</button>
                </form>
            </div>
        </div>

        <div id="option1-other" class="option1-other">
            <p>Zarezerwuj i utwórz konto</p>
            <button id="button1" class="button-other">WYBIERZ</button>
        </div>

        <div id="option2-other" class="option2-other">
            <p>Zarezerwuj bez zakładania konta</p>
            <button id="button2" class="button-other">WYBIERZ</button>
        </div>

    </div>

</main>

<%@include file="WEB-INF/footer.jsp" %>
<script src="resources/js/jquery-3.4.1.min.js"></script>
<script src="resources/js/main.js"></script>
<script src="resources/js/reservation-select.js"></script>
</body>
</html>
