<%@ include file="/WEB-INF/jsp/Include.jsp"%>

<html>

	<div>
	
	
		<table border="1">
			<thead>
				<tr>
					<td>
						Address
					</td>
					<td>
						Name
					</td>
					<td colspan = 2>
						Action
					</td>				
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${facilities}" var="facility">
					<tr>
						<td>
							${facility.address}
						</td>
						<td>
							${facility.name}
						</td>	
						<td>
							<a href="<%= request.getContextPath() %>/page/facility/edit?id=${facility.id}">Edit</a>
						</td>	
						<td>
						<input type="button" onclick="deleteConfirm('${facility.id}')" value="Delete" />
							<div id="dialog-confirm" class="primaryButton" style="display: none;" title="Delete Confirmation">
								<p style = "padding-top: 30px">
									Are you sure you want to delete this record?
								</p>
							</div>
						</td>						
					</tr>
				</c:forEach>
			</tbody>		
		</table>
		
	</div>
	
	<script type="text/javascript">
	
		function deleteConfirm(id) {
			
			$(function() {
				$( "#dialog-confirm" ).dialog({
					resizable : false,
					width: 350,
					modal : true,
					buttons : {
						Delete : function() {
							document.location.href="<%= request.getContextPath() %>/page/facility/delete?id=" + id;
						},
						Cancel : function() {
							$( this ).dialog( "close" );
						}
					}
				});
				
			});
		}
	</script>
	
	

</html>