/**
 * 38. 外观数列
 * https://leetcode-cn.com/problems/count-and-say/
 */

class Solution {
    public String countAndSay(int n) {
        StringBuffer br = new StringBuffer();
        String result = "1";
        for (int i = 0; i < n-1; i++) {
            result = readString(result, 0);
        }
        return result;
    }
    public String readString(String res, int index) {
        int n = res.length();
        int count = 1;
        StringBuffer br = new StringBuffer();
        for (int i = index; i < n; i++) {
            if (i + 1 < n && res.charAt(i + 1) == res.charAt(i)) {
                count++;
            } else {
                br.append("" + count + res.charAt(i));
                count = 1;
            }
        }
        return br.toString();
    }
}
