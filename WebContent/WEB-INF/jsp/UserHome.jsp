<%@ include file="/WEB-INF/jsp/Include.jsp"%>

<html>

	<div>
	
		<table border="1">
			<thead>
				<tr>
					<td>
						First Name
					</td>
					<td>
						Last Name
					</td>
					<td>
						Action
					</td>				
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${users}" var="user">
					<tr>
						<td>
							${user.firstName}
						</td>
						<td>
							${user.lastName}
						</td>
						<td>
							<a href="<%= request.getContextPath() %>/page/user/edit?id=${user.id}">Edit</a>
						</td>						
					</tr>
				</c:forEach>
			</tbody>		
		</table>
		
	</div>
	
	<script type="text/javascript">
		
		$( document ).ready( function(){
			
		});
	
	</script>

</html>