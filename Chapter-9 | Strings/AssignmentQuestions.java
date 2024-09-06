import java.util.Arrays;
import java.util.Scanner;

public class AssignmentQuestions {
    public static void checkLowerCaseVowels(String str){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean checkAnagrams(String str1 , String str2){
        // Step 1: Check if lengths are equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Step 2: Convert strings to lowercase (if case-insensitive)
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Step 3: Convert to character arrays and sort
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Step 4: Compare sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        // checkLowerCaseVowels(str);
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(checkAnagrams(str1,str2));
        sc.close();
    }
}
