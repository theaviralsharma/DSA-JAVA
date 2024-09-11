public class SuperKeyword {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);
    }    
}

class Animal {
    String color; // Declare color as an instance variable
    
    Animal(){
        System.out.println("Animal Constructor is called");
    }
}

class Horse extends Animal {
    Horse() {
        super(); // Calls Animal's constructor
        System.out.println("Horse Constructor is called");
        super.color = "brown"; // Assign value to color
    }
}