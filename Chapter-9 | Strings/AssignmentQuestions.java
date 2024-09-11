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
    public static boolean checkAnagrams(String s , String t){
        // Step 1: Check if lengths are equal
        if (s.length() != t.length()) {
            return false;
        }

        // Step 2: Convert strings to lowercase (if case-insensitive)
        s = s.toLowerCase();
        t = t.toLowerCase();

        // Step 3: Convert to character arrays and sort
        char[] charArray1 = s.toCharArray();
        char[] charArray2 = t.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Step 4: Compare sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        // checkLowerCaseVowels(str);
        String s = "listen";
        String t = "silent";
        System.out.println(checkAnagrams(s,t));
        sc.close();
    }
}
