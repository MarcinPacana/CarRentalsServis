<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<header id="main-header">
    <div class="logo">
        <div class="logo-content">
            <p class="logo-content-first">CAR</p><p class="logo-content-second">RENTAL</p>
        </div>
    </div>

    <nav class="nav-top">
        <ul class="main-menu">
            <li><a href="home">Strona główna</a></li>
            <li><a href="oferta">Oferta</a></li>
            <li><a href="info">Informacje</a></li>
            <li><a href="kontakt">Kontakt</a></li>
        </ul>

        <c:choose>
        <c:when test="${sessionScope.user != null}">
            <ul class="login" id="not-logged-in">
                <li><a id="login">${sessionScope.user.mail}</a>
                    <div class="login-content">
                        <form action="user" method="get">
                            <div class="log-user">
                                <input type="submit" value="Moje konto">
                            </div>
                        </form>
                        <form action="LogOutServlet" method="post">
                            <input class="login-submit" type="submit" value="Wyloguj się">
                        </form>
                    </div>
                </li>
            </ul>
        </c:when>
            <c:otherwise>
                <ul class="login" id="not-logged-in">
                    <li><a id="login">Zaloguj się</a>
                        <div class="login-content">
                            <form action="login" method="post">
                                <div class="login-input">
                                    <input type="text" name="email" placeholder="e-mail">
                                    <input type="password" name="pwd" placeholder="hasło">
                                </div>
                                <input class="login-submit" type="submit" value="Zaloguj się">
                                <c:if test="${errorLogin != null}">
                                    <script language="javascript">
                                        downLog();
                                    </script>
                                </c:if>
                                ${errorLogin}
                            </form>
                        </div>
                    </li>
                    <li><a href="register">Zarejestruj się</a></li>
                </ul>
            </c:otherwise>
        </c:choose>
    </nav>

</header>