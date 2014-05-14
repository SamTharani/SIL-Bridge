<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>

<!DOCTYPE html>
<html lang="en">

<head>

    <title><decorator:title default='This is the default title'/></title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta name="apple-mobile-web-app-capable" content="yes">

    <link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet" type="text/css"/>
    <link href="<c:url value="/resources/css/bootstrap-responsive.min.css"/>" rel="stylesheet" type="text/css"/>

    <link href="<c:url value="/resources/css/font-awesome.css"/>" rel="stylesheet">
    <link href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,400,600" rel="stylesheet">

    <link href="<c:url value="/resources/css/pages/dashboard.css"/>" rel="stylesheet" type="text/css">
    <link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet" type="text/css">
    <link href="<c:url value="/resources/css/pages/signin.css"/>" rel="stylesheet" type="text/css">
    <link href="<c:url value="/resources/css/multi-select.css"/>" rel="stylesheet" type="text/css">
    <decorator:head/>
</head>

<body>

<div class="navbar navbar-fixed-top">
    <div class="navbar-inner">
        <div class="container">
            <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </a>
            <a class="brand" href="/sil-web/login">
                SIL-Bridge
            </a>
            <div class="nav-collapse">
                <ul class="nav pull-right">
                    <li class="">
                        <a href="/sil-web/login" class="">
                            Already have an account? Login now
                        </a>
                    </li>
                    <li class="">
                        <a href="/sil-web/index" class="">
                            <i class="icon-chevron-left"></i>
                            Back to Homepage
                        </a>

                    </li>
                </ul>

            </div>
            <!--/.nav-collapse -->
        </div>
        <!-- /container -->
    </div>
    <!-- /navbar-inner -->
</div>
<!-- /navbar -->
<decorator:body/>



<script src="<c:url value="/resources/js/jquery-1.7.2.min.js"/>"></script>
<script src="<c:url value="/resources/js/project-title/jquery.multi-select.js"/>"></script>

<%--<script src="<c:url value="/resources/js/jquery-1.7.2.min.js"/>"></script>--%>
<script src="<c:url value="/resources/js/bootstrap.js"/>"></script>

<script src="<c:url value="/resources/js/signin.js"/>"></script>
<script src="<c:url value="/resources/js/base.js"/>"></script>

<script type="text/javascript">
    $('#my-select').multiSelect();
</script>



</body>

</html>

