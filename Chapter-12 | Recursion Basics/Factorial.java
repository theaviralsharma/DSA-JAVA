public class Factorial {
    public static int printFactorial(int n){
        if (n == 1) {
            return 1;
        }
        int factorial = n * printFactorial(n - 1);  // Recursive call
            return factorial;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(printFactorial(n)); 
    }    
}
