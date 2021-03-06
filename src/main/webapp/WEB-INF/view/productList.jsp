<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@include file="/WEB-INF/view/template/header.jsp"%>

<script>
	$(document).ready(function () {
		var searchCondition = '${searchCondition}';
		$('.table').DataTable({
            "lengthMenu": [[1, 2, 3, 5, 10, -1], [1, 2, 3, 5, 10, "All"]],
            "oSearch": {"sSearch" : searchCondition}
        });
    });
</script>

<div class="container-wrapper">
	<div class="container">
		<div class="page-header">
			<h1>All Products</h1>

			<p class="lead">Checkout all the awesome products available now!</p>
		</div>

		<table class="table table-striped table-hover">
			<thead>
				<tr class="bg-success">
					<th>Photo Thumb</th>
					<th>Product Name</th>
					<th>Category</th>
					<th>Condition</th>
					<th>Price</th>
					<th></th>
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
						<a href="<spring:url value="/product/viewProduct/${product.id}" />">
							<span class="glyphicon glyphicon-info-sign"></span>
						</a>
					</td>
				</tr>
			</c:forEach>
		</table>

		<!-- FOOTER -->
		<%@include file="/WEB-INF/view/template/footer.jsp"%>
	</div>
</div>
<!-- /.container -->

<%@include file="/WEB-INF/view/template/libraries.jsp"%>