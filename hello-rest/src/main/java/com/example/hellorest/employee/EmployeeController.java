package com.example.hellorest.employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/employee/{id2}")
    public EmployeeResponse getEmployeeById(@PathVariable(name = "id2") String id) {
        // Validate id => Number Only
        int _id = 0;
        try {
            _id = Integer.parseInt(id);
        }catch (NumberFormatException e){
            // ERROR => TODO ?

        }
        return new EmployeeResponse(_id, "Somkiat", "Pui");
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
}