<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Deletion Operation</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    </head>
    <body>
        <%-- start web service invocation --%>
        <%
        try {
            student.details.com.Details_Service service = new student.details.com.Details_Service();
            student.details.com.Details port = service.getDetailsPort();
            
            java.lang.Integer id = Integer.parseInt(request.getParameter("id"));
           
            java.lang.Integer result = port.delete(id);
            
            out.println("Result: " + result);
            
            if (result != 0){%>
                <jsp:forward page="table.jsp"/>
            <%
            }else{
            %>
                <div class="alert alert-danger" style="width: 100%;" role="alert">
                    Insertion Failed
                </div>
                <jsp:include page="insert.html" flush="true"/>
        <%}
        } catch (Exception ex) {}
        %>
        <%-- end web service invocation --%>
    </body>
</html>
