public class MaxSubarraySum {
    public static void burteForceMaxSubarraySum(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                currSum = 0;
                for(int k=i; k<=j; k++){
                    currSum += arr[k]; 
                    }
                    System.out.print(currSum+" ");
                    if(maxSum<currSum){
                    maxSum = currSum;
                }
            }
            System.out.println();
        }
        System.out.println("Max Sum is "+ maxSum);
    }

    public static void prefixSubarraySum(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];

        for(int i=1; i<arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }


        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                currSum = i==0 ? prefix[j] : prefix[j] - prefix[i-1];

                if(maxSum<currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum is "+maxSum);
    }

    public static void kadanesAlgorithm(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            currSum += arr[i];
            maxSum = Math.max(currSum, maxSum);
            if(currSum<0){
                currSum = 0;
            }  
        }
        System.out.println("Max sum is "+maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { -2, -3, -4, -1, -2, -1, -5, -3 };
        burteForceMaxSubarraySum(arr);
        System.out.println();
        prefixSubarraySum(arr);
        System.out.println();
        kadanesAlgorithm(arr);
    }    
}
