<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2017/02/14
  Time: 5:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
  <head>
	<title>Accounts</title>
	    <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="/resources/imports.jsp" rel="import">
  </head>
  <body class="body">
    <div class="container">
	  <h1>Accounts Listing</h1>
		<c:if test="${not empty data}">
		  <table class="table table-striped table-bordered table-condensed table-hover">
			<tr class="info">
			  <th>Id</th><th>Account Number</th>
			</tr>
			<c:forEach items="${data}" var="account">
			  <tr>
				<td>${account.accountId}</td><td>${account.accountNumber}</td>
			  </tr>
			</c:forEach>
		  </table>
		</c:if>
	</div>

  </body>
</html>