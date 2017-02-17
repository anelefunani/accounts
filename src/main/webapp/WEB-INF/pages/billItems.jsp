<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2017/02/15
  Time: 7:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Itemized Billing</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.css" rel="stylesheet">
        <link href="https://cdn.datatables.net/1.10.13/css/dataTables.bootstrap.css" rel="stylesheet">
        <script src="//code.jquery.com/jquery-1.12.4.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.js"></script>
        <script src="https://cdn.datatables.net/1.10.13/js/jquery.dataTables.js"></script>
        <script src="https://cdn.datatables.net/1.10.13/js/dataTables.bootstrap.js"></script>
        <%--<link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">--%>
        <%--<script src="<c:url value="/resources/lib/jquery-3.1.1.js" />"></script>--%>
        <%--<script src="<c:url value="/resources/lib/bootstrap.js" />"></script>--%>
        <script>
            $(document).ready(function() {
                $('#itemisedBilling').DataTable();
            } );
        </script>
    </head>
    <body>
        <div class="container">
            <h1>Itemized Billing</h1>
            <c:if test="${not empty billItems}">
                <table id="itemisedBilling" class="table table-striped table-bordered table-condensed table-hover">
                    <thead>
                    <tr class="info">
                        <th>Call Date</th>
                        <th>Call Time</th>
                        <td>Call Type</td>
                        <td>Call Cost</td>
                    </tr>
                    </thead>
                    <tfoot>
                    <tr class="info">
                        <th>Call Date</th>
                        <th>Call Time</th>
                        <td>Call Type</td>
                        <td>Call Cost</td>
                    </tr>
                    </tfoot>
                    <tbody>
                    <c:forEach items="${billItems}" var="billItem">
                        <tr>
                            <td>${billItem.callDate}</td>
                            <td>${billItem.callTime}</td>
                            <td>${billItem.callType}</td>
                            <td>${billItem.callCost}</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </c:if>
            <row>
                <form method="get" action="/">
                    <button type="submit" class="btn btn-info btn-success submit-button" name="itemisedBilling">
                        Back to Home Page</span>
                    </button>
                </form>
            </row>
        </div>
    </body>
</html>
