<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<html lang="pl">
<head>
    <title>RentCar - Strona główna</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">

    <meta name="description" content="Wypożycz auto" />
    <meta name="keywords" content="wypożyczalnia aut, samochody do najmu, tanie auta" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta author="Marcin Pacana" />

    <link rel="stylesheet" href="resources/css/main.css" />
    <link rel="stylesheet" href="resources/css/index.css" />

    <link href="https://fonts.googleapis.com/css2?family=Dancing+Script:wght@400;700&family=Source+Sans+Pro:ital,wght@0,900;1,700&display=swap" rel="stylesheet"/>
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Dancing+Script:wght@400;700&family=Source+Sans+Pro:ital,wght@0,900;1,700&display=swap');
    </style>
    <link href="https://fonts.googleapis.com/css2?family=Varela+Round&display=swap" rel="stylesheet">


</head>
<body>

<%@include file="WEB-INF/header.jspf" %>

<main>
    <article id="quick-rent">
        <form>
            <div class="quck-rent-input">
                <div class="from">
                    <label for="quick-rent-from">Data odbioru</label>
                    <input type="date" id="quick-rent-from">
                </div>

                <div class="to">
                    <label for="quick-rent-to">Data zwrotu</label>
                    <input type="date" id="quick-rent-to">
                </div>
            </div>

            <input class="quick-rent-submit" type="submit" value="Szukaj">
        </form>
    </article>

    <article id="comments">
        <section>
            <div class="comment-head">
                <p class="comment-user">User</p> <p class="comment-date">data</p>
            </div>
            <div class="comment-content">
                <p>Żółw jest różowy</p>
            </div>
        </section>

        <section>
            <div class="comment-head">
                <p class="comment-user">User</p> <p class="comment-date">data</p>
            </div>
            <div class="comment-content">
                <p>ĄĘ ąę ćś</p>
            </div>
        </section>

        <section>
            <div class="comment-head">
                <p class="comment-user">User</p> <p class="comment-date">data</p>
            </div>
            <div class="comment-content">
                <p>To jest komentarz numer 3</p>
            </div>
        </section>
    </article>
</main>

<%@include file="WEB-INF/footer.jspf" %>
<script src="resources/js/jquery-3.4.1.min.js"></script>
<script src="resources/js/main.js"></script>
</body>
</html>
