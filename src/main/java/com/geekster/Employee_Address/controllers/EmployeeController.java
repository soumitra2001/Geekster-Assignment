package com.geekster.Employee_Address.controllers;

import com.geekster.Employee_Address.models.Employee;
import com.geekster.Employee_Address.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {

    @Autowired
    EmployeeService emp_service;

    @GetMapping
    public List<Employee> getAllEmployee(){
        return emp_service.getAll();
    }

    @GetMapping(value ="/{id}")
    public Optional<Employee> getEmployee(@Valid @PathVariable int id){
        return emp_service.getEmployee(id);
    }

    @PostMapping
    public String addEmployee(@Valid @RequestBody Employee employee){
        return emp_service.addEmployee(employee);
    }

    @PutMapping(value = "/{id}")
    public String updateEmployee(@PathVariable int id,@Valid @RequestBody Employee employee){
        return emp_service.updateEmployee(id,employee);
    }

    @DeleteMapping(value = "/{id}")
    public String deleteEmployee(@PathVariable int id){
        return emp_service.deleteEmployee(id);
    }
}
