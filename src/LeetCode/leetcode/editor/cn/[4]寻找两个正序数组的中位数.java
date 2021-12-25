package LeetCode.leetcode.editor.cn;//给定两个大小为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的中位数。
//
// 进阶：你能设计一个时间复杂度为 O(log (m+n)) 的算法解决此问题吗？ 
//
// 
//
// 示例 1： 
//
// 输入：nums1 = [1,3], nums2 = [2]
//输出：2.00000
//解释：合并数组 = [1,2,3] ，中位数 2
// 
//
// 示例 2： 
//
// 输入：nums1 = [1,2], nums2 = [3,4]
//输出：2.50000
//解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
// 
//
// 示例 3： 
//
// 输入：nums1 = [0,0], nums2 = [0,0]
//输出：0.00000
// 
//
// 示例 4： 
//
// 输入：nums1 = [], nums2 = [1]
//输出：1.00000
// 
//
// 示例 5： 
//
// 输入：nums1 = [2], nums2 = []
//输出：2.00000
// 
//
// 
//
// 提示： 
//
// 
// nums1.length == m 
// nums2.length == n 
// 0 <= m <= 1000 
// 0 <= n <= 1000 
// 1 <= m + n <= 2000 
// -106 <= nums1[i], nums2[i] <= 106 
// 
// Related Topics 数组 二分查找 分治算法 
// 👍 3449 👎 0


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solutionds {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        int a = nums1.length;
//        int b = nums2.length;
//        int[] nums = new int[a + b];
//        int i = 0, j = 0, index = 0;
//        while (i == a || j == b) {
//            if (nums1[i] > nums2[j]) {
//                nums[index] = nums2[j];
//                j++;
//                index++;
//            } else {
//                nums[index] = nums1[i];
//                i++;
//                index++;
//            }
//        }
//        while (b!=j){
//            nums[index] = nums2[j++];
//        }
//        while (a!=i){
//            nums[index] = nums1[i++];
//        }
//        int length = nums.length;
//        double agv;
//        if (length%2==0){
//            agv = (nums[length / 2] + nums[length / 2 + 1]) / 2;
//        }else{
//            agv = nums[length / 2];
//        }
//        return agv;


        int i1 = nums1.length;
        int i2 = nums2.length;
        int[] ints = new int[i1 + i2];
        for (int i  = 0 ; i < i1;i++)
            ints[i] = nums1[i];
        for (int i = i1; i < i1+i2;i++)
            ints[i] = nums2[i-i1];
        Arrays.sort(ints);
        for (int i = 0 ; i < ints.length;i++)
            System.out.println(ints[i]);
        int length = ints.length;
        double agv;
        if (length%2==0){
            agv = (double) (ints[length / 2] + ints[length / 2 - 1]) / 2;
            System.out.println(ints[length / 2]+"  "+ints[length / 2 - 1]);
        }else
            agv = ints[length / 2];
        return agv;
    }
}
//leetcode submit region end(Prohibit modification and deletion)