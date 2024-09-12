public class FibonacciNumber {
    public static int printFibonacciNumber(int Nth){
        if(Nth==0){
            return 0;
        }
        if(Nth==1){
            return 1;
        }

        int fibonacci = printFibonacciNumber(Nth-1) + printFibonacciNumber(Nth-2); 
        return fibonacci;
    }
    public static void main(String[] args) {
        int Nth = 4;
        System.out.println(printFibonacciNumber(Nth));
    }
}
