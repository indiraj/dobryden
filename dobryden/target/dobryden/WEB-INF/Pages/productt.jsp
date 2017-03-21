<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="resources/css/signup.css">
</head>
<body style="background-color: white">
	<jsp:include page="navbar.jsp" />
	<div class="container">
		<div class="row">
			<div class="col-md-8">
				<section>
					<h1 class="entry-title">
						<span>Product Registration</span>
					</h1>
					<hr>
					<form:form action="productt" modelAttribute="addsell" class="form-horizontal"
						method="post" name="Product" id="Product">

						<div class="form-group">
							<label class="control-label col-sm-3">Product Id <span
								class="text-danger">*</span></label>
							<div class="col-md-8 col-sm-9">
								<form:input type="text" class="form-control" name="mem_name"
									id="mem_name" placeholder="productId" value="" path="Productid"></form:input>
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-sm-3">Seller Id <span
								class="text-danger">*</span></label>
							<div class="col-md-8 col-sm-9">
								<form:input type="text" class="form-control" name="mem_name"
									id="mem_name" placeholder="SellerId" value="" path="Sellerid"></form:input>
							</div>
						</div>
					

						<div class="form-group">
							<label class="control-label col-sm-3">Product Description <span
								class="text-danger">*</span></label>
							<div class="col-md-5 col-sm-8">
								<div class="input-group">
										<form:input type="ProductDescription" class="form-control"
										name="" id="ProductDescription"
										placeholder="ProductDescription (5-15 chars)" value="" path="productdescription"></form:input>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-sm-3">CategoryId<span
								class="text-danger">*</span></label>
							<div class="col-md-5 col-sm-8">
								<div class="input-group">
									<form:input type="text" class="form-control" name="CategoryId"
										id="CategoryId" placeholder="CategoryId"
										value="" path="categoryid"></form:input>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-sm-3">Productquantity<span
								class="text-danger">*</span></label>
							<div class="col-md-5 col-sm-8">
								<div class="input-group">
									<form:input type="text" class="form-control" name="Product quantity"
										id="productquantity" placeholder="Productquantity"
										value="" path="Productquantity"></form:input>
										</div>
										</div>
										</div>

										
										<div class="form-group">
							<label class="control-label col-sm-3">Productprice<span
								class="text-danger">*</span></label>
							<div class="col-md-5 col-sm-8">
								<div class="input-group">
									<form:input type="text" class="form-control" name="Product price"
										id="productprice" placeholder="Productprice"
										value="" path="productprice"></form:input>
								</div>
							</div>
						</div>
								
						<div class="container">&nbsp;</div>
						  <div class="form-group" style="margin-top: 20">
								<div class="col-xs-offset-3 col-xs-10">
									<button name="Submit" type="submit" value="Add"
										class="btn btn-success">Add</button>
									<button href="" name="Reset" type="reset" value="Reset"
										class="btn btn-danger"> Reset
									</button>
								</div>
							</div>        
					</form:form>
			</div>
		</div>
	</div>
</body>
</html>