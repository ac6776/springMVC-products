<!DOCTYPE html>

<html>
    <body>
        <h1>Search Form</h1>
        <form action="advProcessForm" method="GET">
            <input type="text" name="productId" placeholder="Enter product ID" />
            <input type="submit" />
        </form>
        <br>
        <a href="${pageContext.request.contextPath}/">to Index Page</a>
    </body>
</html>