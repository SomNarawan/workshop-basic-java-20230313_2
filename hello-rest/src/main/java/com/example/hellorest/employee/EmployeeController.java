package com.example.hellorest.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
public class EmployeeController {
//    1 Class Level
//    private MyRandom random = new MyRandom();
    @Autowired
    private MyRandom random;

/*
//    2 Method Level
//    Configuration (in HelloRestApplication.java and other)
    @Bean
    public  Random createNewRandom() {
        return new Random();
    }
//    use
    @Autowired
    private Random random;
*/
    @GetMapping("/employee/{id2}")
    public EmployeeResponse getEmployeeById(@PathVariable(name = "id2") String id) {
        // Validate id => Number Only
        int _id = 0;
        try {
            _id = Integer.parseInt(id);
        }catch (NumberFormatException e){
            // ERROR => TODO ?

        }
        // Workshop
        int number = random.nextInt(10);
        return new EmployeeResponse(_id, "Somkiat" + number, "Pui");
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
