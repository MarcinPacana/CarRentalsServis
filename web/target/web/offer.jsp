<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset-="utf-8" />
    <title>RentCar - Oferta</title>

    <meta name="description" content="Wypożycz auto" />
    <meta name="keywords" content="wypożyczalnia aut, samochody do najmu, tanie auta" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta author="Marcin Pacana" />

    <link rel="stylesheet" href="resources/css/main.css" />
    <link rel="stylesheet" href="resources/css/offer.css" />

    <link href="https://fonts.googleapis.com/css2?family=Dancing+Script:wght@400;700&family=Source+Sans+Pro:ital,wght@0,900;1,700&display=swap" rel="stylesheet">
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Dancing+Script:wght@400;700&family=Source+Sans+Pro:ital,wght@0,900;1,700&display=swap');
    </style>
    <link href="https://fonts.googleapis.com/css2?family=Varela+Round&display=swap" rel="stylesheet">

</head>
<body>
<%@include file="WEB-INF/header.jsp" %>

<main>
    <div class="oferta-content">

        <nav class="nav-filters">
            <form>

                <div class="multiselect">
                    <div class="selectDate">

                        <label for="dateFrom">Od <input id="dateFrom" class="date" type="date"></label>

                        <label for="dateTo">Do <input id="dateTo" class="date" type="date"></label>

                    </div>
                </div>


                <div class="multiselect">
                    <div id="selectBox1" class="selectBox">
                        <div class="test">Marka</div>
                    </div>
                    <div id="checkboxes1" class="checkboxes">
                        <label for="one"><input type="checkbox" id="one" />First checkbox</label>
                        <label for="two"><input type="checkbox" id="two" />Second checkbox</label>
                        <label for="three"><input type="checkbox" id="three" />Third checkbox</label>
                    </div>
                </div>



                <div class="multiselect">
                    <div id="selectBox2" class="selectBox">
                        <div class="test">Typ</div>
                    </div>
                    <div id="checkboxes2" class="checkboxes">
                        <label for="one2"><input type="checkbox" id="one2" />First checkbox</label>
                        <label for="two2"><input type="checkbox" id="two2" />Second checkbox</label>
                        <label for="three2"><input type="checkbox" id="three2" />Third checkbox</label>
                    </div>
                </div>

                <div class="multiselect">
                    <div id="selectBox3" class="selectBox">
                        <div class="test">Liczba miejsc</div>
                    </div>
                    <div id="checkboxes3" class="checkboxes">
                        <label for="one3"><input type="checkbox" id="one3" />First checkbox</label>
                        <label for="two3"><input type="checkbox" id="two3" />Second checkbox</label>
                        <label for="three3"><input type="checkbox" id="three3" />Third checkbox</label>
                    </div>
                </div>

                <div class="multiselect">
                    <div id="selectBox4" class="selectBox">
                        <div class="test">Bagażnik</div>
                    </div>
                    <div id="checkboxes4" class="checkboxes">
                        <label for="one4"><input type="checkbox" id="one4" />First checkbox</label>
                        <label for="two4"><input type="checkbox" id="two4" />Second checkbox</label>
                        <label for="three4"><input type="checkbox" id="three4" />Third checkbox</label>
                    </div>
                </div>

                <div class="multiselect">
                    <div id="selectBox5" class="selectBox">
                        <div class="test">Skrzynia bieków</div>
                    </div>
                    <div id="checkboxes5" class="checkboxes">
                        <label for="one5"><input type="checkbox" id="one5" />First checkbox</label>
                        <label for="two5"><input type="checkbox" id="two5" />Second checkbox</label>
                        <label for="three5"><input type="checkbox" id="three5" />Third checkbox</label>
                    </div>
                </div>

            </form>
        </nav>

        <article class="cars">

            <table id="carsTable">
                <tbody>
                <tr><td>Audi</td><td>a4</td><td>5 miejsc siedzących</td><td>Duży bagażnik</td></tr>
                <tr><td>Kia</td><td>city</td><td>5 miejsc siedzących</td><td>Bardzo duży bagażnik</td></tr>
                <tr><td>Fiat</td><td>126p</td><td>10 miejsc siedzących</td><td>Brak Bagażnika</td></tr>
                <tr><td>Audi</td><td>a4</td><td>5 miejsc siedzących</td><td>Duży bagażnik</td></tr>
                <tr><td>Kia</td><td>city</td><td>5 miejsc siedzących</td><td>Bardzo duży bagażnik</td></tr>
                <tr><td>Fiat</td><td>126p</td><td>10 miejsc siedzących</td><td>Brak Bagażnika</td></tr>
                <tr><td>Audi</td><td>a4</td><td>5 miejsc siedzących</td><td>Duży bagażnik</td></tr>
                <tr><td>Kia</td><td>city</td><td>5 miejsc siedzących</td><td>Bardzo duży bagażnik</td></tr>
                <tr><td>Fiat</td><td>126p</td><td>10 miejsc siedzących</td><td>Brak Bagażnika</td></tr>
                <tr><td>Audi</td><td>a4</td><td>5 miejsc siedzących</td><td>Duży bagażnik</td></tr>
                <tr><td>Kia</td><td>city</td><td>5 miejsc siedzących</td><td>Bardzo duży bagażnik</td></tr>
                <tr><td>Fiat</td><td>126p</td><td>10 miejsc siedzących</td><td>Brak Bagażnika</td></tr>
                </tbody>
            </table>

        </article>
    </div>
</main>

<%@include file="WEB-INF/footer.jsp" %>
<script src="resources/js/jquery-3.4.1.min.js"></script>
<script src="resources/js/main.js"></script>
<script src="resources/js/offer.js"></script>
</body>
</html>
