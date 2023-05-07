package com.geekster.Employee_Address.services;

import com.geekster.Employee_Address.models.Employee;
import com.geekster.Employee_Address.repositories.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    IEmployeeRepo employee_repo;

    private List<Employee> employees;

    public List<Employee> getAll(){
        return (List<Employee>) employee_repo.findAll();
    }

    public Optional<Employee> getEmployee(int id){
        return employee_repo.findById(id);
    }

    public String addEmployee(Employee employee){
        if(employee!=null) {
            employee_repo.save(employee);
            return "Employee added successfully...!";
        }
        return "Enter a valid input";
    }

    public String updateEmployee(int id,Employee employee){
        employees =getAll();
        for(Employee emp:employees){
            if(emp.getEmployee_id()==id){
                employee_repo.save(employee);
                return "Employee updated...!";
            }
        }
        return "Invalid user input...!";
    }

    public String deleteEmployee(int id){
        employees =getAll();
        for(Employee emp:employees){
            if(emp.getEmployee_id()==id){
                employee_repo.deleteById(id);
                return "Employee updated...!";
            }
        }
        return "Invalid user input...!";
    }
}
