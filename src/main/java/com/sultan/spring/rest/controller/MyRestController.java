package com.sultan.spring.rest.controller;


import com.sultan.spring.rest.entity.Employee;
import com.sultan.spring.rest.exceptoinHandling.EmployeeIncorrectData;
import com.sultan.spring.rest.exceptoinHandling.NoSuchEmployeeException;
import com.sultan.spring.rest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRestController {

    @Autowired
    private EmployeeService employeeService;


    // READ
    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        List<Employee> allEmployees = employeeService.getAllEmployees();

        return allEmployees;
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable  int id) {
        Employee employee = employeeService.getEmployeeById(id);

        if(employee == null) {
            throw new NoSuchEmployeeException("There is no such employee with id " + id + "in database");
        }
        return employee;
    }




    //CREATE

    @PostMapping("/employees")
    public Employee addNewEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
        return employee;
    }







    //UPDATE
    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
        return employee;
    }


    //DELETE
    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id) {
        Employee employee = employeeService.getEmployeeById(id);
        if(employee == null) {
            throw new NoSuchEmployeeException("There is no such employee with id " + id + "in database");
        }
        employeeService.deleteEmployee(id);
        return "employee with id " + id + " was deleted";
    }






}
