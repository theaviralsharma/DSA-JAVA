public class GettersSetters {
    public static void main(String[] args) {
       Pen p1 = new Pen(); // Created a pen object called P1
       p1.setColor("Blue");
       System.out.println(p1.getColor());
       p1.setTip(5);
       System.out.println(p1.getTip());
    }
}

class Pen {
    // Attributes or Properties
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    // Functions
    void setColor(String color){
        this.color = color;
    }

    void setTip(int tip){
        this.tip = tip;
    }
}