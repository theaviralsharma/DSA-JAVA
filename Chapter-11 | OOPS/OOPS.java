public class OOPS {
    public static void main(String[] args) {
       Pen p1 = new Pen(); // Created a pen object called P1
       p1.setColor("Blue");
       System.out.println(p1.color);
       p1.setTip(5);
       System.out.println(p1.tip);

       BankAccount myAcc = new BankAccount();
       myAcc.username = "Aviral";
       myAcc.setPassword("abcd");
    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String newPassword){
        password = newPassword;
        System.out.println(password);
    }

}

class Pen {
    // Attributes or Properties
    String color;
    int tip;

    // Functions
    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class Students {
    int rollNo;
    String name;
    int age;
    float percentage; 

    void calcPercentage(int phy, int chem, int math){
        System.out.println((phy+chem+math)/3); 
    }

}