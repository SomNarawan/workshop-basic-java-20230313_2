package com.example.hellorest.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {
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

    public EmployeeResponse process(int id) {
        int number = random.nextInt(10);

        // Call repository
//        try {
//            Employee employee = repository.getById(_id);
//            return new EmployeeResponse(_id, employee.getFirstName(), employee.getLastName());
//        }catch (Exception e){
//            return new EmployeeResponse();
//        }
        Optional<Employee> result = repository.findById(id);
        if(result.isPresent()) {
            Employee employee = result.get();
            return new EmployeeResponse(id, employee.getFirstName() + number, employee.getLastName());
        }
        // Not found ?
        return new EmployeeResponse();
    }
}
