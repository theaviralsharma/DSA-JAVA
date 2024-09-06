import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class AssignmentQuestions {

    public static boolean checkDuplicates(int nums[]){
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static int binarySearch(int nums[], int target){
        int start = 0;
        int end = nums.length - 1;

        while (start<=end) {
            int mid = (start+end)/2;

            if(nums[mid]==target){
                return mid;
            }

            if(nums[start]<=nums[mid]){
                if(nums[start]<=target && target<nums[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(nums[mid]<target && target<=nums[end]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static int buySellStocks(int nums[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<nums.length; i++){
            if(buyPrice<nums[i]){
                int profit = nums[i] - buyPrice;
                 maxProfit = Math.max(maxProfit, profit);
            } else{
                buyPrice = nums[i];
            }
        }
        return maxProfit;
    }

    public static int trappedRainwater(int nums[]){
        int leftMax[] = new int[nums.length];
            leftMax[0] = nums[0];
            for(int i=1; i<nums.length; i++){
                leftMax[i] = Math.max(nums[i], leftMax[i-1]);
            }

        int rightMax[] = new int[nums.length];
            rightMax[nums.length-1] = nums[nums.length-1];
            for(int i=nums.length-2; i>=0; i--){
                rightMax[i] = Math.max(nums[i], rightMax[i+1]);
            }

        int trappedWater = 0;
        for(int i=0; i<nums.length; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater +=  waterLevel - nums[i];
        }
        return trappedWater;
    }

    public static List<List<Integer>> threeSum(int nums[],int target){
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    if(nums[i]+nums[j]+nums[k]==target){
                        List<Integer> triplet = new ArrayList<Integer>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                        Collections.sort(triplet);
                        result.add(triplet);
                    }
                }
            }
        }
        result = new ArrayList<List<Integer>>(new LinkedHashSet<List<Integer>>(result));
        return result;
    }

    public static void main(String[] args) {
        int nums[] = { -1, 0, 1, 2, -1, -4};
        int target = 0;
        System.out.println(checkDuplicates(nums));
        System.out.println(binarySearch(nums,target));
        System.out.println(buySellStocks(nums));
        System.out.println(trappedRainwater(nums));
        System.out.println(threeSum(nums,target));
    }    
}
