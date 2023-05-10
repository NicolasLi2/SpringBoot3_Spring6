<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
         <title>List Todos page</title>
    </head>
    <body>
        <div>Welcome ${name}</div>
        <hr>
        <h1>Your Todos </h1>
    <!-- the 'name' is only exists in one request,
    if you want it to live longer, you can use session,
    that is @SessionAttributes("name") -->
        <table>
            <thead>
                <tr>
                     <th>id</th>
                     <th>Description</th>
                     <th>Target Date</th>
                     <th>Is Done?</th>
                 </tr>
            </thead>
            <tbody>
                 <c:forEach items="${todos}" var="todo">
                     <tr>
                         <td>${todo.id}</td>
                         <td>${todo.description}</td>
                         <td>${todo.targetDate}</td>
                         <td>${todo.done}</td>
                     </tr>
                 </c:forEach>
            </tbody>
        </table>

    </body>
</html>