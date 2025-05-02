class ListNode{
    int val;
    ListNode next;
    ListNode (int x){
        val=x;
        
    }
}
public class Rev{
    public ListNode rever(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
    public static void main(String[] args) {
        Rev r=new Rev();
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        ListNode result=r.rever(head);
        while(result!=null){
            System.out.println(result.val+" ");
            result=result.next;
        }
        
     }
}