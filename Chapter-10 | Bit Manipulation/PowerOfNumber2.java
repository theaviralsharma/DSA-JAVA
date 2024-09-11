public class PowerOfNumber2 {
    public static int checkPowerofNumber2(int num){
        if(num%2!=0){
            return -1;
        }
        int count = 0;
        while (num>1) {
            num /= 2;
            count++;     
        }
        return count;
    }
    public static void main(String[] args) {
        int num = 64;
        System.out.println(checkPowerofNumber2(num));
    }
}
