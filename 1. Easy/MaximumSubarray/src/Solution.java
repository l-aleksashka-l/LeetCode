public class Solution {
    public static int maxSubArray(int[] nums) {
        int sum = Integer.MIN_VALUE;
        int subSum = 0;
        for(int i = 0; i < nums.length; i++){
            subSum+=nums[i];
            if(subSum > sum) sum = subSum;
            if(subSum < 0) subSum = 0;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {-2,-1,-3,-4,-1,2,-1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
