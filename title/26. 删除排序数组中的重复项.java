/**
 * 26. 删除排序数组中的重复项
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 */
 
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length==0){
            return 0;
        }
        int ans = 1;
        int val = nums[0];
        int index = 1;
        for(int i=1; i<nums.length; i++){
            if(val != nums[i]){
               nums[index] = nums[i];
               index++;
               ans++;
            }
            val = nums[i];
        }
        return ans;
    }
}
