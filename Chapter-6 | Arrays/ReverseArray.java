public class ReverseArray {
    public static void reverseArray(int arr[]){
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }

    }
    public static void reverseArraySwap(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while (start<end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;

                start++;
                end--;
        }
    }
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10};
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        reverseArraySwap(arr);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }    
}
