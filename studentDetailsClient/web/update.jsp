<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Record Form</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
        <style>
            .form-container {
                width: 40%; 
                margin: 0 auto;
                padding: 20px;
                background-color: white;
                border-radius: 10px;
                box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.2);
            }

            .form-group label {
                font-weight: bold;
            }
        </style>
    </head>
    <body>
        <div class="form-container">
            <h3 class="text-center">Update Student Details</h3>
            <form action="modify.jsp">
                <%-- start web service invocation --%>
                <%
                try {
                    student.details.com.Details_Service service = new student.details.com.Details_Service();
                    student.details.com.Details port = service.getDetailsPort();
                    
                    java.lang.Integer id = Integer.parseInt(request.getParameter("id"));
                    
                    java.util.List<student.details.com.Student> result = port.getRow(id);
                    
                    for (student.details.com.Student s: result){
                %>
                        <div class="form-group">
                            <label for="inputId">Admission Id</label>
                            <input type="number" class="form-control" id="inputId" name="id" placeholder="1xx" value="<%=s.getId()%>">
                        </div>
                        <div class="form-group">
                            <label for="inputRoll">Roll No.</label>
                            <input type="number" class="form-control" id="inputRoll" name="roll" placeholder="1" value="<%=s.getRoll()%>">
                        </div>
                        <div class="form-group">
                            <label for="inputName">Student Name</label>
                            <input type="text" class="form-control" id="inputName" name="name" placeholder="Abc" value="<%=s.getName()%>">
                        </div>
                        <div class="form-group">
                            <label>Year</label>
                            <div class="form-check">
                                <input class="form-check-input" type="radio" name="radioYear" id="radioYear1" value="FY" <%if (s.getStd().equals("FY")){%> checked <%} else{%> <%}%>>
                                <label class="form-check-label" for="radioYear1">First Year</label>
                            </div>
                            <div class="form-check">
                                <input class="form-check-input" type="radio" name="radioYear" id="radioYear2" value="SY" <%if (s.getStd().equals("SY")){%> checked <%} else{%> <%}%>>
                                <label class="form-check-label" for="radioYear2">Second Year</label>
                            </div>
                            <div class="form-check">
                                <input class="form-check-input" type="radio" name="radioYear" id="radioYear3" value="TY" <%if (s.getStd().equals("TY")){%> checked <%} else{%> <%}%>>
                                <label class="form-check-label" for="radioYear3">Third Year</label>
                            </div>
                        </div>
                        <div class="form-group">
                            <label>Gender</label>
                            <div class="form-check">
                                <input class="form-check-input" type="radio" name="radioGender" id="radioMale" value="Male" <%if (s.getGender().equals("Male")){%> checked <%} else{%> <%}%>>
                                <label class="form-check-label" for="radioMale">Male</label>
                            </div>
                            <div class="form-check">
                                <input class="form-check-input" type="radio" name="radioGender" id="radioFemale" value="Female" <%if (s.getGender().equals("Female")){%> checked <%} else{%> <%}%>>
                                <label class="form-check-label" for="radioFemale">Female</label>
                            </div>
                            <div class="form-check">
                                <input class="form-check-input" type="radio" name="radioGender" id="radioOthers" value="Others" <%if (s.getGender().equals("Others")){%> checked <%} else{%> <%}%>>
                                <label class="form-check-label" for="radioOthers">Others</label>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputPhoneNo">Phone No.</label>
                            <input type="number" class="form-control" id="inputPhoneNo" name="phone" placeholder="xxxxxxxxxx" value="<%=s.getPhone()%>">
                        </div>
                        <div class="form-group">
                            <label for="inputEmail4">Email</label>
                            <input type="email" class="form-control" id="inputEmail4" name="email" placeholder="Email" value="<%=s.getEmail()%>">
                        </div>
                        <div class="form-group">
                            <label for="inputAddress">Address</label>
                            <input type="text" class="form-control" id="inputAddress" name="addr" placeholder="Mumbai" value="<%=s.getAddress()%>">
                        </div>
                        <br>
                        <div class="text-center">
                            <input type="submit" value="Update" class="btn btn-primary"/>
                        </div>    
                <%}
                } catch (Exception ex) {}
                %>
                <%-- end web service invocation --%>
            </form>
        </div>
    </body>
</html>
