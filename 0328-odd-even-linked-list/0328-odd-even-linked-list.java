class Solution {
    public ListNode oddEvenList(ListNode head) {


        if(head==null || head.next==null){
            return head;
        }
        ListNode t1=head;
        ListNode t2=head.next;
        ListNode t3=t2;
        while(t2!=null && t2.next!=null){
            t1.next=t2.next;
            t1=t1.next;
            t2.next=t1.next;
            t2=t2.next;
        }
        t1.next=t3;
        return head;
    }
}