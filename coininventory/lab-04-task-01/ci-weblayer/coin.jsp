<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.ericsson.ci.ejbserviceclient.domain.CoinStub" %>
<% CoinStub coin = (CoinStub) request.getAttribute("coin"); %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="style/page.css" />
<title>:: Coin ::</title>
</head>
<body>
    <h1><%= coin.getFullName() %></h1>
    <div><label>Drawer: </label><span><%= coin.getDrawer().getCountry() %> : <%= coin.getDrawer().getPeriod() %> (<%= coin.getDrawer().getIdentifier() %>)</span></div>
    <div><label>Years: </label><span><%= coin.getDrawer().getStartYear() %> - <%= coin.getDrawer().getEndYear() %></span></div>
    <div><label>Denominations: </label><span><%= coin.getDrawer().getDenomination() %></span></div>
    <div><label>Issuing date: </label><span><%= coin.getIssuingYear() %></span></div>
    <div><label>Description: </label><span><%= coin.getDescription() %></span></div>
    <div><label>Observe: </label><span><%= coin.getObserve() %></span></div>
    <div><label>Reverse: </label><span><%= coin.getReverse() %></span></div>
    <div><label>Weight: </label><span><%= coin.getWeight() %></span></div>
    <div><label>Type: </label><span><%= coin.getType() %></span></div>
    <div><label>Quality: </label><span>-</span></div>
    <div><label>Quantity: </label><span>-</span></div>
</body>
</html>