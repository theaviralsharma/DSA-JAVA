import java.util.Scanner;

public class StarPatterns {
    public static void printStarPattern(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void invertedStarPattern(int num){
        for(int i=1; i<=num; i++){
            for(int j=i; j<=num; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void invertedRotatedStarPattern(int num){
        for(int i=1; i<=num; i++){
            for(int j=i; j<num; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void ButterflyPattern(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(num-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=num; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(num-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        printStarPattern(num);
        System.out.println();
        invertedStarPattern(num);
        System.out.println();
        invertedRotatedStarPattern(num);
        System.out.println();
        ButterflyPattern(num);

        sc.close();
    }    
}
