/**
 * 38. 外观数列
 * https://leetcode-cn.com/problems/count-and-say/
 */

class Solution {
    public String countAndSay(int n) {
        String result = "1";
        for (int i = 0; i < n-1; i++) {
            result = readString(result);
        }
        return result;
    }
    public String readString(String res) {
        int n = res.length();
        int count = 1;
        StringBuilder br = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i + 1 < n && res.charAt(i + 1) == res.charAt(i)) {
                count++;
            } else {
                br.append(count).append(res.charAt(i));
                count = 1;
            }
        }
        return br.toString();
    }
}
