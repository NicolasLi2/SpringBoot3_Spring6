<html>
    <head>
         <title>List Todos page</title>
    </head>
    <body>
        <div>Welcome ${name}</div>
        <div>Your Todos are: ${todos}</div>
    <!-- the 'name' is only exists in one request,
    if you want it to live longer, you can use session,
    that is @SessionAttributes("name") -->
    </body>
</html>