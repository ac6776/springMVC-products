<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>
    <body>
        <h1>Products list</h1>
            <c:forEach var="product" items="${products}">
                <span>${product.id} ${product.title} ${product.cost}</span>
                <br>
            </c:forEach>
            <br>
            <a href="${pageContext.request.contextPath}/">to Index Page</a>
    </body>
</html>