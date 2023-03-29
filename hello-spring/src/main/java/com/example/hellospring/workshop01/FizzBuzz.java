package com.example.hellospring.workshop01;

public class FizzBuzz {
    public String fizzBuzz(Integer input){
        String output = "";
        if(input%3 == 0){
            output = output.concat("Fizz");
        }
        if(!output.contains("Fizz")){
            output = String.valueOf(input);
        }
        return output;
    }
}
