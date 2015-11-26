<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>JuJaWeb</title>
    <link rel="shortcut icon" href="resources/images/gt_favicon.png">
    <link rel="stylesheet" href="resources/css/bootstrap.min.css">
    <link rel="stylesheet" href="resources/css/font-awesome.min.css">
    <link rel="stylesheet" href="resources/css/bootstrap-theme.css" media="screen">
    <link rel="stylesheet" href="resources/css/main.css">
    <script src="resources/js/html5shiv.js"></script>
    <script src="resources/js/respond.min.js"></script>
</head>
<body class="home">

<jsp:include page="home/navbar.jsp" flush="true"/>

<jsp:include page="home/header.jsp" flush="true"/>

<c:choose>

    <c:when test="${currentPage eq 'sqlcmd'}">
        <jsp:include page="sqlcmd/introSQLcmd.jsp" flush="true"/>
        <c:choose>
            <c:when test="${connect eq true}">
                <jsp:include page="sqlcmd/tabsSQLcmd.jsp" flush="true"/>
            </c:when>
            <c:otherwise>
                <jsp:include page="sqlcmd/connectSQLcmd.jsp" flush="true"/>
                <c:choose>
                    <c:when test="${exception eq true}">
                        <h2>Ошибка ввода данных</h2>
                    </c:when>
                </c:choose>
            </c:otherwise>
        </c:choose>
    </c:when>

    <c:when test="${currentPage eq 'help'}">
        <jsp:include page="help/introHelp.jsp" flush="true"/>
    </c:when>

    <c:otherwise>
        <jsp:include page="home/intro.jsp" flush="true"/>
        <jsp:include page="home/jumbotron.jsp" flush="true"/>
        <jsp:include page="home/container.jsp" flush="true"/>
    </c:otherwise>

</c:choose>

<jsp:include page="home/footer.jsp" flush="true"/>

<script src="resources/js/jquery.min.js"></script>
<script src="resources/js/bootstrap.min.js"></script>
<script src="resources/js/headroom.min.js"></script>
<script src="resources/js/jQuery.headroom.min.js"></script>
<script src="resources/js/script-jquery.js"></script>
<script src="resources/js/jquery.form.js"></script>
</body>
</html>