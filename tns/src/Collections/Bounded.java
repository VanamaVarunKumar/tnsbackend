package Collections;

class Calculator<T extends Number > {
    public double add(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }
}

public class Bounded {
    public static void main(String[] args) {
        Calculator<Integer> intCalc = new Calculator<>();
        System.out.println(intCalc.add(10, 20));  

        Calculator<Double> doubleCalc = new Calculator<>();
        System.out.println(doubleCalc.add(5.5, 4.5));  
    }
}
