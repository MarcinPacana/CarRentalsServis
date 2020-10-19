<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>RentCar - Szczegóły</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">

    <meta name="description" content="Wypożycz auto" />
    <meta name="keywords" content="wypożyczalnia aut, samochody do najmu, tanie auta" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta author="Marcin Pacana" />

    <link rel="stylesheet" href="resources/css/main.css" />
    <link rel="stylesheet" href="resources/css/details.css" />

    <link href="https://fonts.googleapis.com/css2?family=Dancing+Script:wght@400;700&family=Source+Sans+Pro:ital,wght@0,900;1,700&display=swap" rel="stylesheet"/>
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Dancing+Script:wght@400;700&family=Source+Sans+Pro:ital,wght@0,900;1,700&display=swap');
    </style>
    <link href="https://fonts.googleapis.com/css2?family=Varela+Round&display=swap" rel="stylesheet">


</head>
<body>
<%@include file="WEB-INF/header.jspf" %>

<main>
    <article>
        <section class="details-car">

            <div class="car-images">
                <img src="resources/img/audia3.jpg" />
            </div>

            <div class="car-description">

                <div class="first-description">
                    <div class="car-description-row">
                        <p class="lab">MARKA</p><p class="car-content">Audi</p>
                    </div>

                    <div class="car-description-row">
                        <p class="lab">MODEL</p><p class="car-content">a3</p>
                    </div>

                    <div class="car-description-row">
                        <p class="lab">ILOŚĆ MIEJSC</p><p class="car-content">5</p>
                    </div>

                    <div class="car-description-row">
                        <p class="lab">BAGARZNIK</p><p class="car-content">ŚREDNI</p>
                    </div>
                </div>

                <div class="second-description">
                    <div class="car-description-row">
                        <p class="lab">KLIMATYZACJA</p><p class="car-content">tak</p>
                    </div>

                    <div class="car-description-row">
                        <p class="lab">DRZWI</p><p class="car-content">5</p>
                    </div>

                    <div class="car-description-row">
                        <p class="lab">SKRZYNIA BIEGÓW</p><p class="car-content">manualna</p>
                    </div>

                    <div class="car-description-row">
                        <p class="lab">MOC SILNIKA</p><p class="car-content">103</p>
                    </div>
                </div>
            </div>

        </section>

        <section class="details-car-calendar">


            <div class="calendar-box">
                Tutaj znajduje sie kalendarz z dostepnoscia
            </div>

            <div class="select-date">
                <p>Okres rezerwacji: </p>
            </div>

        </section>

        <section class="details-car-buttoms">

            <div class="back-rent-buttons">
                <input id="rent-button-back" type="button" value="WRÓĆ"></input>
                <input id="rent-button-rent" type="button" value="ZAREZERWUJ"></input>
            </div>

        </section>
    </article>
</main>

<%@include file="WEB-INF/footer.jspf" %>
<script src="resources/js/jquery-3.4.1.min.js"></script>
<script src="resources/js/main.js"></script>
</body>
</html>
