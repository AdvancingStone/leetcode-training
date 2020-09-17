/**
 * 41. 缺失的第一个正数
 * https://leetcode-cn.com/problems/first-missing-positive/
 */

class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]<=0) nums[i] = n+1;
        }
        for(int i=0; i<n; i++){
            int num = Math.abs(nums[i]);
            if(num<=n){
                nums[num - 1] = -Math.abs(nums[num - 1]);
            }
        }
        for(int i=0; i<n; i++){
            if(nums[i] > 0){
                return i+1;
            }
        }
        return n+1;
    }
}

class Solution2 {
    public int firstMissingPositive(int[] nums) {
        int len = nums.length;
        for(int i=0; i<len; i++){
            int num = nums[i];
            while (num>0 && num<=len && num!=nums[num-1]){
                int tmp = nums[i];
                nums[i] = nums[num-1];
                nums[tmp-1] = tmp;
                num = nums[i];
            }
        }
        for(int i=0; i<len; i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        return len+1;
    }
}
