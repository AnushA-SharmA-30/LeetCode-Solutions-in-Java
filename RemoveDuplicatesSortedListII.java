class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class RemoveDuplicatesSortedListII {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        while (head != null) {
            // Check for duplicates
            if (head.next != null && head.val == head.next.val) {
                // Skip all nodes with the current value
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                prev.next = head.next; // Remove duplicates
            } else {
                prev = prev.next; // Move prev pointer
            }
            head = head.next; // Move head pointer
        }
        return dummy.next;
    }

    // Helper function to print the list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main function to test the solution
    public static void main(String[] args) {
        RemoveDuplicatesSortedListII solution = new RemoveDuplicatesSortedListII();

        // Example: 1 -> 2 -> 3 -> 3 -> 4 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);

        System.out.println("Original list:");
        printList(head);

        ListNode result = solution.deleteDuplicates(head);

        System.out.println("List after removing duplicates:");
        printList(result);
    }
}
