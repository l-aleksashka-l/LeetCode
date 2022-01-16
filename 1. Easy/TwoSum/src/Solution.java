import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int i = 0;
        Map<Integer, Integer> hashMap = new HashMap<>();
        while(i < nums.length){
            hashMap.put(nums[i], i);
            i++;
        }
        i = 0;
        while (i<nums.length){
            int complement = target - nums[i];
            if(hashMap.containsKey(complement) && hashMap.get(complement) != i){
                return new int[]{i, hashMap.get(complement)};
            }
            i++;
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{0, 1, 3, 4, 56}, 56)));
    }
}