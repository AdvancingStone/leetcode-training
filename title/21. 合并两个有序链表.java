/**
 * 21. 合并两个有序链表
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode node = null;
        if(l1.val<l2.val){
            node = l1;
            l1 = l1.next;
            node.next = mergeTwoLists(l1, l2);
        } else{
            node = l2;
            l2 = l2.next;
            node.next = mergeTwoLists(l1, l2);
        }
        return node;
    }
}
