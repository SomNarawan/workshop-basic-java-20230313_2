package com.example.hellospring.workshop01;

public class FizzBuzz {
    public String fizzBuzz(Integer input){
        FizzBuzzCondition fizzBuzzCondition = new FizzBuzzCondition();
        if(fizzBuzzCondition.check(input)){
            return fizzBuzzCondition.print();
        }
        FizzCondition fizzCondition = new FizzCondition();
        if(fizzCondition.check(input)){
            return fizzCondition.print();
        }
        if(input%5 == 0) return "Buzz";
        return String.valueOf(input);
    }
}
