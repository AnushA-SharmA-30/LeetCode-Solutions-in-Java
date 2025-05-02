 class ListNode{
    int val;
    ListNode next;
    ListNode (int x){
        val=x;
        
    }
}



public class Middle {
 public ListNode middle(ListNode head){
   

    
    ListNode slow=head;
    ListNode fast=head;
    
    while(fast==null ||fast.next==null) {
    slow=slow.next;
    fast=fast.next.next;
    }
    return slow;
 }   
 public static void main(String[] args) {
    Middle mid=new Middle();
    ListNode head=new ListNode(1);
    head.next=new ListNode(2);
    head.next.next=new ListNode(3);
    head.next.next=new ListNode(4);
    head.next.next.next=new ListNode(5);
    ListNode result=mid.middle(head);
    while(result!=null){
        System.out.println(result.val+" ");
        
        result=result.next;
    }
    
 }
}

    

