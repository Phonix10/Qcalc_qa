package org.example;

public class App {

    public static void main(String[] args) {
        // Create an instance of the StandardCalculator class
        StandardCalculator calculator = new StandardCalculator();

        // Perform some calculations
        calculator.add(5, 3);
        System.out.println("Addition Result: " + calculator.getResult());

        calculator.subtract(10, 4);
        System.out.println("Subtraction Result: " + calculator.getResult());

        calculator.multiply(2, 6);
        System.out.println("Multiplication Result: " + calculator.getResult());
        calculator.divide(12, 3);
        System.out.println("Division Result: " + calculator.getResult());

        // Create an instance of the ScientificCalculator class
        ScientificCalculator scientificCalculator = new ScientificCalculator();     
        scientificCalculator.sine(30);
        System.out.println("Sine Result: " + scientificCalculator.getResult());    
        scientificCalculator.cosine(30);
        System.out.println("Cosine Result: " + scientificCalculator.getResult());
        scientificCalculator.tan(30);
        System.out.println("Tan Result: " + scientificCalculator.getResult());
        scientificCalculator.log(10);
        System.out.println("Log Result: " + scientificCalculator.getResult());
        scientificCalculator.log10(100);
        System.out.println("Log10 Result: " + scientificCalculator.getResult());
        scientificCalculator.exponential(2);
        System.out.println("Exponential Result: " + scientificCalculator.getResult());
        scientificCalculator.power(2, 3);
        System.out.println("Power Result: " + scientificCalculator.getResult());
        scientificCalculator.factorial(5);
        System.out.println("Factorial Result: " + scientificCalculator.getResult());
        scientificCalculator.squareRoot(16);
        System.out.println("Square Root Result: " + scientificCalculator.getResult());
        scientificCalculator.cubeRoot(27);
        System.out.println("Cube Root Result: " + scientificCalculator.getResult());

        // Create an instance of the LogicalCalculator class
        LogicalCalculator logicalCalculator = new LogicalCalculator();
        logicalCalculator.and(1, 0);
        System.out.println("AND Result: " + logicalCalculator.getResult());
        logicalCalculator.or(1, 0);
        System.out.println("OR Result: " + logicalCalculator.getResult());
        logicalCalculator.not(1);
        System.out.println("NOT Result: " + logicalCalculator.getResult());
      
    }
    
}
