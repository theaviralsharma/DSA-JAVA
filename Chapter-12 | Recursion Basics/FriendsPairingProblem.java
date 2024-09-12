public class FriendsPairingProblem {
    public static int checkWays(int n){
        if( n == 1 || n == 2){
            return n;
        }
        
        return checkWays(n-1)+ (n-1) * checkWays(n-2);
    }
    public static void main(String[] args) {
        System.out.println(checkWays(3));
    }    
}
