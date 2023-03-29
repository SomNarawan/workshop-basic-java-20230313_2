package com.example.hellospring.workshop01;

public class FizzBuzz {
    public String fizzBuzz(Integer input){
        String output = "";
        if(input%3 == 0){
            output = output.concat("Fizz");
        }
        if(input%5 == 0){
            output = output.concat("Buzz");
        }
        if(!output.contains("Fizz") && !output.contains("Buzz")){
            output = String.valueOf(input);
        }
        return output;
    }
}
