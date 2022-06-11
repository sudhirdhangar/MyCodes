import java.util.* ;
import java.io.*; 
/****************************************************************

       Following is the class structure of the Node class:

       class Node {
	int data;
	Node next;
	Node child;

	public Node(int data) {
		this.data = data;
		this.next = null;
		this.child = null;
	}
}

*****************************************************************/
public class Solution {
    public static Node merge(Node a,Node b)
    {
        Node res=new Node(0);
        Node temp=res;
        while(a!=null && b!=null)
        {
            if(a.data<b.data)
            {
                temp.child=a;
                a=a.child;
                temp=temp.child;
                
            }
            else {
                temp.child=b;
                b=b.child;
                temp=temp.child;
            }
        }
        if(a!=null)
            temp.child=a;
        else if(b!=null)
            temp.child=b;
        return res.child;
    }
	public static Node flattenLinkedList(Node start) {
		 //Write your code here
        if(start==null || start.next==null)
            return start;
        start.next=flattenLinkedList(start.next);
        start=merge(start,start.next);
        return start;
	}
}

