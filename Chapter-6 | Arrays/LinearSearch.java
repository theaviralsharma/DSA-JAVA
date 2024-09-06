public class LinearSearch {
    public static int linearSearch(int arr[], int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10, 12, 14, 16};
        int key = 12;
        System.out.println("Key is at index: "+linearSearch(arr,key));
    }    
}
