package com.alpha.binary_search;

import com.alpha.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * 144. 二叉树的前序遍历
 * https://leetcode-cn.com/problems/binary-tree-preorder-traversal/
 */
public class LK144 {
    //递归
    public List<Integer> preorderTraversalRecursion(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        list.add(root.val);
        if(root.left!=null){
            List<Integer> leftList = preorderTraversalRecursion(root.left);
            list.addAll(leftList);
        }
        if(root.right!=null){
            List<Integer> rightList = preorderTraversalRecursion(root.right);
            list.addAll(rightList);
        }
        return list;
    }

    //迭代
    public List<Integer> preorderTraversalIteration(TreeNode root) {
        return null;
    }
    public static void main(String[] args) {

    }
}
