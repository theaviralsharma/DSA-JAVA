public class Search2DArray {
    public static boolean search2DArray(int matrix[][],int target){
        int row = 0;
        int col = matrix[0].length-1;

        while (row<matrix.length && col>=0 ) {
            if(matrix[row][col]==target){
                return true;
            } else if (target<matrix[row][col]){
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int target = 33;
        search2DArray(arr,target);
    }    
}
