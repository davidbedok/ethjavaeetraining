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
		<h1>List of Hungarian Coins</h1>
	</div>
    <form method="post" action="CoinList">
		<div>
			<label for="period">Period: </label>
			<select name="period" id="period">
				<option value="-1" ${requestScope.filterPeriod eq "-1" ? "selected=\"selected\"" : ""}>-</option>
				<c:forEach items="${requestScope.periods}" var="period">
					<option value="${period}" ${filterPeriod eq period ? "selected=\"selected\"" : ""}>${period}</option>
				</c:forEach>
			</select>			
			<input type="submit" value="Filter" />
		</div>
	</form>	
    <br/><br/>
	<c:choose>
	    <c:when test="${requestScope.coins.isEmpty()}">
            <span>The coin list is empty. Try to <a href="CoinList?period=-1">clear</a> the filter.</span>
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
		            </tr>
		        </thead>
		        <tbody>
		            <c:forEach items="${requestScope.coins}" var="coin">
		                <tr>
		                    <td>${coin.drawer.period}</td>
		                    <td class="centerrow">${coin.drawer.startYear} - ${coin.drawer.endYear}</td>
		                    <td class="centerrow">${coin.issuingYear}</td>
		                    <td>
		                    	<a href="Coin?catalog=${coin.catalogNumber}">
			                    	${coin.value} 
			                    	<c:choose>
									    <c:when test="${coin.whole}">${coin.drawer.denominationWhole}</c:when>
								        <c:otherwise>${coin.drawer.denominationPart}</c:otherwise>
									</c:choose>
								</a>
		                    </td>
		                    <td class="centerrow"><fmt:formatNumber value="${coin.weight}" maxFractionDigits="2"/></td>
		                    <td>${coin.type}</td>
		                </tr>
		            </c:forEach>
		        </tbody>
		    </table> 
        </c:otherwise>
	</c:choose>	
	<br/><br/>
    <div>
        <a href="Collections">Collections</a>&nbsp;
        <span>Coins</span>
    </div>
</body>
</html>