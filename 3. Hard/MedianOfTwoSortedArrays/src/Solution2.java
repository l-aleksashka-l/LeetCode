import java.util.Arrays;

public class Solution2 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size = nums1.length + nums2.length;
        double[] nums3 = new double[size];
        int IterNum1 = 0, IterNum2 = 0, Iter = 0;

        if (nums1.length == 0 || nums2.length == 0) {
            if (nums1.length == 0 && nums2.length == 0) return 0;
            if (nums1.length == 0) {
                if (size % 2 == 1) {
                    return nums2[size / 2];
                } else {
                    double[] doubles2 = Arrays.stream(nums2).asDoubleStream().toArray();
                    return (doubles2[size / 2] + doubles2[size / 2 - 1]) / 2;
                }
            }
            if (nums2.length == 0) {
                if (size % 2 == 1) {
                    return nums1[size / 2];
                } else {
                    double[] doubles1 = Arrays.stream(nums1).asDoubleStream().toArray();
                    return (doubles1[size / 2] + doubles1[size / 2 - 1]) / 2;
                }
            }
        }


        while (IterNum1 <= nums1.length - 1 && IterNum2 <= nums2.length - 1 && Iter <= size / 2) {
            if (nums1[IterNum1] <= nums2[IterNum2]) {
                nums3[Iter] = nums1[IterNum1];
                IterNum1++;
            } else {
                nums3[Iter] = nums2[IterNum2];
                IterNum2++;
            }
            Iter++;
        }
        if (IterNum1 <= nums1.length - 1) {
           while(Iter <= size/2){
               nums3[Iter] = nums1[IterNum1];
               IterNum1++;
               Iter++;
           }
        }else{
            while(Iter <= size/2){
                nums3[Iter] = nums2[IterNum2];
                IterNum2++;
                Iter++;
            }
        }
        if (size % 2 == 1) {
            return nums3[size / 2];
        } else {
            return (nums3[size / 2] + nums3[size / 2 - 1]) / 2;
        }

    }

    public static void main(String[] args) {
        int[] num1 = new int[]{100001};
        int[] num2 = new int[]{100000};
        System.out.println(findMedianSortedArrays(num1, num2));
    }
}
