import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

    class LinkedListNode {
        int data;
        LinkedListNode next;
        
        public LinkedListNode(int data) {
            this.data = data;
        }
    }

*****************************************************************/


public class Solution {
    static LinkedListNode addTwoNumbers(LinkedListNode head1, LinkedListNode head2) {
        LinkedListNode start=new LinkedListNode(0);
        int carry=0,sum=0;
        LinkedListNode temp=start;
        while(head1!=null || head2!=null || carry!=0)
        {
            sum=0;
            if(head1!=null)
            {
                sum+=head1.data;
                head1=head1.next;
            }
            if(head2!=null)
            {
                sum+=head2.data;
                head2=head2.next;
            }
            sum+=carry;
            carry=sum/10;
            temp.next=new LinkedListNode(sum%10);
            temp=temp.next;
        }
        return start.next;
        // Write your code here.
    }
}
