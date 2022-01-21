import java.util.Arrays;

class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size = nums1.length + nums2.length;
        double[] nums3 = new double[size];
        int IterNum1 = 0, IterNum2 = 0;

        if(nums1.length==0 || nums2.length==0){
            if(nums1.length==0 && nums2.length==0) return 0;
            if(nums1.length==0){if(size%2==1){return nums2[size/2];}else{double[] doubles2 = Arrays.stream(nums2).asDoubleStream().toArray(); return (doubles2[size/2] + doubles2[size/2-1])/2;}}
            if(nums2.length==0){if(size%2==1){return nums1[size/2];}else{double[] doubles1 = Arrays.stream(nums1).asDoubleStream().toArray(); return (doubles1[size/2] + doubles1[size/2-1])/2;}}
        }

        for(int i = 0; i <= size/2; i++){
            if(nums1[IterNum1]<=nums2[IterNum2]){
                nums3[i]=nums1[IterNum1];
                if(IterNum1<nums1.length-1)IterNum1++;
                else nums1[IterNum1] = Integer.MAX_VALUE;
            }else{
                nums3[i]=nums2[IterNum2];
                if(IterNum2<nums2.length-1)IterNum2++;
                else nums2[IterNum2] = Integer.MAX_VALUE;
            }
        }
        if(size%2==1){
            return nums3[size/2];
        }else{
            return (nums3[size/2] + nums3[size/2-1])/2;
        }

    }

    public static void main(String[] args) {
        int[] num1 = new int[]{100001};
        int[] num2 = new int[]{100000};
        System.out.println(findMedianSortedArrays(num1, num2));
    }
}