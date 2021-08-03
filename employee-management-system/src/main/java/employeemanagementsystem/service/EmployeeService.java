package employeemanagementsystem.service;

import employeemanagementsystem.model.Employee;
import employeemanagementsystem.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
@Autowired
EmployeeRepo employeeRepo;

    //get or retrieve all
    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }
}
