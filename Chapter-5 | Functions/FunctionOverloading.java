public class FunctionOverloading {
    public static int sum(int a , int b){
        return a+b;
    }
    public static float sum(float a , float b){
        return a+b;
    }
    public static int sum(int a , int b , int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println(sum(1.2f, 2.2f));
        System.out.println(sum(1, 2, 3));
    }    
}
