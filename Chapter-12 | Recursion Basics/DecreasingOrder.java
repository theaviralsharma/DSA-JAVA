public class DecreasingOrder {
    public static void printDecreasingOrder(int n){
        if(n==1){
            System.out.println(n+" ");
            return;
        }
        System.out.print(n+" ");
        printDecreasingOrder(n-1);
    }

    public static void printIncreasingOrder(int n){
        if (n == 0) {
            return;
        }
        printIncreasingOrder(n - 1);  // First, print all numbers less than n
        System.out.print(n+" ");        // Then print the current number
    }

    public static void main(String[] args) {
        int n = 10;
        printDecreasingOrder(n);
        printIncreasingOrder(n);
    }
}