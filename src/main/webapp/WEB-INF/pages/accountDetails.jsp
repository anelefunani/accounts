<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
    <head>
        <title>Account Details</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="/resources/imports.jsp" rel="import">
    </head>
    <body class="body">
    <div class="container">
        <h1>Account Information</h1>
            <table class="table table-striped table-bordered table-condensed table-hover">
                <tr class="info">
                    <th>Account Number</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Email</th>
                    <th>Invoice Id</th>
                    <th>Opening Balance</th>
                    <th>Closing Balance</th>
                    <th>Invoice Due Date</th>
                    <th>View Details</th>
                </tr>
                <tr>
                    <td><c:out value="${accountInformation.accountNumber}"/></td>
                    <td><c:out value="${accountInformation.firstName}"/></td>
                    <td><c:out value="${accountInformation.lastName}"/></td>
                    <td><c:out value="${accountInformation.email}"/></td>
                    <td><c:out value="${accountInformation.invoiceId}"/></td>
                    <td><c:out value="${accountInformation.openingBalance}"/></td>
                    <td><c:out value="${accountInformation.closingBalance}"/></td>
                    <td><c:out value="${accountInformation.dueDate}"/></td>
                    <td>
                        <spring:url value="/billItems" var="billItems" />
                        <form:form  action="/billItems" modelAttribute="invoiceId" method="post">
                            <input id="invoiceId" name="invoiceId" hidden="true" value="${accountInformation.invoiceId}">
                            <button type="submit" class="btn btn-info btn-success submit-button" name="itemisedBilling">
                                Itemised Billing <span class="glyphicon glyphicon-play"></span>
                            </button>
                        </form:form>
                    </td>
                </tr>
            </table>
        <row>
            <form method="get" action="/">
                <button type="submit" class="btn btn-info btn-success submit-button" name="itemisedBilling">
                    Back to Search <span class="glyphicon glyphicon-search"></span>
                </button>
            </form>
        </row>
    </div>
    </body>
</html>
