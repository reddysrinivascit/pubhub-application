<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Register</title>
</head>
<body>

	<%@ include file="../../layout/header.jsp"%>
	<div class="container-fluid">

		<div class="row">
			<div class="col-md-6">

				
				<h5>Create a New Account</h5>
				
				<br/>
				
				<c:forEach items="${errors}" var="error">
					<font color="red"><c:out value="${error.defaultMessage}"  /></font> <br/>
				</c:forEach>
				
				<c:if test="${not empty ERROR_MESSAGE}">
					<font color="red"><c:out value="${ERROR_MESSAGE}" /></font> <br/>
				</c:if>
				
				
				<form id="addUserFrm" class="form-horizontal" role="form"
					method="POST" action="../auth/register">

					<div class="form-group">
						<label for="name">NAME:</label><input type="text"
							class="form-control" name="name" required="required" id="name" value="${regFormData.name.trim()}" />
					</div>

					<div class="form-group">
						<label for="emailID">E-MAILID:</label><input type="emailID"
							class="form-control" name="emailID" required="required" id="emailID"  value="${regFormData.emailID.trim()}"/>
					</div>
					<div class="form-group">
						<label for="username">USERNAME:</label><input type="username"
							class="form-control" name="username" required="required" id="username"  value="${regFormData.usernsme.trim()}"/>
					</div>
					
					<div class="form-group">
						<label for="password">PASSWORD:</label><input type="password"
							class="form-control" name="password" required="required"
							id="password" />
					</div>
					<div class="form-group">
						<label for="mobileNumber">MOBILE NUMBER:</label><input type="mobileNumber"
							class="form-control" name="mobileNumber" required="required" id="mobileNumber"  value="${regFormData.mobileNumber.trim()}"/>
					</div>
					<div class="form-group">
						<label for="active">ACTIVE:</label><input type="active"
							class="form-control" name="active" required="required" id="active"  value="${regFormData.active.trim()}"/>
					</div>
					<div class="form-group">
						<label for="roleId">roleID:</label><input type="roleID"
							class="form-control" name="roleID" required="required" id="roleId"  value="${regFormData.roleID.trim()}"/>
					</div>
					
					
					<div class="form-group">
						<button type="submit" class="btn btn-success" id="addUserBtn">Create
							Account</button>
					</div>
					<hr />
					<div class="form-group">
						Already have an account? &nbsp;&nbsp; <a href="../"
							class='btn btn-primary'> SIGN IN</a>
					</div>
				</form>

			</div>
		</div>
	</div>
</body>

</html>