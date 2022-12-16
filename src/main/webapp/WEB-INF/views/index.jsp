<html>
<head>
<%@ include file="./base.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<body>
	<div class="container mt-4">
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center mb-3">Welcome to Product List</h1>
				<table class="table">
					<thead class="thead-dark">
						<tr class="while">
							<th scope="col">ID</th>
							<th scope="col">Product Name</th>
							<th scope="col">Description</th>
							<th scope="col">Price</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${product }" var="pro">
							<tr>
								<th scope="row">TECHONLY${pro.id }</th>
								<td>${pro.name }</td>
								<td>${pro.description }</td>
								<td class="font-weight-bold">&#x20B9; ${pro.price }</td>
								<td>
								<a href="delete/${pro.id }" class="fa fa-trash course-pointer" style="font-size:30px;color:red"></a>
								<a href="update/${pro.id }" class="fa fa-pencil-square-o" style="font-size:30px"></a>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<div class="container text-center">
					<a href="add-product" class="btn btn-outline-success">Add
						Product</a>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
