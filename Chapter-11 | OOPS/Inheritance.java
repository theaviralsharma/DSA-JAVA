public class Inheritance {
    public static void main(String[] args) {
        // Dog dobby = new Dog();
        // dobby.eat();
        // dobby.legs = 4;
        // System.out.println(dobby.legs);
    }    
}

// Base Class ( Parent Class )
class Animal {
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}

// Derived Class
class Mammal extends Animal {
    void walk(){
        System.out.println("walks");
    }
}

class Fish extends Animal {
    void swim(){
        System.out.println("swims");
    }
}

class Bird extends Animal {
    void fly(){
        System.out.println("flys");
    }
}