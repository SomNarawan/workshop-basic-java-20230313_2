package com.example.hellorest.employee;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class EmployeeControllerMockBeanTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @MockBean
    private MyRandom random;

    @MockBean
    private EmployeeRepository repository;

    @Test
    public void  callAPIWithPathVariableAndWithoutDatabase() {
        // Mock/Stub/Spy
//        when(random.nextInt(10)).thenReturn(5);
        when(random.nextInt(anyInt())).thenReturn(5);

        Employee mock = new Employee(123, "Mock fname", "Mock lname");
        when(repository.findById(123)).thenReturn(Optional.of(mock));

        // Testing
        EmployeeResponse expected = new EmployeeResponse(123, "Mock fname5", "Mock lname");

        // Call API
        EmployeeResponse response = restTemplate.getForObject("/employee/123", EmployeeResponse.class);

        assertEquals(123,response.getId());
        assertEquals("Mock fname5",response.getFname());
        assertEquals("Mock lname",response.getLname());
        assertEquals(expected, response);
    }

    @Test
    public void  callAPIWithPathVariableAndWithoutDatabaseAndEmployeeNotFound() {
        // Mock/Stub/Spy
//        when(random.nextInt(10)).thenReturn(5);
        when(random.nextInt(anyInt())).thenReturn(5);

        when(repository.findById(123)).thenReturn(Optional.empty());

        // Testing
        EmployeeResponse expected = new EmployeeResponse();

        // Call API
        EmployeeResponse response = restTemplate.getForObject("/employee/123", EmployeeResponse.class);

        assertEquals(0,response.getId());
        assertNull(response.getFname());
        assertNull(response.getLname());
        assertEquals(expected, response);
    }
}
