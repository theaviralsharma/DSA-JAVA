public class MaxSubarrayProduct {

        public static int maxProduct(int[] nums) {
            int maxProduct = nums[0];
            int currProduct = 1;
        
            // Traverse from the left
            for (int i = 0; i < nums.length; i++) {
                currProduct *= nums[i];
                maxProduct = Math.max(maxProduct, currProduct);
                if (currProduct == 0) {
                    currProduct = 1;
                }
            }
        
            currProduct = 1;
        
            // Traverse from the right
            for (int i = nums.length - 1; i >= 0; i--) {
                currProduct *= nums[i];
                maxProduct = Math.max(maxProduct, currProduct);
                if (currProduct == 0) {
                    currProduct = 1;
                }
            }
        
            return maxProduct;
        }

    public static void main(String[] args) {
        int nums[] = { 2, 3, -2, 4 };
        System.out.println(maxProduct(nums)); 
    }
}
