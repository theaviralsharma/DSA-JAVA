public class BinToDec {
    public static int binaryToDecimal(int binary){
        int decimal = 0;
        int power = 0;
        while (binary>0) {
            int lastdigit = binary%10;
            decimal += (lastdigit * Math.pow(2,power));
            binary /= 10; 
            power++;
        }
        return decimal;
    }

    public static int decimalToBinary(int decimal){
        int binary = 0;
        int power = 0;
        while (decimal>0) {
            int rem = decimal%2;
            binary += (rem * Math.pow(10, power));
            decimal /= 2;
            power++;
        }
        return binary;
    }
    public static void main(String[] args) {
        System.out.println(binaryToDecimal(11001));
        System.out.println(decimalToBinary(25));
    }    
}
