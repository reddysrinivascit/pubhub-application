<!DOCTYPE html>
<html>
<head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<title>Item Details</title>
</head>

<body>

	<header>
		<div id="top">
			<div class="bg"></div>
			<div class="row">
				<div id="logo"></div>
				<nav>
					<div id="hmenu">
						<ul>
							<li><a href="/">Home</a></li>
							<li><a href="/book">Book</a></li>
							<c:if test="${!empty USER_LOGGED}">
								<li><a href="#">Welcome ${USER_LOGGED.name}</a></li>
								<li><a href="../auth/logout">Log out</a></li>
							</c:if>
						</ul>
					</div>
				</nav>
				<div class="clear"></div>
			</div>
		</div>
	</header>
<form action="../orderitems/addtocart" method="POST">
	<c:if test="${empty USER_LOGGED}">
		<div class="alert alert-danger" role="alert">
			Please <strong>Login</strong> to add items to cart.
		</div>
	</c:if>
	
		<div class="card">
			<div class="product-image">
				<img src="../${SELECTED_BOOK.imageUrl}" alt="" />
			</div>

	<input type="hidden" name="book_isbn" value="${SELECTED_BOOK.isbn}" />
			<div class="product-info">
				<h1 class="product-name">${SELECTED_BOOK.title}</h1>
				<h1 class="product-slogan">${SELECTED_BOOK.author}</h1>
				<h3 class="product-slogan">Isbn: ${SELECTED_BOOK.isbn}</h3>
				<h2 class="product-price">Rs. ${SELECTED_BOOK.price}</h2>
				<h3 class="product-slogan">${SELECTED_BOOK.content}</h3>
				<ul class="preferences">
					<li><span class="list-name">Quantity</span> <select
						class="qty" name="quantity">
							<option>1</option>
							<option>2</option>
							<option>3</option>
							<option>4</option>
							<option>5</option>
							<option>6</option>
							<option>7</option>
							<option>8</option>
							<option>9</option>
							<option>10</option>
					</select></li>
				</ul>
				<c:if test="${!empty USER_LOGGED}">
					<a href="../orderitems/addtocart"><input type = "submit" value = "Add To Cart"/></a>
				</c:if>
				<c:if test="${empty USER_LOGGED}">
					<a href="../orderitems/addtocart"><input type = "submit" value = "Add To Cart" disabled/></a>
				</c:if>
			</div>

		</div>
	
</form>	
	
</body>
</html>