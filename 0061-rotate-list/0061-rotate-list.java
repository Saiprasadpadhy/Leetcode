/**
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
    public ListNode rotateRight(ListNode head, int k) {
         if(head == null || head.next == null || k == 0){
            return head;
        }

         ListNode temp = head;
         int c = 1;
         while(temp.next != null){
            temp = temp.next;
            c++;
        }
        k = k % c;
        if(k == 0){
            return head;
        }
        temp.next=head;
        ListNode temp2 = head;
        for(int i=1; i < c-k; i++){
            temp2 = temp2.next;
        }
        ListNode temp3 =temp2.next;
        temp2.next = null;
        return temp3;
    }
}