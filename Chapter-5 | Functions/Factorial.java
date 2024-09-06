import java.util.Scanner;

public class Factorial {
    public static int checkFactorial(int num){
        int factorial=1;
        for(int i=1; i<=num; i++){
            factorial *= i;
        }
        return factorial;
    }
    
    public static int checkBinomailCoefficient(int n , int r){
        int N_factorial = checkFactorial(n);
        int R_factorial = checkFactorial(r);
        int N_minus_R_factorial = checkFactorial(n-r);

        int binomialCoefficient = (N_factorial)/(R_factorial*N_minus_R_factorial);
        return binomialCoefficient;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = sc.nextInt();
    
        System.out.println("Factorial of "+num+" is "+checkFactorial(num));
        System.out.println("Binomial Coefficient is "+checkBinomailCoefficient(5,2));

        sc.close();
    }    
}