package Wiley_pkg_1;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
}

public class PolyCompile {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int sum1 = calc.add(1, 2); 
        double sum2 = calc.add(1.5, 2.5);
        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);
    }
}

