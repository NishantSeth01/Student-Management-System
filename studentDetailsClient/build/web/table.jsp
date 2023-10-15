<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Details Table</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
        <style>
            .center{
                margin-left: auto;
                margin-right: auto;
            }
            .custom-button {
                background-color: white;
                color: blue;
            }
            .thead{
                background-color: #0D6EFD;
            }
            .custom-button:hover {
                background-color: #0D6EFD;
                color: white;
            }
            .custom-button1 {
                background-color: #0D6EFD;
                color: white;
            }
        </style>
    </head>
    <body>
        <div class="container form-container">
            <div class="text-center">
                <h1>Student Details</h1>
            </div>
            <div class="container">
                <table class="table table-hover center">
                    <thead class="thead">
                      <tr>
                        <th scope="col">Id</th>
                        <th scope="col">Roll</th>
                        <th scope="col">Year</th>
                        <th scope="col">Name</th>
                        <th scope="col">Gender</th>
                        <th scope="col">Phone</th>
                        <th scope="col">Email</th>
                        <th scope="col">Address</th>
                        <th></th>
                        <th></th>
                      </tr>
                    </thead>
                    <tbody>
                        <%-- start web service invocation --%>
                        <%
                        try {
                            student.details.com.Details_Service service = new student.details.com.Details_Service();
                            student.details.com.Details port = service.getDetailsPort();

                            java.util.List<student.details.com.Student> result = port.display();
                            int i;
                            for (student.details.com.Student s: result){
                                i = s.getId();
                         %>
                                <tr>    
                                    <td><%=s.getId()%></td>
                                    <td><%=s.getRoll()%></td>
                                    <td><%=s.getStd()%></td>
                                    <td><%=s.getName()%></td>
                                    <td><%=s.getGender()%></td>
                                    <td><%=s.getPhone()%></td>
                                    <td><%=s.getEmail()%></td>
                                    <td><%=s.getAddress()%></td>
                                    <td>
                                        <a href="update.jsp?id=<%=i%>" name="id" class="btn btn-primary custom-button1">Update</a>
                                    </td>
                                    <td>
                                        <a href="delete.jsp?id=<%=i%>" name="id" class="btn btn-primary custom-button1">Delete</a>
                                    </td>
                                </tr>
                        <%
                            }
                        } catch (Exception ex) {}
                        %>
                        <%-- end web service invocation --%>
                    </tbody>
                </table>
            </div>
            <div class="container d-flex justify-content-center">
                <a href="insert.html" class="btn btn-primary custom-button">+ Insert Row</a>
            </div>
        </div>
    </body>
</html>
