<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
  <title>Accounts</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="/resources/imports.jsp" rel="import">

	<script>
	$(document).ready(function() {
	  $('#accountSearch').bootstrapValidator({
		container: '#messages',
		feedbackIcons: {
		  valid: 'glyphicon glyphicon-ok',
		  invalid: 'glyphicon glyphicon-remove',
		  validating: 'glyphicon glyphicon-refresh'
		},
		submitButtons: 'button[name="search"]',
		fields: {
		  accountNumber: {
			validators: {
			  notEmpty: {
				message: 'The account number is required and cannot be empty'
			  },
			  stringLength: {
				max: 8,
				min: 8,
				message: 'MUST be 8 characters long.'
			  },
			  regexp: {
				regexp: /^[A-z][0-9]{7}$/,
				message: 'MUST start with a Letter followed by 7 Digits.'
			  }
			}
		  }
		}
	  })
	});
  </script>
</head>
  <body class="body">
	<div class="container">
	  <spring:url value="/accountSearch" var="accountNumberSearch" />
	  <form:form id="accountSearch" class="form-vertical col-md-4 col-md-offset-4"
				 method="post" modelAttribute="account" action="/accountSearch">
		<h1>
		  Account Search <i class="glyphicon glyphicon-search" aria-hidden="true"></i>
		</h1>
		<div class="form-group">
		  <label class="control-label" for="accountNumber" style="margin: 5px">Account Number</label>
		  <div class="input-group">
			<span class="input-group-addon" style="margin-left: 5px">#</span>
			<input type="text" class="form-control" id="accountNumber" name="accountNumber"
				   placeholder="Enter an Account Number e.g. A0000001"
				   maxlength="8">
		  </div>
		  <div class="form-group">
			<div>
			  <div id="messages"></div>
			</div>
		  </div>
		  <div class="col-md-4 col-md-offset-4">
			<button type="submit" class="btn btn-info btn-success submit-button" name="search" disabled style="margin: 5px">
			  <span class="glyphicon glyphicon-search"></span> Search
			</button>
		  </div>
		</div>
	  </form:form>
	</div>
  </body>
</html>