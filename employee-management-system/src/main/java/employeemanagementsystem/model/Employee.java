package employeemanagementsystem.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long empNumber;

    @Column(nullable = true)
    private String first_name;

    @Column(nullable = true)
    private String last_name;

    @Column(nullable = true)
    private String status;

    public Long getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(Long empNumber) {
        this.empNumber = empNumber;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
