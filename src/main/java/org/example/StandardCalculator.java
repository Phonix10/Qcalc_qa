package org.example;



public class StandardCalculator {
    protected double result;

    // constructor
    public  StandardCalculator() {
        System.out.println("Standard Calculator Created");
        this.result = 0;
    }

    // setter 
    // Methods for basic operations
    // add
    // to aviod overloading 
    public final void add(int num1, int num2) {
        add((double)num1, (double)num2);

    }
    public final void add(double num1, double num2){
        this.result =  num1 + num2;
    }
    // subtract
    // to aviod overloading
    public final void subtract(int num1, int num2) {
        subtract((double)num1, (double)num2);
    }
    public final void subtract(double num1, double num2){
        this.result =  num1 - num2;
    }


    // multiply
    // to aviod overloading
    public final void multiply(int num1, int num2) {
        
        multiply((double)num1, (double)num2);
    }
    public final void multiply(double num1, double num2) {
        double result = num1 * num2;

        this.result = result;
    }


    // divide
    // to aviod overloading
    public final void divide(int num1, int num2) {
        divide((double)num1, (double)num2);
    }

    public void divide(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        result =  num1 / num2;
    }


    // getter 
    public double getResult() {
        return this.result;
    }

    //clear
    public void clear() {
        this.result = 0;
    }

    // version of calculator
    public void getversion() {
        System.out.println("Standard Calculator Version 1.0");
    }
    // print result
    public void printResult(){
        System.out.println("Standard Calculator Result:"+ result);
    }

    
    
}
