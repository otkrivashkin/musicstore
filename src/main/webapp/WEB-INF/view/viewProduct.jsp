<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@include file="/WEB-INF/view/template/header.jsp"%>

<div class="container-wrapper">
	<div class="container">
		<div class="page-header">
			<h1>Product Detail</h1>

			<p class="lead">Here is the detail information of the product!</p>
		</div>

		<div class="container">
			<div class="row">
				<div class="col-md-5">
					<img src="#" alt="image" style="width: 100%; height: 300px" />
				</div>
				<div class="col-md-5">
					<h3>Product Name ${product.name }</h3>
					<p><strong>Product Description</strong> ${product.description }</p>
					<p><strong>Manufacturer</strong> ${product.manufacturer }</p>
					<p><strong>Category</strong> ${product.category }</p>
					<p><strong>Condition</strong> ${product.condition }</p>
					<p><strong>Price</strong> ${product.price }</p>
				</div>
			</div>
		</div>

		<!-- FOOTER -->
		<%@include file="/WEB-INF/view/template/footer.jsp"%>
	</div>
</div>
<!-- /.container -->

<%@include file="/WEB-INF/view/template/libraries.jsp"%>