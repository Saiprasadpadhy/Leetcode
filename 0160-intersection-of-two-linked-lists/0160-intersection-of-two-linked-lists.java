public class Solution {
    public ListNode getIntersectionNode(ListNode a, ListNode b) {
        ListNode t1 = a;
        ListNode t2 = b;

        if(a == null || b == null) return null;
        
        while(t1 != t2){
            t1 = t1.next;
            t2 = t2.next;
            if(t1 == t2) return t1;

            if(t1 == null) t1=b;
            if(t2 == null) t2=a;
        }
        return t1;
    }
}
