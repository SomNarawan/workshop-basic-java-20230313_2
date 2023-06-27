package com.example.hellorest.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

//    @GetMapping("/employee/{id2}")
//    public EmployeeResponse getEmployeeById(@PathVariable(name = "id2") String id) {
    @GetMapping("/employee/{id}")
    public EmployeeResponse getEmployeeById(@PathVariable String id) {
        // Validate id => Number Only
        int _id = 0;
        try {
            _id = Integer.parseInt(id);
        }catch (NumberFormatException e){
            // ERROR => TODO ?

        }

        EmployeeResponse employeeResponse = employeeService.process(_id);
        return employeeResponse;
    }

    // employee?id2=?
    @GetMapping("/employee")
//    public EmployeeResponse getEmployeeById2(@RequestParam(defaultValue = "100") String id) {
//    public EmployeeResponse getEmployeeById2(@RequestParam(name = "id2") String id) {
    public EmployeeResponse getEmployeeById2(@RequestParam String id) {
        // Validate id => Number Only
        int _id = 0;
        try {
            _id = Integer.parseInt(id);
        }catch (NumberFormatException e){
            // ERROR => TODO ?

        }
        return new EmployeeResponse(_id, "Somkiat", "Pui");
    }

    @PostMapping("/employee")
    public EmployeeResponse createNewEmployee(@RequestBody EmployeeRequest request) {
        // Validation
        return new EmployeeResponse(999, request.getFname(), request.getLname());
    }
}
