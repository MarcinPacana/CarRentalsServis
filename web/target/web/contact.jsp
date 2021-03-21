<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="pl">
<head>
    <meta charset-="utf-8" />
    <title>RentCar - Kontakt</title>

    <meta name="description" content="Wypożycz auto" />
    <meta name="keywords" content="wypożyczalnia aut, samochody do najmu, tanie auta" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta author="Marcin Pacana" />

    <link rel="stylesheet" href="resources/css/main.css" />
    <link rel="stylesheet" href="resources/css/contact.css" />

    <link href="https://fonts.googleapis.com/css2?family=Dancing+Script:wght@400;700&family=Source+Sans+Pro:ital,wght@0,900;1,700&display=swap" rel="stylesheet">
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Dancing+Script:wght@400;700&family=Source+Sans+Pro:ital,wght@0,900;1,700&display=swap');
    </style>
    <link href="https://fonts.googleapis.com/css2?family=Varela+Round&display=swap" rel="stylesheet">


</head>
<body>
<%@include file="WEB-INF/header.jsp" %>

<main>
    <article class="send-mail">

        <form action="kontakt" method="post">

            <div class="mail-content-div">
                <label for="mail-your-mail">Podaj swój mail</label>
                <input type="email" id="mail-your-mail" class="mail-topic" name="mail" >
            </div>

            <div class="mail-content-div">
                <label for="mail-topic">Temat</label>
                <input type="text" id="mail-topic" class="mail-topic" name="title" >
            </div>

            <div class="mail-content-div">
                <label for="mail-content">Treść</label>
                <textarea  id="mail-content" name="contentMsg"></textarea>
            </div>


            <input class="mail-submit" type="submit" value="Wyślij" />
        </form>
    </article>
</main>

<%@include file="WEB-INF/footer.jsp" %>
<script src="resources/js/jquery-3.4.1.min.js"></script>
<script src="resources/js/main.js"></script>
</body>
</html>
