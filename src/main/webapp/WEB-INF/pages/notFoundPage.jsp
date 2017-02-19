<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result not Found</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="/resources/imports.jsp" rel="import">
</head>
<body class="body">
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
