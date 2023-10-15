package student.details.com;

import java.util.*;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "details")
public class details {

    private App a = new App();
    
    @WebMethod(operationName = "display")
    public List<Student> display() {
        return a.selectAll();
    }

    @WebMethod(operationName = "getRow")
    public List<Student> getRow(@WebParam(name = "id") Integer id) {
        List<Student> s = a.getRow(id);
        return s;
    }

    @WebMethod(operationName = "insert")
    public Integer insert(@WebParam(name = "std") String std, @WebParam(name = "id") Integer id, @WebParam(name = "name") String name, @WebParam(name = "gender") String gender, @WebParam(name = "email") String email, @WebParam(name = "addr") String addr, @WebParam(name = "phone") String phone, @WebParam(name = "roll") Integer roll) {
        Student s = new Student();
        s.setId(id);
        s.setName(name);
        s.setStd(std);
        s.setGender(gender);
        s.setRoll(roll);
        s.setAddress(addr);
        s.setEmail(email);
        s.setPhone(phone);
        
        return a.insertStudent(s);
    }

    @WebMethod(operationName = "delete")
    public Integer delete(@WebParam(name = "id") Integer id) {
        Student s = new Student();
        s.setId(id);
        
        return a.deleteStudent(s);
    }

    @WebMethod(operationName = "update")
    public Integer update(@WebParam(name = "std") String std, @WebParam(name = "id") Integer id, @WebParam(name = "name") String name, @WebParam(name = "gender") String gender, @WebParam(name = "email") String email, @WebParam(name = "addr") String addr, @WebParam(name = "phone") String phone, @WebParam(name = "roll") Integer roll) {
        Student s = new Student();
        s.setId(id);
        s.setName(name);
        s.setStd(std);
        s.setGender(gender);
        s.setRoll(roll);
        s.setAddress(addr);
        s.setEmail(email);
        s.setPhone(phone);
        
        return a.updateStudent(s);
    }

}
