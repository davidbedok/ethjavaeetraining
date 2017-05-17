<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.Set" %>  
<%@ page import="java.util.List" %>
<%@ page import="com.ericsson.ci.ejbserviceclient.domain.CoinStub" %>
<%@ page import="com.ericsson.ci.ejbserviceclient.domain.CoinTypeStub" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="style/page.css" />
<title>:: Coins ::</title>
</head>
<body>
	<div id="headerline">
		<h1>User collections</h1>
	</div>
    <c:choose>
	    <c:when test="${requestScope.collections.isEmpty()}">
            <span>The user hasn't got any coins.</span>
        </c:when>
        <c:otherwise>     
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
		                <th>&nbsp;</th>
		            </tr>
		        </thead>
		        <tbody>
		            <c:forEach items="${requestScope.collections}" var="collection">
		                <tr>
		                    <td>${collection.coin.drawer.period}</td>
		                    <td class="centerrow">${collection.coin.drawer.startYear} - ${collection.coin.drawer.endYear}</td>
		                    <td class="centerrow">${collection.coin.issuingYear}</td>
		                    <td>
		                    	<a href="Coin?catalog=${collection.coin.catalogNumber}">
			                    	${collection.coin.value} 
			                    	<c:choose>
									    <c:when test="${collection.coin.whole}">${collection.coin.drawer.denominationWhole}</c:when>
								        <c:otherwise>${collection.coin.drawer.denominationPart}</c:otherwise>
									</c:choose>
								</a>
		                    </td>
		                    <td class="centerrow"><fmt:formatNumber value="${collection.coin.weight}" maxFractionDigits="2"/></td>
		                    <td>${collection.coin.type}</td>
		                    <td>${collection.quality.label}</td>
		                    <td class="centerrow">${collection.quantity}</td>
		                    <td class="centerrow"><a class="deleteicon" href="CollectionDelete?catalog=${collection.coin.catalogNumber}&quality=${collection.quality}">&nbsp;</a></td>
		                </tr>
		            </c:forEach>
		        </tbody>
		    </table> 
        </c:otherwise>
	</c:choose>	
	<br/><br/>
    <div>
        <span>Collections</span>
        <a href="CoinList">Coins</a>&nbsp;
    </div>	
</body>
</html>