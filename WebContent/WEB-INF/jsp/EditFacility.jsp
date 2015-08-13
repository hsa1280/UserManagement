<%@ include file="/WEB-INF/jsp/Include.jsp"%>

<html>

	<div>
			
		<form action="<%= request.getContextPath() %>/page/facility/save" method="post">
		
			<table border="1">
				<tr>
					<td>Facility Name: </td>
					<td><form:input path="facility.name"/></td>
				</tr>
				<tr>
					<td>Facility Address: </td>
					<td><form:input path="facility.address"/></td>
				</tr>
				
				<tr>
					<td>Users: </td>
					<td>
						<ul>
							<c:forEach items="${users}" var="user">
								<li>
									${user.firstName} ${user.lastName}
								</li>
							</c:forEach>
						</ul>
					</td>
				</tr>	
			</table>
			
			<form:hidden path="facility.id"/>
			
			<input type="submit" value="Save"/>
			<!-- <input type="submit" value="Delete"/> -->
			
		</form>
		
	</div>
	
	<script type="text/javascript">
		
		$( document ).ready( function(){
			
		});

	
	</script>

</html>