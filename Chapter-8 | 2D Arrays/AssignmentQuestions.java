public class AssignmentQuestions {
    public static int answerOne(int arr[][], int target){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j]==target){
                    count++;
                }
            }
        }
        return count;
    }

    public static int answerTwo(int arr[][]){
        int sum = 0;
        for(int j=0; j<arr[0].length; j++){
            sum += arr[1][j];
        }
        return sum;
    }

    public static void answerThree(String arr[][]) {
        // Check if the matrix is empty
        if (arr == null || arr.length == 0 || arr[0].length == 0) {
            System.out.println("Matrix is empty");
            return;
        }
    
        // Traverse through the matrix and print its transpose
        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length; i++) {
                // Check for jagged array case
                if (j < arr[i].length) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[][] = {{4,7,8},{8,8,7}};
        System.out.println(answerOne(arr,7));
        int arr2[][] = {{1,4,9},{11,4,3},{2,2,3}};
        System.out.println(answerTwo(arr2));
        String arr3[][] = {{"a11","a12","a13"},{"a21","a22","a23"}};
        answerThree(arr3);
    }    
}
