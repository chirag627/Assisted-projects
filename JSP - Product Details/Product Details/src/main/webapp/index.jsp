<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search your product</title>
</head>
<body style="background: #f6f7f8">
	<div
		style="display: inline-block; position: fixed; top: 0; bottom: 0; left: 0; right: 0; width: 600px; height: 570px; margin: auto;">
		<center>
			<h1 style="font-size: 34px; line-height: 40px; font-weight: 400;">Insert
				a product</h1>
		</center>

		<div
			style="display: inline-block; position: fixed; padding: 20px; top: 0; bottom: 0; left: 0; right: 0; width: 300px; height: 350px; margin: auto; border: 1px solid #e6e8ec; border-radius: 4px; background: #fff;">
			<form method="post" action="./productControllerServlet">
				<label
					style="color: #7c8088; display: block; max-width: 100%; margin-bottom: 5px; font-weight: 400;"
					for="inputHost">Product Name*</label> <input type="text" required
					name="productName" style="width: 100%; height: 30px"> <br>

				<br> <label
					style="color: #7c8088; display: block; max-width: 100%; margin-bottom: 5px; font-weight: 400;"
					for="inputHost">Product Category*</label> <input type="text"
					required name="productCategory" style="width: 100%; height: 30px">
				<br> <br> <label
					style="color: #7c8088; display: block; max-width: 100%; margin-bottom: 5px; font-weight: 400;"
					for="inputHost">Product Price*</label> <input type="text" required
					name="productPrice" style="width: 100%; height: 30px"> <br>

				<br> <br> <br> <input type="submit" name="submit"
					value="Search"
					style="width: 100%; background: #000000; color: #ffffff; height: 40px">


			</form>
		</div>
	</div>

</body>
</html>