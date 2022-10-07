public class CalculatorTester {
    public static void main(String[] args) {
        Calculator newAverage = new Calculator();
        
        double ave1 = newAverage.calcAverage(20, 15.4);
        double ave2 = newAverage.calcAverage(5, 8, 6.4);
        
        System.out.println("The average of 20 and 15.4 is " + ave1);
        System.out.println("The average of 5, 8, and 6.4 is " + ave2);
    }
}
