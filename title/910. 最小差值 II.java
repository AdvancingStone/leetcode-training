/**
 * 910. 最小差值 II
 * https://leetcode-cn.com/problems/smallest-range-ii/
 */

class Solution {
    public int smallestRangeII(int[] A, int K) {
        Arrays.sort(A);
        int result = A[A.length-1]-A[0];
        for(int i=0; i<A.length-1; i++){
            int max = Math.max(A[A.length-1]-K, A[i]+K);
            int min = Math.min(A[i+1]-K, A[0]+K);
            result = Math.min(max-min, result);
        }
        return result;
    }
}
