<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Itemized Billing</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="/resources/imports.jsp" rel="import">
        <script>
            $(document).ready(function() {
                $('#itemisedBilling').DataTable();
            } );
        </script>
    </head>
    <body class="body">
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
