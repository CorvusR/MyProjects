package projects.calculator;

public class OperationsImpl implements Operations {


    @Override
    public double add(double a, double b) {
        Numbers numbers = new Numbers(a, b);
        return a + b;
    }

    @Override
    public double minus(double a, double b) {
        Numbers numbers = new Numbers(a, b);
        return a - b;
    }

    @Override
    public double multiply(double a, double b) {
        Numbers numbers = new Numbers(a, b);
        return a * b;
    }

    @Override
    public double divide(double a, double b) {
        Numbers numbers = new Numbers(a, b);
        return a / b;
    }

}
