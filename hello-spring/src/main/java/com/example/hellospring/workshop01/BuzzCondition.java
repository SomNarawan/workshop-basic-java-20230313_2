package com.example.hellospring.workshop01;

public class BuzzCondition implements MyCondition {

    public boolean check(Integer input) {
        return input % 5 == 0;
    }

    public String print() {
        return "Buzz";
    }
}
