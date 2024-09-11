public class Abstraction {
    public static void main(String[] args) {
        // Animal a = new Animal(); // CANNOT CREATE OBJECT OF ABSTRACT CLASSES;

        Horse h = new Horse();
        h.eat();
        h.walk();
        h.changeColor();
        System.out.println(h.color);

        Chicken c = new Chicken();
        c.eat();
        c.walk();
        System.out.println(c.color);

        Queen q = new Queen();
        q.moves();
    }    
}

interface Herbivore {

}

interface Carnivore {

}

class Bear implements Herbivore, Carnivore {
    // Multi-level inheritance using interface
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("UP, DOWN, LEFT, RIGHT, DIAGONAL ( in all 4 directions)");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("UP, DOWN, LEFT, RIGHT");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("UP, DOWN, LEFT, RIGHT, daigonal - (by 1 step)");
    }
}

abstract class Animal {
    String color;

    Animal(){
        color = "brown";
    }
    void eat(){
        System.out.println("Animal eats");
    }

    abstract void walk(); // abtract method;
}

class Horse extends Animal{
    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal{
    void walk(){
        System.out.println("Walks on 2 legs");
    }
}
