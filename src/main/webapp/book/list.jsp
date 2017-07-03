<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Books List</title>
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


	<div id="wrapperList">
		<div id="sidebar">

			<h3>CATEGORIES</h3>
			<div class="checklist categories">
				<ul>
					<li><a href="#"><span></span>New Arivals</a></li>
					<li><a href="#"><span></span>Best Sellers</a></li>
					<li><a href="#"><span></span>Comics</a></li>
					<li><a href="#"><span></span>Engineering</a></li>
					<li><a href="#"><span></span>Action</a></li>
					<li><a href="#"><span></span>Comedy</a></li>
					<li><a href="#"><span></span>Fantasy</a></li>
					<li><a href="#"><span></span>Horror</a></li>
					<li><a href="#"><span></span>Mystery</a></li>
				</ul>
			</div>
		</div>
	</div>
	<div id="grid">
		<c:forEach items="${book}" var="book">
			<div class="product">
				<div class="info-large">
					<h4>${book.title}</h4>
					<div class="sku">
						ISBN: <strong>${book.isbn}</strong>
					</div>

					<div class="price-big">${book.price}</div>

					<button class="add-cart-large">Add To Cart</button>

				</div>
							<div class="make3D">
				<div class="product-front">
				<div class="shadow"></div>
				<img src="${book.imageUrl}" alt="" />
                <div class="image_overlay"></div>
					<div class="stats">
						<div class="stats-container">
							<span class="product_price">${book.price}</span> <span
								class="product_name">${book.title}</span>
							<p>${book.author}</p><br>
							<a href="../book/${book.isbn}"><input type = "submit" value = "View"/></a>
						</div>
						<div></div>
					</div>
				</div>
			</div>
			</div>
		</c:forEach>
	</div>
	

</body>
</html>