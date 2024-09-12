public class XpowerN {
    
    public static int checkXpowerN(int x,int n){
        int power = 1;
        if(n == 0){
            return power;
        }
        power = x * checkXpowerN(x, n-1);
        return power;
    }

    public static int power(int x,int n){
        if(n==0) {
            return 1;
        }
        return x * power(x, n-1);
    }

    public static int powerN(int x, int n) {
        if (n == 0) {
            return 1;  // Base case: x^0 = 1
        }
        
        int halfPower = powerN(x, n / 2);
        
        if (n % 2 == 0) {
            // If n is even, x^n = (x^(n/2))^2
            return halfPower * halfPower;
        } else {
            // If n is odd, x^n = x * (x^(n/2))^2
            return x * halfPower * halfPower;
        }
    }

    public static void main(String[] args) {
        int x = 3;
        int n = 4;
        System.out.println(checkXpowerN(x,n));
        System.out.println(power(x, n));
        System.out.println(powerN(x, n));
    }    
}
