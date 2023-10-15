package student.details.com;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "std", discriminatorType = DiscriminatorType.STRING)

@NamedNativeQueries({
    @NamedNativeQuery(name = "insertStudent", query = "CALL insertStudent(:p_id, :p_roll, :p_std, :p_name, :p_address, :p_gender, :p_email, :p_phone, @p_status)", resultClass = Student.class),
    @NamedNativeQuery(name = "updateStudent", query = "CALL updateStudent(:p_id, :p_roll, :p_std, :p_name, :p_address, :p_gender, :p_email, :p_phone, @p_status)", resultClass = Student.class),
    @NamedNativeQuery(name = "deleteStudent", query = "CALL deleteStudent(:sid)", resultClass = Student.class)
})

public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name, gender, email, phone, address, std;

    public String getStd() {
        return std;
    }

    public void setStd(String std) {
        this.std = std;
    }
    private int roll;

    public Student() {
        super();
    }

    public Student(int id, String std, String name, String gender, String email, String phone, String address, int roll) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", roll='" + roll + '\'' +
                ", std='" + std + '\'' +
                '}';
    }
    
}

@Entity
@DiscriminatorValue("FY")
class FY extends Student {
    private String std;

    public String getStd() {
        return std;
    }

    public void setStd(String std) {
        this.std = std;
    }
    
}

@Entity
@DiscriminatorValue("SY")
class SY extends Student {
    private String std;

    public String getStd() {
        return std;
    }

    public void setStd(String std) {
        this.std = std;
    }
    
}

@Entity
@DiscriminatorValue("TY")
class TY extends Student {
    private String std;

    public String getStd() {
        return std;
    }

    public void setStd(String std) {
        this.std = std;
    }
    
}

