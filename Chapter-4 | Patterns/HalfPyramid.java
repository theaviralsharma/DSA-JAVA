import java.util.Scanner;

public class HalfPyramid {
    public static void printHalfPyramid(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void invertedHalfPyramid(int num){
        int count = 1;
        for(int i=1; i<=num; i++){
            for(int j=i; j<=num; j++){
                System.out.print(count);
                count++;
            }
            System.out.println();
            count = 1;
        }
    }

    public static void FloydTriangle(int num){
        int count = 1;
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }

    public static void ZeroOneTriangle(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1"+" ");
                } else {
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
    }

    public static void NumberPyramid(int num){
        for(int i=1; i<=num; i++){
            for(int j=i; j<=num; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void PalindromicPyramid(int num) {
        for (int i = 1; i <= num; i++) {
            // Print leading spaces
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
                System.out.print(" ");
            }
    
            // Print descending numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j+" ");
            }
    
            // Print ascending numbers starting from 2
            for (int j = 2; j <= i; j++) {
                System.out.print(j+" ");
            }
    
            // Move to the next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        printHalfPyramid(num);
        System.out.println();
        invertedHalfPyramid(num);
        System.out.println();
        FloydTriangle(num);
        System.out.println();
        ZeroOneTriangle(num);
        System.out.println();
        NumberPyramid(num);
        System.out.println();
        PalindromicPyramid(num);

        sc.close();
    }
}
