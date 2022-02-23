<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Customers Receipts</title>
	</head>
	<body>
		<h1>Customer Name: <c:out value="${name}" /></h1>
		<h3>Item name: <c:out value="${itemName}"/></h3>
		<h3>Price: $<c:out value="${price}"/></h3>
		<h3>Description: <c:out value="${description}"/></h3>
		<h3>Vendor: <c:out value="${vendor}"/></h3>
		<br />
		<hr />
		<br />
		<h1>Customer Name: <c:out value="${name2}" /></h1>
		<h3>Item name: <c:out value="${itemName2}"/></h3>
		<h3>Price: $<c:out value="${price2}"/></h3>
		<h3>Description: <c:out value="${description2}"/></h3>
		<h3>Vendor: <c:out value="${vendor2}"/></h3>
		
	</body>
</html>