<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>RentCar - Panel klięta</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">

    <meta name="description" content="Wypożycz auto" />
    <meta name="keywords" content="wypożyczalnia aut, samochody do najmu, tanie auta" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta author="Marcin Pacana" />

    <link rel="stylesheet" href="resources/css/main.css" />
    <link rel="stylesheet" href="resources/css/client-panel.css" />

    <link href="https://fonts.googleapis.com/css2?family=Dancing+Script:wght@400;700&family=Source+Sans+Pro:ital,wght@0,900;1,700&display=swap" rel="stylesheet"/>
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Dancing+Script:wght@400;700&family=Source+Sans+Pro:ital,wght@0,900;1,700&display=swap');
    </style>
    <link href="https://fonts.googleapis.com/css2?family=Varela+Round&display=swap" rel="stylesheet">


</head>
<body>
<%@include file="WEB-INF/header.jspf" %>

<main>
    <div class="content">
        <nav class="client-nav">
            <div class="client-buttons">
                <button id="reservations-button">Moje rezerwacje</button>
                <button id="person-data-button">Dane osobowe</button>
                <button id="change-password-button">Zmiana hasła</button>
            </div>
        </nav>

        <div class="client-pad">

            <article class="reservation" id="reservation">
                <section class="reservation-list">

                    <div class="reservation-this">
                        <div class="reservation-this-car">
                            <p>MARKA AUTA</p>
                        </div>
                        <div class="reservation-this-dates">
                            <p>Data od</p>
                            <p>Data do</p>
                        </div>
                        <button>Zarządzaj rezerwacja</button>
                    </div>

                    <div class="reservation-this">
                        <div class="reservation-this-car">
                            <p>MARKA AUTA</p>
                        </div>
                        <div class="reservation-this-dates">
                            <p>Data od</p>
                            <p>Data do</p>
                        </div>
                        <button>Zarządzaj rezerwacja</button>
                    </div>

                </section>
                <p>Historia wypożyczeń</p>
                <section class="reservation-past">
                    <table>
                        <tr class="row">
                            <td>Marka auta</td>
                            <td>Data od</td>
                            <td>Data do</td>
                        </tr>

                        <tr class="row">
                            <td>Marka auta</td>
                            <td>Data od</td>
                            <td>Data do</td>
                        </tr>

                        <tr class="row">
                            <td>Marka auta</td>
                            <td>Data od</td>
                            <td>Data do</td>
                        </tr>
                    </table>
                </section>
            </article>

            <article class="person-data" id="person-data">

                <form>
                    <div class="p-client-box">
                        <label for="p-client-name">Imie:</label>
                        <input id="p-client-name" type="text" value="Michał" disabled="true" />
                    </div>

                    <div class="p-client-box">
                        <label for="p-client-surname">Nazwisko:</label>
                        <input id="p-client-surname" type="text" value="Nowak" disabled />
                    </div>

                    <div class="p-client-box">
                        <label for="p-client-dateofB">Data urodzenia:</label>
                        <input id="p-client-dateofB" type="date" value="1987-12-23" disabled />
                    </div>

                    <div class="p-client-box">
                        <label for="p-client-Email">Email:</label>
                        <input id="p-client-Email" type="text" value="mjnowak87@gmail.com" disabled />
                    </div>


                    <button id="button-save" class="button-save" type="submit" >Zapisz zmiany</button>
                </form>

                <button id="button-edit" class="button-edit">Edytuj</button>
                <button id="button-cancel" class="button-cancel">Anuluj</button>

            </article>

            <article  class="change-password" id="change-password">
                <form>
                    <div class="p-client-password">
                        <label for="p-client-password">Podaj swoje aktualne hasło: </label>
                        <input type="password" id="p-client-password" />
                    </div>

                    <div class="p-client-password">
                        <label for="p-client-password-new1">Twoje nowe hasło: </label>
                        <input type="password" id="p-client-password-new1" />
                    </div>

                    <div class="p-client-password">
                        <label for="p-client-password-new2">Potwierdź swoje nowe hasło: </label>
                        <input type="password" id="p-client-password-new2" />
                    </div>

                    <input class="change-password-sub" type="submit" value="Zatwierdź zmiany"></input>
                </form>
            </article>
        </div>

    </div>
</main>


<%@include file="WEB-INF/footer.jspf" %>
<script src="resources/js/jquery-3.4.1.min.js"></script>
<script src="resources/js/main.js"></script>
<script src="resources/js/clientpanel.js"></script>
</body>
</html>
