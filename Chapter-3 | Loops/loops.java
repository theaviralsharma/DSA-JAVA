import java.util.Scanner;

public class loops {
    public static boolean prime(int num) {
        if (num <= 1) {
            return false;
        }
    
        if (num == 2) {
            return true;
        } else {
            int sqrtNum = (int)Math.sqrt(num);
            for (int i = 2; i <= sqrtNum; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {
        //while loop
        // int num = 0;
        // while (num<10) {
        //     System.out.println("Hello Aviral");
        //     num++;
        // }

        // int num2 = 1;
        // while (num2<=10) {
        //     System.out.println(num2);
        //     num2++;
        // }

        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter value of n: ");
        // int n = sc.nextInt();
        // while (num2<=n) {
        //     System.out.print(num2+" ");
        //     num2++;
        // }
        
        // int sum = 0;
        // int i = 1;
        // while (i<=n) {
        //     sum += i;
        //     i++;
        // }
        // System.out.println(sum);

        // for loop
        // for(int i=1; i<=10; i++){
        //     System.out.println(i);
        // }
        
        // for(int i=1; i<=4; i++){
        //     System.out.println("****");
        // }

        // int number = 10234;
        // int rev = 0;
        // while (number>0) {
        //     int lastdigit = number%10;
        //     System.out.print(lastdigit);
        //     number /= 10;
        // }
        
        // while (number>0){
        //     int lastdigit = number%10;
        //     rev = (rev*10)+lastdigit;
        //     number /= 10;
        // }
        // System.out.println(rev);

        // do-while
        // int i = 1;
        //     do{
        //         System.out.println(i);
        //         i++;
        //     } while (i<=10);

        // for(int i=1; i<=5; i++){
        //     if(i==3){
        //         break;
        //     }
        //     System.out.println(i);
        // }

        // while (true) {
        //     System.out.print("Enter a number: ");
        //     int num = sc.nextInt();
        //     if(num%10==0){
        //         break;
        //     }
        //     if(num%5==0){
        //         continue;
        //     }
        //     System.out.println(num);
        // }

        // Prime or Not
        int num = 4;
        System.out.println(prime(num));

        sc.close();
    }    
}
