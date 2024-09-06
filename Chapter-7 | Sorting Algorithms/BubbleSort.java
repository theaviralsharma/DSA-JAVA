public class BubbleSort {
    public static void bubbleSort(int arr[]) {
        for(int i=0; i<arr.length-1; i++){
            int swaps = 0;
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                        arr[j] =arr[j+1];
                        arr[j+1] = temp;
                        swaps++;
                }
            }
            if(swaps == 0){
                break;
            }
        }
        printBubbleSort(arr);
    }

    public static void printBubbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        bubbleSort(arr);
    }
}
