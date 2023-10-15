<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Validation</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
    </head>
    <body>
        <%
            String n = request.getParameter("name");
            String p = request.getParameter("pass");
            
            if (n.equals("Admin") & p.equals("admin123")){
        %>
                <jsp:forward page="table.jsp"/>
        <%;}
            else{
        %>
                <div class="alert alert-danger" role="alert">
                   Incorrect Username or Password
                </div>
                <jsp:include page="index.html" flush="false"/>
        <%;}%>
    </body>
</html>
