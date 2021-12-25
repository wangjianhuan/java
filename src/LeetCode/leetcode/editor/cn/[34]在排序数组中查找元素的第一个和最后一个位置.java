//给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。 
//
// 如果数组中不存在目标值 target，返回 [-1, -1]。 
//
// 进阶： 
//
// 
// 你可以设计并实现时间复杂度为 O(log n) 的算法解决此问题吗？ 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [5,7,7,8,8,10], target = 8
//输出：[3,4] 
//
// 示例 2： 
//
// 
//输入：nums = [5,7,7,8,8,10], target = 6
//输出：[-1,-1] 
//
// 示例 3： 
//
// 
//输入：nums = [], target = 0
//输出：[-1,-1] 
//
// 
//
// 提示： 
//
// 
// 0 <= nums.length <= 105 
// -109 <= nums[i] <= 109 
// nums 是一个非递减数组 
// -109 <= target <= 109 
// 
// Related Topics 数组 二分查找 
// 👍 763 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solutiondsa {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0)
            return new int[]{-1, -1};
        int one = MinValue(nums, target);
        if (one == -1)
            return new int[]{-1, -1};
        int two = MaxValue(nums, target);
        return new int[]{one, two};
    }

    public static int MinValue(int[] nums, int target) {
        int left = 0;
        

        return -1;
    }

    public static int MaxValue(int[] nums, int target) {
        return -1;
    }


}
//leetcode submit region end(Prohibit modification and deletion)
