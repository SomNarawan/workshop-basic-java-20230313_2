package com.example.hellorest.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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
    @Autowired
    private EmployeeRepository repository;

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
        // Workshop
        int number = random.nextInt(10);

        // Call repository
//        try {
//            Employee employee = repository.getById(_id);
//            return new EmployeeResponse(_id, employee.getFirstName(), employee.getLastName());
//        }catch (Exception e){
//            return new EmployeeResponse();
//        }
        Optional<Employee> result = repository.findById(_id);
        if(result.isPresent()) {
            Employee employee = result.get();
            return new EmployeeResponse(_id, employee.getFirstName() + number, employee.getLastName());
        }
        // Not found ?
        return new EmployeeResponse();
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
