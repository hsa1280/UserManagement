<%@ include file="/WEB-INF/jsp/Include.jsp"%>

<html>

	<div>
	
		<form action="<%= request.getContextPath() %>/page/user/save" method="post">
		
			<table border="1">
				<tr>
					<td>First Name: </td>
					<td><form:input path="user.firstName"/></td>
				</tr>
				<tr>
					<td>Last Name: </td>
					<td><form:input path="user.lastName"/></td>
				</tr>
				<tr>
					<td>Email Address: </td>
					<td><form:input path="user.emailAddress"/></td>
				</tr>
				<tr>
					<td>Facility: </td>
					<td><form:select path="user.facility.id" itemLabel="name" itemValue="id" items="${facilities}"/></td>
				</tr>	
			</table>
			
			<form:hidden path="user.id"/>
			
			<input type="submit" value="Save"/>
			
		</form>
		
	</div>
	
	<script type="text/javascript">
		
		$( document ).ready( function(){
			
		});
	
	</script>

</html>