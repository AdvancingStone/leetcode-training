/**
 * 39. 组合总和
 * https://leetcode-cn.com/problems/combination-sum/
 */

class Solution {
    List<List<Integer>> result = new ArrayList<>(new ArrayList<>());
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack(new ArrayList<Integer>(), candidates, target, 0);
        return result;
    }
    public void backtrack(List<Integer> list, int[] candidates, int target, int index){
        if(target==0){
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i=index; i<candidates.length; i++){
            if(candidates[i]>target){
                continue;
            }
            List<Integer> tmp = new ArrayList<>(list);
            tmp.add(candidates[i]);
            backtrack(tmp, candidates, target-candidates[i], i);
        }
    }
}
