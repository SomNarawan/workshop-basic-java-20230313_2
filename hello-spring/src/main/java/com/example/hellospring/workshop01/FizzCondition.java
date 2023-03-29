package com.example.hellospring.workshop01;

public class FizzCondition implements MyCondition {
    public boolean check(Integer input) {
        return input % 3 == 0;
    }

    public String print(){
        return "Fizz";
    }
}
