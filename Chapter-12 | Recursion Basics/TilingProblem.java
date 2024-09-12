public class TilingProblem {
    public static int checkWays(int length, int breadth){
        if( breadth == 0 || breadth == 1){
            return 1;
        }
        // vertical choice
        int verticalTiles = checkWays(length, breadth-1);
        // horizontal choice
        int horizontalTiles = checkWays(length, breadth-2);

        return verticalTiles + horizontalTiles;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(checkWays(2,n));
    }    
}
