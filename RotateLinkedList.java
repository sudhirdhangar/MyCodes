import java.util.* ;
import java.io.*; 
/***********************************************
    Following is the class structure of the Node class:

    class Node {
        int data;
        Node next;

        Node(int x) {
            this.data = x;
            this.next = null;
        }
    }

************************************************/

public class Solution {
    public static Node rotate(Node head, int k) {
        // Write your code here.
       if(head==null || head.next==null || k==0)
           return head;
        int len=1;
        Node curr=head;
        while(curr.next!=null)
        {
           len++;
            curr=curr.next;
        }
        curr.next=head;
        k=k%len;
        k=len-k;
        while(k--!=0)
        {
                curr=curr.next;
        }
        head=curr.next;
        curr.next=null;
        return head;
    }
}
