<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.Set" %>  
<%@ page import="java.util.List" %>
<%@ page import="com.ericsson.ci.ejbserviceclient.domain.CoinStub" %>
<%@ page import="com.ericsson.ci.ejbserviceclient.domain.CoinTypeStub" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="style/page.css" />
<title>:: Coins ::</title>
</head>
<body>
    <h1>List of Coins</h1>
	<br/><br/>
    <table class="list">
        <thead>
            <tr>
            	<th>Period</th>
                <th>Start-End</th>
                <th>Issuing Year</th>
                <th>Value</th>
                <th>Weight</th>
                <th>Type</th>
                <th>Quality</th>
                <th>Quantity</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${requestScope.coins}" var="coin">
                <tr>
                    <td>${coin.drawer.period}</td>
                    <td>${coin.drawer.startYear} - ${coin.drawer.endYear}</td>
                    <td>${coin.issuingYear}</td>
                    <td>
                    	<a href="Coin?catalog=${coin.catalogNumber}">
	                    	${coin.value} 
	                    	<c:choose>
							    <c:when test="${coin.whole}">${coin.drawer.denominationWhole}</c:when>
						        <c:otherwise>${coin.drawer.denominationPart}</c:otherwise>
							</c:choose>
						</a>
                    </td>
                    <td>${coin.weight}</td>
                    <td>${coin.type}</td>
                    <td>-</td>
                    <td>-</td>
                </tr>
            </c:forEach>
        </tbody>
    </table> 
</body>
</html>