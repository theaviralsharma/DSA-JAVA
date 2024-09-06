public class LargestNumber {
    public static int largest(int arr[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
            }
            if(min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Smallest number is: "+min);
        return max;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 6, 3, 5 };
        System.out.println("Largest number is: "+largest(arr));
    }    
}
