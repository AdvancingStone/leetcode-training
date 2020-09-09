/**
 * 238. 除自身以外数组的乘积
 * https://leetcode-cn.com/problems/product-of-array-except-self/
*/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        for(int i=0, j=1; i<nums.length; i++){
            result[i] = j;
            j *= nums[i];
        }
        for(int i=nums.length-1, j=1; i>=0; i--){
            result[i] *= j;
            j *= nums[i];
        }
        return result;
    }
}
