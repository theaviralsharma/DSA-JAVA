public class Powerof2 {
    public static boolean checkPowerof2(int num){
        return (num & (num-1)) == 0 ;
    }
    public static void main(String[] args) {
        int num = 16;
        System.out.println(checkPowerof2(num));
    }    
}
