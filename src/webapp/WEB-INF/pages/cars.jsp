<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <style>
        table {
            width:50%;
        }
        table, th, td {
            border: 2px solid MediumSlateBlue;
            border-collapse: collapse;
        }
        th, td {
            padding: 15px;
            text-align: left;
        }
        table#t01 tr:nth-child(even) {
            background-color: #eee;
            color: SaddleBrown;
        }
        table#t01 tr:nth-child(odd) {
            background-color: #fff;
            color: SaddleBrown;
        }
        table#t01 th {
            background-color: MediumSlateBlue;
            color: white;
        }
    </style>
</head>
<body>
<table id="t01">
    <tr>
        <th>Car</th>
        <th>ID</th>
        <th>Brand</th>
        <th>Series</th>
    </tr>
    <c:set var="Car" value="car"/>
    <c:forEach var="car" items="${cars}">
    <tr>
        <td>
            <c:out value="${Car}"/>
        </td>
        <td>
            <c:out value="${car.getId()}"/>
        </td>
        <td>
            <c:out value="${car.getBrand()}"/>
        </td>
        <td>
            <c:out value="${car.getSeries()}"/>
        </td>
    </tr>
    </c:forEach>
</table>

</body>
</html>
