public class BitwiseOperators {
    public static void checkOddorEven(int num){
        int bitMask = 1;
        if((num&bitMask)==0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static int checkithBit(int num, int ith){
        int bitMask = 1<<ith; 
        if((num & bitMask) == 0){
            return 0;
        } else{
            return 1;
        }
    }

    public static int setithBit(int num, int ith){
        int bitMask = 1<<ith;
        return num | bitMask;
    }

    public static int clearithBit(int num,int ith){
        int bitMask = ~(1<<ith);
        return num & bitMask;

    }

    public static int updateithBit(int num,int ith, int newBit){
        if(newBit == 0){
            return clearithBit(num, ith);
        } else {
            return setithBit(num, ith);
        }
    }

    public static int clearLastiBits(int num, int i){
        int bitMask = (~0)<<i;
        return num & bitMask;
    }

    public static int clearRangeofBits(int num, int i,int j){
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int bitMask = a | b;
        return num & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(5&6); // Binary AND
        System.out.println(5|6); // Binray OR
        System.out.println(5^6); // Binray XOR
        System.out.println(~5); // Binray 1's Complement +1
        System.out.println(5<<2); // Binray Left Shift
        System.out.println(6>>1); // Bimray Right Shift

        // Check if number is Odd or Even => do & with (1) bitMask
        checkOddorEven(11);
        System.out.println(checkithBit(10, 1));
        System.out.println(setithBit(10,2));
        System.out.println(clearithBit(10,1));
        System.out.println(updateithBit(10,2,1));
        System.out.println(clearLastiBits(15,2));
        System.out.println(clearRangeofBits(10,2,4));
    }
}