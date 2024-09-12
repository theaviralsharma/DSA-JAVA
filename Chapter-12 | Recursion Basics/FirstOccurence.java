public class FirstOccurence {
    public static int checkFirstOccurence(int arr[], int key, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == key) {
            return index;
        }
        return checkFirstOccurence(arr, key, index + 1);
    }

    public static int lastOccurence(int arr[], int key, int index) {
        if (index == arr.length) {
            return -1;
        }
        int isFound = lastOccurence(arr, key, index + 1);
        if (isFound == -1 && arr[index] == key) {
            return index;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        int key = 5;
        System.out.println(checkFirstOccurence(arr, key, 0));
        System.out.println(lastOccurence(arr, key, 0));
    }
}
