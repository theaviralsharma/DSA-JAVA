import java.util.Scanner;

public class HollowRectangle {
    public static void printHollowRectangle(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num; j++){
                if(i==1 || i==num || j==1 || j==num){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void solidRhombus(int num){
        for(int i=1; i<=num; i++){
            for(int j=i; j<num; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=num; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void HollowRhombus(int num){
        for(int i=1; i<=num; i++){
            for(int j=i; j<num; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=num; j++){
                if(i==1 || i==num || j==1 || j==num){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void Diamond(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=num; i>=1; i--){
            for(int j=1; j<=num-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num:");
        int num = sc.nextInt();
        printHollowRectangle(num);
        System.out.println();
        solidRhombus(num);
        System.out.println();
        HollowRhombus(num);
        System.out.println();
        Diamond(num);
        sc.close();
    }
}
