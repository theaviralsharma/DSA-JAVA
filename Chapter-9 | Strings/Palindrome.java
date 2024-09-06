public class Palindrome {
    public static boolean checkPalindrome(String s){
        String lowerCase = s.toLowerCase();
        String cleanedString = lowerCase.replaceAll("[^a-zA-Z0-9]", "");
        for(int i=0; i<cleanedString.length(); i++){
            if(cleanedString.charAt(i)!=cleanedString.charAt(cleanedString.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(checkPalindrome(str));
    }    
}
