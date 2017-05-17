<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.ericsson.ci.ejbserviceclient.domain.CoinStub" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<% CoinStub coin = (CoinStub) request.getAttribute("coin"); %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="style/page.css" />
<title>:: Coin ::</title>
</head>
<body>
	<div id="headerline">
		<h1><%= coin.getFullName() %></h1>
	</div>
	<fieldset>
		<legend>Drawer (<%= coin.getDrawer().getIdentifier() %>)</legend>
	    <div><label>Country: </label><span><%= coin.getDrawer().getCountry() %></span></div>
   		<div><label>Period: </label><span><%= coin.getDrawer().getPeriod() %></span></div>
   		<div><label>Years: </label><span><%= coin.getDrawer().getStartYear() %> - <%= coin.getDrawer().getEndYear() %></span></div>
    	<div><label>Denominations: </label><span><%= coin.getDrawer().getDenomination() %></span></div>
	</fieldset>
	<fieldset>
		<legend>Coin (<%= coin.getCatalogNumber() %>)</legend>
 	   	<div><label>Issuing date: </label><span><%= coin.getIssuingYear() %></span></div>
    	<div><label>Description: </label><span><%= coin.getDescription() %></span></div>
    	<div><label>Observe: </label><span><%= coin.getObserve() %></span></div>
    	<div><label>Reverse: </label><span><%= coin.getReverse() %></span></div>
    	<div><label>Weight: </label><span><fmt:formatNumber value="<%= coin.getWeight() %>" maxFractionDigits="2"/></span></div>
    	<div><label>Type: </label><span><%= coin.getType() %></span></div>
	</fieldset>
	<br/><br/>
    <div>
        <a href="CoinList">back</a>
    </div>	
</body>
</html>