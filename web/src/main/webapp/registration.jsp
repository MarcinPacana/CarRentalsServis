<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>RentCar - Rejestracja</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">

    <meta name="description" content="Wypożycz auto" />
    <meta name="keywords" content="wypożyczalnia aut, samochody do najmu, tanie auta" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta author="Marcin Pacana" />

    <link rel="stylesheet" href="resources/css/main.css" />
    <link rel="stylesheet" href="resources/css/registration.css" />

    <link href="https://fonts.googleapis.com/css2?family=Dancing+Script:wght@400;700&family=Source+Sans+Pro:ital,wght@0,900;1,700&display=swap" rel="stylesheet"/>
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Dancing+Script:wght@400;700&family=Source+Sans+Pro:ital,wght@0,900;1,700&display=swap');
    </style>
    <link href="https://fonts.googleapis.com/css2?family=Varela+Round&display=swap" rel="stylesheet">


</head>
<body>
<%@include file="WEB-INF/header.jspf" %>

<main>
    <article id="register-form">

        <form>
            <div class="content-reg">
                <div class="form-reg-box">
                    <label for="name-reg">Imię</label><input class="reg-input" id="name-reg" type="text" />
                </div>

                <div class="form-reg-box">
                    <label for="surname-reg">Nazwisko</label><input class="reg-input" id="surname-reg" type="text" />
                </div>

                <div class="form-reg-box">
                    <label for="date">Data urodzenia</label><input type="text" id="date" data-format="DD-MM-YYYY" 			data-template="D MMM YYYY" name="date" />
                </div>

                <div class="form-reg-box">
                    <label for="email-reg">Email</label><input class="reg-input" id="email-reg" type="email" />
                </div>

                <div class="form-reg-box">
                    <label for="password-reg1">Hasło</label><input class="reg-input" id="password-reg1" type="password" />
                </div>

                <div class="form-reg-box">
                    <label for="password-reg2">Potwierdź hasło</label><input class="reg-input" id="password-reg2" type="password" />
                </div>
            </div>

            <input class="submit-reg" type="submit" value="Zarejestruj" />
        </form>

    </article>
</main>


<%@include file="WEB-INF/footer.jspf" %>
<script src="resources/js/jquery-3.4.1.min.js"></script>
<script src="resources/js/main.js"></script>
<script src="resources/js/combodate.js"></script>
<script src="resources/js/moment.js"></script>
</body>
</html>
