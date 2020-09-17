<<<<<<< HEAD
<%-- This is a page directive, that will apply to the entire page --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%-- Let's take a look at an instance variable, and like servlet variables, this will persist between page loads --%>
<%! int counter = 0; %>


<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Burgers 'R Us" />
    </jsp:include>
</head>
<body>
<div class="container">
    <h1>Welcome to Burgers 'r Us!</h1>
    <p>Currently <%= counter %> million burgers sold</p>

    <%-- Let's take a look at some implicit objects, available to us with JSP --%>
    <p><strong>Path:</strong> <%= request.getRequestURL() %></p>
    <p><strong>Query String:</strong> <%= request.getQueryString() %></p>
    <p><strong>"burgers" parameter:</strong> <%= request.getParameter("burgers") %></p>
    <p><strong>User-Agent header:</strong> <%= request.getHeader("user-agent") %></p>
    <p><strong>Response Status:</strong> <%= response.getStatus() %></p>
    <p><strong>All the param values:</strong> ${paramValues}</p>
    <p><strong>Size of Session Scope:</strong> ${sessionScope.size()}</p>

    <%-- Use JSTL to iterate through our list of burgers --%>
    <h2>Here is our menu!</h2>

    <%-- Only display the burger menu if `truthiness` is true--%>
    <c:choose>
        <c:when test="${truthiness}">
            <c:forEach items="${completeBurgerList}" var="burger">
                <li><strong>${burger.burgerName}</strong></li>
            </c:forEach>
        </c:when>
        <c:otherwise>
            <p>We currently don't have any food.</p>
        </c:otherwise>
    </c:choose>
    <ul>
    </ul>


</div>



<%-- Now let's run some arbitrary Java code, to increment the counter by 1 every time we reload this page --%>
<% counter += 1; %>
<jsp:include page="partials/scripts.jsp" />
</body>
</html>
=======
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
>>>>>>> 0d9ff3167c45b6b6169cea17441da2631cdbcef7
