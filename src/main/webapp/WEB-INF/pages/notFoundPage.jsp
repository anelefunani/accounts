<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2017/02/17
  Time: 4:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result not Found</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.css" rel="stylesheet">
  <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.js"></script>
  <style>
    .parent {
      position: relative;
    }

    .child {
      width: 380px;
      height: 100px;
      padding: 20px;

      position: absolute;
      top: 20%;
      left: 50%;

      margin: -70px 0 0 -170px;
    }
  </style>
</head>
<body>
    <div class="container parent child" >
      <div class="alert alert-danger">
        <strong>Acoount number ${account.accountNumber} Does not exist!</strong>
      </div>
      <row>
        <form method="get" action="/">
          <button type="submit" class="btn btn-info btn-success submit-button" name="errorPage">
            Back to Home Page</span>
          </button>
        </form>
      </row>
    </div>
</body>
</html>
