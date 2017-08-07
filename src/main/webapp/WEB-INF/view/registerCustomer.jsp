<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@include file="/WEB-INF/view/template/header.jsp"%>

<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Register Customer</h1>

            <p class="lead">Please fill in your information below:</p>
        </div>

        <!-- CUSTOMER FORM -->

        <form:form action="${pageContext.request.contextPath}/register"
                   method="post" commandName="customer">

            <h3>Basic Info</h3>

            <div class="form-group">
                <label for="name">Name</label>
                <form:errors path="customerName" cssStyle="color: darkred;"/>
                <form:input path="customerName" id="name" class="form-control"/>
            </div>

            <div class="form-group">
                <label for="email">Email</label>
                <span style="color: red;">${emailMsg}</span>
                <form:errors path="customerEmail" cssStyle="color: darkred;"/>
                <form:input path="customerEmail" id="email" class="form-control" alt="customer email address"/>
            </div>

            <div class="form-group">
                <label for="phone">Phone</label>
                <form:errors path="customerPhone" cssStyle="color: darkred;"/>
                <form:input path="customerPhone" id="phone" class="form-control"/>
            </div>

            <div class="form-group">
                <label for="userName">UserName</label>
                <span style="color: red;">${usernameMsg}</span>
                <form:errors path="userName" cssStyle="color: darkred;"/>
                <form:input path="userName" id="userName" class="form-control"/>
            </div>

            <div class="form-group">
                <label for="password">Password</label>
                <form:errors path="password" cssStyle="color: darkred;"/>
                <form:password path="password" id="password" class="form-control"/>
            </div>

            <%--BILLING ADDRESS INFO--%>
            <h3>Billing Address</h3>

            <div class="form-group">
                <label for="billingStreet">Street Name</label>
                <form:errors path="billingAddress.streetName" cssStyle="color: darkred;"/>
                <form:input path="billingAddress.streetName" id="billingStreet" class="form-control"/>
            </div>

            <div class="form-group">
                <label for="billingApartmentNumber">Apartment Number</label>
                <form:errors path="billingAddress.apartmentNumber" cssStyle="color: darkred;"/>
                <form:input path="billingAddress.apartmentNumber" id="billingApartmentNumber" class="form-control"/>
            </div>

            <div class="form-group">
                <label for="billingCity">City</label>
                <form:errors path="billingAddress.city" cssStyle="color: darkred;"/>
                <form:input path="billingAddress.city" id="billingCity" class="form-control"/>
            </div>

            <div class="form-group">
                <label for="billingState">State</label>
                <form:errors path="billingAddress.state" cssStyle="color: darkred;"/>
                <form:input path="billingAddress.state" id="billingState" class="form-control"/>
            </div>

            <div class="form-group">
                <label for="billingCountry">Country</label>
                <form:errors path="billingAddress.country" cssStyle="color: darkred;"/>
                <form:input path="billingAddress.country" id="billingCountry" class="form-control"/>
            </div>

            <div class="form-group">
                <label for="billingZip">Zipcode</label>
                <form:errors path="billingAddress.zipCode" cssStyle="color: darkred;"/>
                <form:input path="billingAddress.zipCode" id="billingZip" class="form-control"/>
            </div>

            <%--SHIPPING ADDRESS INFO--%>
            <h3>Shipping Address</h3>

            <div class="form-group">
                <label for="shippingAddressStreet">Street Name</label><form:errors path="shippingAddress.streetName" cssStyle="color: darkred;"/>
                <form:input path="shippingAddress.streetName" id="shippingAddressStreet" class="form-control"/>
            </div>

            <div class="form-group">
                <label for="shippingApartmentNumber">Apartment Number</label><form:errors path="shippingAddress.apartmentNumber" cssStyle="color: darkred;"/>
                <form:input path="shippingAddress.apartmentNumber" id="shippingApartmentNumber" class="form-control"/>
            </div>

            <div class="form-group">
                <label for="shippingCity">City</label><form:errors path="shippingAddress.city" cssStyle="color: darkred;"/>
                <form:input path="shippingAddress.city" id="shippingCity" class="form-control"/>
            </div>

            <div class="form-group">
                <label for="shippingState">State</label><form:errors path="shippingAddress.state" cssStyle="color: darkred;"/>
                <form:input path="shippingAddress.state" id="shippingState" class="form-control"/>
            </div>

            <div class="form-group">
                <label for="shippingCountry">Country</label><form:errors path="shippingAddress.country" cssStyle="color: darkred;"/>
                <form:input path="shippingAddress.country" id="shippingCountry" class="form-control"/>
            </div>

            <div class="form-group">
                <label for="shippingZip">Zipcode</label><form:errors path="shippingAddress.zipCode" cssStyle="color: darkred;"/>
                <form:input path="shippingAddress.zipCode" id="shippingZip" class="form-control"/>
            </div>

            <br>
            <input type="submit" value="submit" class="btn btn-primary">
            <a href="<c:url value="/"/>" class="btn btn-danger">Cancel</a>
        </form:form><!-- CUSTOMER FORM -->

        <!-- FOOTER -->
        <%@include file="/WEB-INF/view/template/footer.jsp"%>
    </div>
</div>
<!-- /.container -->

<%@include file="/WEB-INF/view/template/libraries.jsp"%>