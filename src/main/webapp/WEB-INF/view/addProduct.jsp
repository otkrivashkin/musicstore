<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@include file="/WEB-INF/view/template/header.jsp"%>

<div class="container-wrapper">
	<div class="container">
		<div class="page-header">
			<h1>Add Product</h1>

			<p class="lead">Fill the below information to add a product!</p>
		</div>
		
		<!-- ADD PRODUCT FORM -->

		<form:form action="#" method="post" commandName="product">
			<div class="form-group">
				<label for="name">Name</label>
				<form:input path="name" id="name" class="form-control"/>
			</div> 
			<div class="form-group">
				<label for="category">Category</label>
				<form:input path="category" id="category" class="form-control"/>
			</div>
			<div class="form-group">
				<label for="category">Category</label>
				<label class="checkbox-inline"><form:radiobutton path="category" id="category" value="instrument"/>Instrument</label>
				<label class="checkbox-inline"><form:radiobutton path="category" id="category" value="record"/>Record</label>
				<label class="checkbox-inline"><form:radiobutton path="category" id="category" value="accessory"/>Accessory</label>
			</div>
		</form:form>

		<!-- FOOTER -->
		<%@include file="/WEB-INF/view/template/footer.jsp"%>
	</div>
</div>
<!-- /.container -->

<%@include file="/WEB-INF/view/template/libraries.jsp"%>