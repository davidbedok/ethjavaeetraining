<%@ page import="java.security.Principal" %>
<% 
	Principal principal = request.getUserPrincipal();
	if ( principal != null ) { %>
		<div class="userbox">
			Welcome <strong><%= principal.getName() %></strong>!&nbsp;
			<a href="Collections?user=<%= principal.getName() %>">Own collection</a>&nbsp;
			<a href="Logout">Logout</a>&nbsp;
		</div>	
		<br/>	
	<% }
%>
