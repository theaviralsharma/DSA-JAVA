public class AssignmentQuestions {
    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int swaps = 0; // Track whether any swaps are made in the current pass

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j + 1] < arr[j]) {
                    // Swap arr[j] and arr[j+1] if they are in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++; // Increment swap counter
                }
            }

            // If no swaps were made, the array is already sorted
            if (swaps == 0) {
                break; // Exit the outer loop early
            }
        }

        printArray(arr); // Function to print the sorted array
    }

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i; // Assume the current position i is the minimum

            // Find the actual minimum element in the unsorted part of the array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j; // Update minPos if a smaller element is found
                }
            }

            // Only swap if the minimum is not already in the correct position
            if (minPos != i) {
                int temp = arr[minPos];
                arr[minPos] = arr[i];
                arr[i] = temp;
            }
        }

        printArray(arr); // Function to print the sorted array
    }

    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i]; // Element to be inserted
            int prev = i - 1; // Index of the previous element

            // Find the correct position for curr by shifting larger elements to the right
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev]; // Shift element to the right
                prev--; // Move to the previous element
            }

            // Insert curr in its correct position
            arr[prev + 1] = curr;
        }

        printArray(arr); // Function to print the sorted array
    }

    public static void countingSort(int arr[]) {
        // Find the largest element in the array
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
    
        // Create a count array to store the frequency of each element
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
    
        // Reconstruct the sorted array
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    
        printArray(arr);  // Function to print the sorted array
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        countingSort(arr);
    }
}
