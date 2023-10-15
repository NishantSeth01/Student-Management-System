<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete Details Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <style>
            .container{
                width: 100%;
                box-shadow: 0 2px 10px gray;
            }
            .list-group-item {
                border: none; 
            }
            .card{
                margin-left: 0px;
                margin-right: 0px;
                border: none;
            }
            .card-header {
                margin-left: 0px;
                margin-right: 0px;
                background-color: #0D6EFD; 
                color: white; 
            }
            .center-buttons {
                display: flex;
                justify-content: center;
                margin-top: 20px;
            }
        </style>
    </head>
    <body>
        <div class="container mt-5 px-0 rounded">
            <div class="card">
                <div class="text-center bg-primary text-light py-2 rounded-top">
                    <h3>Delete Detail Message</h3>
                </div>
                <div class="card-body">
                    <p>Do you really want to delete the following detail: </p>
                    <ul class="list-group">
                    <%-- start web service invocation --%>
                    <%
                    try {
                        student.details.com.Details_Service service = new student.details.com.Details_Service();
                        student.details.com.Details port = service.getDetailsPort();
                        
                        java.lang.Integer id = Integer.valueOf(request.getParameter("id"));
                        
                        java.util.List<student.details.com.Student> result = port.getRow(id);
                        int i;
                        
                        
                        for (student.details.com.Student s: result){
                            i = s.getId();
                    %>
                            <li class="list-group-item">Admission ID: <%=s.getId()%></li>
                            <li class="list-group-item">Year: <%=s.getStd()%></li>
                            <li class="list-group-item">Roll No.: <%=s.getRoll()%></li>
                            <li class="list-group-item">Name: <%=s.getName()%></li>
                            <li class="list-group-item">Gender: <%=s.getGender()%></li>
                            <li class="list-group-item">Email: <%=s.getEmail()%></li>
                            <li class="list-group-item">Phone No.: <%=s.getPhone()%></li>
                            <li class="list-group-item">Address: <%=s.getAddress()%></li>
                    </ul>
                    <div class="center-buttons">
                        <input type="submit" value="Delete Record" onclick="location.href='remove.jsp?id=<%=i%>'" name="id" class="btn btn-primary mx-2"/>
                        <input type="submit" value="Go Back" onclick="location.href='table.jsp'" class="btn btn-secondary"/>
                    </div>
                    <%}%>
                    <%
                    } catch (Exception ex) {}
                    %>
                    <%-- end web service invocation --%>
                </div>
            </div>
        </div>
    </body>
</html>
