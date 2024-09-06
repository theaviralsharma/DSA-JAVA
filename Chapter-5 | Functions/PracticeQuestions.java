public class PracticeQuestions {
    public static void averageThree(int a, int b, int c){
        System.out.println("Average of "+a+" "+b+" "+c+" is "+(a+b+c)/3);
    }
    public static boolean isEven(int num){
        if(num%2==0){
            return true;
        } else {
            return false;
        }
    }
    public static void checkPalindrome(int num){
        int originalNum = num;
        int rev = 0;
        while (num>0) {
            int lastDigit = num%10;
                rev = (rev*10)+lastDigit;
                num /= 10;
        }
        if(rev==originalNum){
            System.out.println(originalNum+" is a Palindrome");
        } else {
            System.out.println(originalNum+" is not a Palindrome");
        }
    }
    public static void digitsSum(int num){
        int originalNum = num;
        int sum = 0;
        while (num>0) {
            int lastDigit = num%10;
            sum += lastDigit;
            num /= 10;
        }
        System.out.println("Sum of digits of numbers "+originalNum+" is "+sum);
    }
    public static void main(String[] args) {
        averageThree(2,3,4);

        System.out.println(isEven(10));

        checkPalindrome(121);

        System.out.println(Math.min(5, 2));
        System.out.println(Math.max(5, 2));
        System.out.println(Math.sqrt(25));
        System.out.println(Math.pow(5, 2));
        System.out.println(Math.abs(5.4));

        digitsSum(12345);

    }
}
