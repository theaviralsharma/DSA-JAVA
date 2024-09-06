import java.util.Scanner;

public class Basics2DArray {
    public static void searchArray(int matrix[][]){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==5){
                    System.out.println("Key is at "+i+"th row and "+j+"th column");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matrix[][] = new int[3][3];
        // int arr[][] = { {1,2}, {2,3} };

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print("Enter a number for "+i+"th row and "+j+"th column: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<matrix.length; i++){
            System.out.print("[");
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("]");
        }

        searchArray(matrix);
        sc.close();
    }    
}
