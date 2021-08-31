<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: ilona
  Date: 31.08.2021
  Time: 19:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <meta http-equiv="X-UA-Compatible" content="ie=edge"/>
    <link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet">
    <title>Rejestracja</title>
</head>
<body>
<header>
    <nav class="container container--70">
        <ul class="nav--actions">
            <li><a href="/login">Zaloguj</a></li>
            <li class="highlighted"><a href="/register">Załóż konto</a></li>
            <li class="btn btn--small btn--without-border"><a href="/logout">Wyloguj</a></li>
        </ul>

        <ul>
            <li><a href="/" class="btn btn--without-border active">Start</a></li>
            <li><a href="index.html#steps" class="btn btn--without-border">O co chodzi?</a></li>
            <li><a href="index.html#about-us" class="btn btn--without-border">O nas</a></li>
            <li><a href="index.html#help" class="btn btn--without-border">Fundacje i organizacje</a></li>
            <li><a href="index.html#contact" class="btn btn--without-border">Kontakt</a></li>
        </ul>
    </nav>
</header>

<section class="login-page">
    <h2>Załóż konto</h2>
    <form:form method="post" modelAttribute="user">
        <form:errors path="*"/>
        <form:hidden path="id"/>
        <div class="form-group">
            <form:input path="firstname" placeholder="Imię" type="text"/><br>
            <form:errors path="firstname"/><br>
        </div>
        <div class="form-group">
            <form:input path="lastname" placeholder="Nazwisko" type="text"/><br>
            <form:errors path="lastname"/><br>
        </div>
        <div class="form-group">
            <form:input path="email" type="email" placeholder="Email"/>
            <form:errors path="email"/>
        </div>
        <div class="form-group">
            <form:input type="password" path="password" placeholder="Hasło"/>
            <form:errors path="password"/><br>
        </div>
        <%--        <div class="form-group">--%>
        <%--            <input type="password" name="password2" placeholder="Powtórz hasło"/>--%>
        <%--            --%>
        <%--        </div>--%>

        <div class="form-group form-group--buttons">
            <a href="/login" class="btn btn--without-border">Zaloguj się</a>
            <button class="btn" type="submit">Załóż konto</button>
        </div>
    </form:form>

</section>

<footer>
    <div class="contact">
        <h2>Skontaktuj się z nami</h2>
        <h3>Formularz kontaktowy</h3>
        <form>
            <div class="form-group form-group--50">
                <input type="text" name="name" placeholder="Imię"/>
            </div>
            <div class="form-group form-group--50">
                <input type="text" name="surname" placeholder="Nazwisko"/>
            </div>

            <div class="form-group">
            <textarea
                    name="message"
                    placeholder="Wiadomość"
                    rows="1"
            ></textarea>
            </div>

            <button class="btn" type="submit">Wyślij</button>
        </form>
    </div>
    <div class="bottom-line">
        <span class="bottom-line--copy">Copyright &copy; 2018</span>
        <div class="bottom-line--icons">
            <a href="#" class="btn btn--small"
            ><img src="images/icon-facebook.svg"
            /></a>
            <a href="#" class="btn btn--small"
            ><img src="images/icon-instagram.svg"
            /></a>
        </div>
    </div>
</footer>
</body>
</html>
