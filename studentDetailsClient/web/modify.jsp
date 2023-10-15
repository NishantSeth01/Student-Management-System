<%@page import="javax.xml.soap.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Updation Operation</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
    </head>
    <body>
        <%-- start web service invocation --%>
        <%
        try {
            student.details.com.Details_Service service = new student.details.com.Details_Service();
            student.details.com.Details port = service.getDetailsPort();
            
            java.lang.String std = request.getParameter("radioYear");
            java.lang.Integer id = Integer.parseInt(request.getParameter("id"));
            java.lang.String name = request.getParameter("name");
            java.lang.String gender = request.getParameter("radioGender");
            java.lang.String email = request.getParameter("email");
            java.lang.String addr = request.getParameter("addr");
            java.lang.String phone = request.getParameter("phone");
            java.lang.Integer roll = Integer.parseInt(request.getParameter("roll"));
            
            java.lang.Integer result = port.update(std, id, name, gender, email, addr, phone, roll);
            
            if (result == 0){%>
                <div class="alert alert-danger" style="width: 100%;" role="alert">
                    Updation Failed. Insert Details Instead
                </div>
                <jsp:include page="insert.html" flush="true"/>
            <%
            }else{
            %>
               <jsp:forward page="table.jsp"/>
        <%}
        } catch (Exception ex) {}
        %>
        <%-- end web service invocation --%>

    </body>
</html>
