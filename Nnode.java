class ListNode{
    int val;
    ListNode next;
    ListNode (int x){
        val=x;
        
    }
    ListNode(int x,ListNode next){
        val=x;
        this.next=next;
    }
}



public class Nnode {
 public ListNode node(ListNode head,int n){
   ListNode dummy=new ListNode(0,head);
   ListNode fast=dummy;
   ListNode slow=dummy;
   for(int i=0;i<n+1;i++){
    fast=fast.next;
   }
   while (fast!=null) {
    slow=slow.next;
    fast=fast.next;
   }
   slow.next=slow.next.next;
   return dummy.next;

    
 }   
 public static void main(String[] args) {
   Nnode no=new Nnode();
    ListNode head=new ListNode(1);
    head.next=new ListNode(2);
    head.next.next=new ListNode(3);
    head.next.next.next=new ListNode(4);
    head.next.next.next.next=new ListNode(5);
    int n=2;
    ListNode result=no.node(head, n);
    while(result!=null){
        System.out.println(result.val+" ");
        result=result.next;
    }
    
 }
}

    

