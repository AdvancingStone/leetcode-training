/**
 * 从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。
 * https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-lcof/
 
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    Queue<TreeNode> queue = new LinkedList<>();
    Queue<Integer> result = new LinkedList<>();
    public int[] levelOrder(TreeNode root) {
        if(root!=null){
            queue.add(root);
        }
        traverse();
        int[] res = new int[result.size()];
        for(int i=0; i<res.length; i++){
            res[i] = result.poll();
        }
        return res;
    }
    public void traverse(){
        while(!queue.isEmpty()){
            TreeNode note = queue.poll();
            result.add(note.val);
            if(note.left!=null){
                queue.add(note.left);
            }
            if(note.right!=null){
                queue.add(note.right);
            }
        }
    }
}
