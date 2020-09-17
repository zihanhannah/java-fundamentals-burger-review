<%-- This is a JSP directive --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%! int counter = 0; %>
<!-- This is an _instance variable_, and like servlet variables, this will persiste between apge loads -->

<% counter += 1; %>
<!-- Code between <% %> is run as arbitrary Java -->

<%-- Everything inside the JSP tags will be executed on the server. --%>
<%-- What the user sees is just the result of that execution,
        along with browser-rendered HTML, JS, and CSS --%>
<html>
<head>
    <title>Burgers 'R Us</title>
</head>
<body>
<%@ include file="partials/navbar.jsp" %>
<h1>Currently, <%= counter %> burgers served!</h1>

View the page source!

<%-- this is a JSP comment, you will *not* see this in the html --%>

<!-- this is an HTML comment, you *will* see this in the html -->

<!-- This will include all our BS JS code just before the closing body tag
<jsp:include page="partials/closing-scripts.jsp"></jsp:include>
</body>
</html>