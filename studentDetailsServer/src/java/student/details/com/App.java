package student.details.com;

import java.util.*;
import org.hibernate.*;
import org.hibernate.Query;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class App {
    
    public static List<Student> student; 
    
    public List<Student> selectAll(){
        Configuration c = new Configuration();
        c.configure("hibernate.cfg.xml");
        SessionFactory sf = c.buildSessionFactory();
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();
        
        Criteria cr = s.createCriteria(Student.class);
        
        student = cr.list();
        
        t.commit();
        s.close();
        
        return student;
    }
    
    public List<Student> getRow(int id){
        Configuration c = new Configuration();
        c.configure("hibernate.cfg.xml");
        SessionFactory sf = c.buildSessionFactory();
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();
        
        Criteria cr = s.createCriteria(Student.class);
        cr.add(Restrictions.eq("id", id));
        
        student = cr.list();
        
        t.commit();
        s.close();
        
        return student;
    }
    
    public int insertStudent(Student stud){
        Configuration c = new Configuration();
        c.configure("hibernate.cfg.xml");
        SessionFactory sf = c.buildSessionFactory();
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();
        
        Query insert = s.getNamedQuery("insertStudent")
                .setParameter("p_std", stud.getStd())
                .setParameter("p_id", stud.getId())
                .setParameter("p_name", stud.getName()) 
                .setParameter("p_gender", stud.getGender())
                .setParameter("p_address", stud.getAddress()) 
                .setParameter("p_email", stud.getEmail()) 
                .setParameter("p_phone", stud.getPhone())
                .setParameter("p_roll", stud.getRoll());
        
        int status = insert.executeUpdate();
        
        t.commit();
        s.close();
        
        return status;
    }
    
    public int updateStudent(Student stud){
        Configuration c = new Configuration();
        c.configure("hibernate.cfg.xml");
        SessionFactory sf = c.buildSessionFactory();
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();
        
        Query update = s.getNamedQuery("updateStudent")
                .setParameter("p_std", stud.getStd())
                .setParameter("p_id", stud.getId())
                .setParameter("p_name", stud.getName()) 
                .setParameter("p_gender", stud.getGender())
                .setParameter("p_address", stud.getAddress()) 
                .setParameter("p_email", stud.getEmail()) 
                .setParameter("p_phone", stud.getPhone())
                .setParameter("p_roll", stud.getRoll());
        
        int status = update.executeUpdate();
        
        return status;
    }
    
    public int deleteStudent(Student stud){
        Configuration c = new Configuration();
        c.configure("hibernate.cfg.xml");
        SessionFactory sf = c.buildSessionFactory();
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();
        
        Query update = s.getNamedQuery("deleteStudent").setParameter("sid", stud.getId());
        
        int status = update.executeUpdate();
        
        t.commit();
        s.close();
        
        return status;
    }
}