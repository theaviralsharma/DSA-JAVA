import java.util.Scanner;
public class StringsBasics {
    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        // char arr[] = {'a','b','c'};

        //Strigs are immutable - we can't change the original string;
        String str = "abcd";
        String str2 = new String("xyz");
        System.out.println(str.length()+" "+str2.length());
        printLetters(str2);
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
        sc.close();
    }
}