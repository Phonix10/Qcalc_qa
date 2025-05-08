package org.example;

public class LogicalCalculator extends StandardCalculator {
    // constructor
    public LogicalCalculator() {
        System.out.println("Logical Calculator Created");
    }

    public void and(int num1, int num2) {
        this.result = (num1 != 0 && num2 != 0) ? 1 : 0;
    }

    public void or(int num1, int num2) {
        this.result = (num1 != 0 || num2 != 0) ? 1 : 0;
    }

    public void not(int num) {
        this.result = (num == 0) ? 1 : 0;
    }



    
}
