public class RemoveDuplicates {
    public static void checkDuplicateString(String str, int index, StringBuilder newStr, boolean[] map) {
        if (index == str.length()) {
            System.out.println(newStr.toString());
            return;
        }
        
        char curr = str.charAt(index);
        // Check if the character is already seen
        if (map[curr - 'a']) {
            checkDuplicateString(str, index + 1, newStr, map);
        } else {
            // Mark the character as seen and add it to the result
            map[curr - 'a'] = true;
            checkDuplicateString(str, index + 1, newStr.append(curr), map);
        }
    }

    public static void main(String[] args) {
        String str = "appnnacollege";
        // Create a boolean map of size 26 for 'a' to 'z'
        checkDuplicateString(str, 0, new StringBuilder(""), new boolean[26]);
    }
}