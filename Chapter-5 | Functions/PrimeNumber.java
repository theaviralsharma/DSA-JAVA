public class PrimeNumber {
    public static boolean checkPrime(int num){
        if(num<=1){
            return false;
        }
        if(num==2){
            return true;
        } else {
            for(int i=2; i<=Math.sqrt(num);i++){
                if(num%i==0){
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean checkPrimes(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false; // Return false for even numbers greater than 2
        }
        
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
    
        return true;
    }

    public static void printPrime(int num){
        for(int i=2; i<=num; i++){
            if(checkPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(checkPrime(12));
        printPrime(100);
    }    
}
