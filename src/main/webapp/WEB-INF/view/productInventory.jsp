<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@include file="/WEB-INF/view/template/header.jsp"%>

<div class="container-wrapper">
	<div class="container">
		<div class="page-header">
			<h1>Product Inventory Page</h1>

			<p class="lead">This is the product inventory page!</p>
		</div>

		<h3>
			<a href="<c:url value="/admin/productInventory"/>">Product inventory</a>
		</h3>
		
		<p>Here you can view, check and modify the product inventory!</p>
		
		<table class="table table-striped table-hover">
			<thead>
				<tr class="bg-success">
					<th>Photo Thumb</th>
					<th>Product Name</th>
					<th>Category</th>
					<th>Condition</th>
					<th>Price</th>
				</tr>
			</thead>
			<c:forEach items="${products}" var="product">
				<tr>
					<td><img src="<c:url value="/resources/images/${product.id}.png"/>" alt="image" style="width: 100%"/></td>
					<td>${product.name}</td>
					<td>${product.category}</td>
					<td>${product.condition}</td>
					<td>${product.price} USD</td>
					<td>
						<!-- view product -->
						<a href="<spring:url value="/product/viewProduct/${product.id}" />">
							<span class="glyphicon glyphicon-info-sign"></span>
						</a>
						<!-- delete product -->
						<a href="<spring:url value="/admin/product/deleteProduct/${product.id}" />">
							<span class="glyphicon glyphicon-remove"></span>
						</a>
						<%-- edit product --%>
						<a href="<spring:url value="/admin/product/editProduct/${product.id}" />">
							<span class="glyphicon glyphicon-pencil"></span>
						</a>
					</td>
				</tr>
			</c:forEach>
		</table>
		
		<a class="btn btn-primary" href="<spring:url value="/admin/product/addProduct"/>">Add Product</a>
		
		<!-- FOOTER -->
		<%@include file="/WEB-INF/view/template/footer.jsp"%>
	</div>
</div>
<!-- /.container -->

<%@include file="/WEB-INF/view/template/libraries.jsp"%>