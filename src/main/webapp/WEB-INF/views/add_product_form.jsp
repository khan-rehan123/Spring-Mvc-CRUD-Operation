<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<%@include file="./base.jsp"%>
</head>
<body class="bg-2#2#2#">
	<div class="container mt-4">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-header">
						<h3 class="text-center">Fill The Product Details</h3>
					</div>
					<div class="card-body">
						<form action="handle-product" method="post">
							<div class="mb-3">
								<label for="exampleInputEmail1" class="form-label">Product
									Name</label> <input type="text" class="form-control" name="name"
									id="exampleInputEmail1" aria-describedby="emailHelp"
									placeholder="Enter Product Name">

							</div>
							<div class="mb-3">
								<label for="exampleInputEmail1" class="form-label">Product
									Description</label>
								<textarea rows="5" class="form-control" name="description"
									placeholder="Enter Product Description"></textarea>
								

							</div>
							<div class="mb-3">
								<label for="exampleInputEmail1" class="form-label">Product
									Price</label> <input type="text" class="form-control" name="price"
									id="exampleInputEmail1" aria-describedby="emailHelp"
									placeholder="Enter Product Price">

							</div>

							<div class="text-center">
								<a href="${pageContext.request.contextPath }/" class="btn btn-outline-danger">Back</a>
								<button type="submit" class="btn btn-primary">Add</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>