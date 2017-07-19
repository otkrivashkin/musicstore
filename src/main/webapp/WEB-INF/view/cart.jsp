<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@include file="template/header.jsp"%>


    <div class="container-wrapper">
        <div class="container">
            <section>
                <div class="jumbotron">
                    <div class="container">
                        <h1>Cart</h1>

                        <p>All the selected products in your shopping cart</p>
                    </div>
                </div>
            </section>

            <section class="container">
                <div>
                    <a href="#" class="btn btn-danger pull-left"><span class="glyphicon glyphicon-remove-sign"></span>Clear cart</a>
                </div>

                <table class="table table-hover">
                    <tr>
                        <th>Product</th>
                        <th>Unit Price</th>
                        <th>Quantity</th>
                        <th>Price</th>
                        <th>Action</th>
                    </tr>
                    <tr>
                        <td>productName</td>
                        <td>productPrice</td>
                        <td>quantity</td>
                        <td>totalPrice</td>
                        <td>remove button</td>
                    </tr>
                    <tr>
                        <th></th>
                        <th></th>
                        <th>Grand Total</th>
                        <th>grandTotal</th>
                        <th></th>
                    </tr>
                </table>

                <a href="<spring:url value="/productList"/>">Continue Shopping</a>
            </section>
        </div>
    </div>


<%@include file="template/footer.jsp"%>