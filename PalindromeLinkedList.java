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
     public static ListNode reverse(ListNode head)
    {
        ListNode prev=null,curr=head,next=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        return head;
    }
    public boolean isPalindrome(ListNode head) {
     
         if(head==null || head.next==null)
            return true;
        ListNode slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        
        
        slow.next=reverse(slow.next);
        slow=slow.next;
        ListNode dummy=head;
        while(slow!=null)
        {
            if(dummy.val!=slow.val)
                return false;
            dummy=dummy.next;
            slow=slow.next;
        }
        return true;
    }
}
