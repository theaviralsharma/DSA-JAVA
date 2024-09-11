public class PowerOfNumber {
    public static void checkPower(int num,int power){
        int result = 1;
        while (power>0) {
            result *= num;
            power--;
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        int num = 5;
        int power = 3;
        checkPower(num,power);
    }
}
