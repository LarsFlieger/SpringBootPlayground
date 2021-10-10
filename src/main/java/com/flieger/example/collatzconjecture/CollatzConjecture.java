package com.flieger.example.collatzconjecture;

import java.util.ArrayList;
import java.util.List;

public class CollatzConjecture {
    private final long startingNumber;
    private final List<Long> numbers;
    private final long iterations;
    private final int countNumberStartsWithOne;

    public CollatzConjecture(long startingNumber) {
        this.startingNumber = startingNumber;
        this.numbers = calculate();
        this.iterations = this.numbers.size() - 1;
        this.countNumberStartsWithOne = getCountOfNumbersFirstDigit(1);
    }

    private List<Long> calculate() {
        long number = startingNumber;
        List<Long> numbers = new ArrayList<Long>();
        numbers.add(startingNumber);

        while(number > 1) {
            if(number % 2 == 0) 
                number = number / 2;
            else 
                number = number * 3 + 1;
            numbers.add(number);
        }

        return numbers;
    }

    private int getCountOfNumbersFirstDigit(int startDigit) {
        int count = 0;

        for(int i = 0; i < this.numbers.size(); i++) {
            if (isStartingWithNumber(this.numbers.get(i), startDigit)) 
                count++;
        }
        
        return count;
    }


    private boolean isStartingWithNumber(long number, int startDigit) {
        String stringNumber = Long.toString(number);

        return stringNumber.startsWith(Integer.toString(startDigit));
    }

    public long getIterations() {
        return iterations;
    }

    public long getStartingNumber() {
        return startingNumber;
    }
    
    public List<Long> getNumbers() {
        return numbers;
    }

    public int getCountNumberStartsWithOne() {
        return countNumberStartsWithOne;
    }
}
