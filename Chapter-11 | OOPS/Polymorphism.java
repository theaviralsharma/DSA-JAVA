public class Polymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(1.5f, 2.5f));

        Deer d1 = new Deer();
        d1.eats();
    }
}

class Animal {
    void eats(){
        System.out.println("Animal Eats Anything");
    }
}

class Deer extends Animal {
    void eats(){
        System.out.println("Deer Eats Grass");
    }
}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}
