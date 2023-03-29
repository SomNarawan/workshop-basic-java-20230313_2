package com.example.hellospring.workshop01;

public class FizzBuzz {
    public String fizzBuzz(Integer input){
        // Prepare all conditions
        MyCondition[] conditions = new MyCondition[]{
                new FizzBuzzCondition(),
                new FizzCondition(),
                new BuzzCondition()
        };

        for (MyCondition condition : conditions) {
            if(condition.check(input)) {
                return condition.print();
            }
        }

        return String.valueOf(input);
    }
}
