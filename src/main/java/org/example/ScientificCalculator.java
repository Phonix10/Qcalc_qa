package org.example;

public class ScientificCalculator  extends StandardCalculator {
    // constructor
    public ScientificCalculator() {
        System.out.println("Scientific Calculator Created");
    }

    //Sine
    public final void sine(double num) {
        this.result = Math.sin(num);
    }
    //Cosine
    public final void cosine(double num) {
        this.result = Math.cos(num);
    }
    //Tan
    public final void tan(double num) {
        this.result = Math.tan(num);
    }
    //Log
    public final void log(double num) {
        this.result = Math.log(num);
    }
    //Log10
    public final void log10(double num) {
        this.result = Math.log10(num);
    }
    //Exponential
    public final void exponential(double num) {
        this.result = Math.exp(num);
    }
    //Power
    public final void power(double base, double exponent) {
        this.result = Math.pow(base, exponent);
    }
    //Factorial
    public final void factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Cannot calculate factorial of a negative number");
        }
        this.result = 1;
        for (int i = 1; i <= num; i++) {
            this.result *= i;
        }
    }

    //Square Root
    public final void squareRoot(double num) {
        if (num < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        }
        this.result = Math.sqrt(num);
    }

    //Cube Root
    public final void cubeRoot(double num) {
        this.result = Math.cbrt(num);
    }

    
}
