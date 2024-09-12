public class SortedArray {
    public static boolean checkSortedArray(int arr[], int index) {
        // Base case: If we have reached the last element, the array is sorted
        if (index == arr.length - 1) {
            return true;
        }
        // If the current element is greater than the next, the array is not sorted
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        // Recursive call to check the rest of the array
        return checkSortedArray(arr, index + 1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};  // Sorted array
        System.out.println(checkSortedArray(arr, 0));  // Start from index 0
    }
}