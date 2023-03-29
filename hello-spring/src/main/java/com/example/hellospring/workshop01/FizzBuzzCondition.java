package com.example.hellospring.workshop01;

public class FizzBuzzCondition implements MyCondition {
    public boolean check(Integer input) {
        return input % 3 == 0 & input % 5 == 0;
    }

    public String print(){
        return "FizzBuzz";
    }
}
