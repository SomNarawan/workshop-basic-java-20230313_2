package com.example.hellospring.workshop01;

public class FizzBuzz {
    public String fizzBuzz(Integer input){
        // Prepare all conditions
        MyCondition[] conditions = new MyCondition[]{
                new FizzBuzzCondition(),
                new FizzCondition(),
                new BuzzCondition(),
                new KBTGCondition()
        };

        // Check condition
        for (MyCondition condition : conditions) {
            if(condition.check(input)) {
                return condition.print();
            }
        }

        return String.valueOf(input);
    }
}

/**
 * Condition 1 :: 3,5 => FizzBuzz
 * Condition 2 :: 3 => Fizz
 * Condition 3 :: 5 => Buzz
 * Condition 4 :: Same number
 * Condition 5 :: 7 => KBTG BASIC JAVA
 */
