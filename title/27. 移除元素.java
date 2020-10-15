/*
* 27. 移除元素
* https://leetcode-cn.com/problems/remove-element/
* */

class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length==0) return 0;
        int j=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == val){
                while (nums[i] == val && i<nums.length-1){
                    j++;
                    i++;
                }
            }
            if(i<nums.length){
                nums[i-j] = nums[i];
            }
        }
        if(nums[nums.length-1]==val) j++;
        return nums.length-j;
    }
}
