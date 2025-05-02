
class ListNode{
    int val;
    ListNode next;
    ListNode (int x){
        val=x;
        
    }
}



public class cycle {
 public boolean hascycle(ListNode head){
    if(head==null ||head.next==null){
        return false;

    }
    ListNode slow=head;
    ListNode fast=head.next;
    while(slow!=fast){
        if(fast==null ||fast.next==null) return false;
    slow=slow.next;
    fast=fast.next.next;
    }
    return true;
 }   
 public static void main(String[] args) {
    cycle cy=new cycle();
    ListNode head=new ListNode(3);
    head.next=new ListNode(2);
    head.next.next=new ListNode(0);
    head.next.next=new ListNode(-4);
    head.next.next=head.next;
    System.out.println(cy.hascycle(head));
 }
}
