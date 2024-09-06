public class SpiralMatrix {
    public static void spiralMatrix(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while (startRow<=endRow && startCol<=endCol) {
            // top
            for(int j=startCol; j<=endCol; j++){
                System.out.print(matrix[startRow][j]+" ");
            }

            // bottom
            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(matrix[i][endCol]+" ");
            }

            // left
            if(startRow<endRow){
                for(int j=endCol-1; j>=startCol; j--){
                    System.out.print(matrix[endRow][j]+" ");
                }
            }

            if(startCol<endCol){
                for(int i=endRow-1; i>=startRow+1; i--){
                    System.out.print(matrix[i][startCol]+" ");
                }
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},};
        // int arr[][] = {{1,2,3},{5,6,7},{9,10,11}};
           int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        spiralMatrix(arr);
    }    
}
