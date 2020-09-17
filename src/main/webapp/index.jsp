<%-- This is a JSP directive --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%! int counter = 0; %>
<!-- This is an _instance variable_, and like servlet variables, this will persist between page loads -->

<% counter += 1; %>
<!-- Code between <% %> is run as arbitrary Java -->

<%-- Everything inside the JSP tags will be executed on the server. --%>
<%-- What the user sees is just the result of that execution,
        along with browser-rendered HTML, JS, and CSS --%>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Burgers 'R Us!" />
    </jsp:include>
</head>
<body>
<%@ include file="partials/navbar.jsp" %>
<div class="container">
<h1>Currently, <%= counter %> burgers served!</h1>

View the page source!

<%-- this is a JSP comment, you will *not* see this in the html --%>

<!-- this is an HTML comment, you *will* see this in the html -->

<!-- This will include all our BS JS code just before the closing body tag-->

<%-- Let's look at using implicit objects - (fun variables that have already been defined for us!) --%>
<p>Path: <%= request.getRequestURL() %></p>
<p>Query String: <%= request.getQueryString() %></p>
<p>"name" parameter: <%= request.getParameter("name") %></p>
<p>"method" attribute: <%= request.getMethod() %></p>
<p>User-Agent header: <%= request.getHeader("user-agent") %></p>

<%-- We didn't have to define 'request', because it's already in scope for us --%>


<jsp:include page="partials/closing-scripts.jsp" />
</div>
</body>
</html>