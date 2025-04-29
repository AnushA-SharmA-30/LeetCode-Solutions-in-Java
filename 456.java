import java.util.Stack;

public class Pattern132 {
    public boolean find132pattern(int[] nums) {
        if (nums == null || nums.length < 3) return false;

        Stack<Integer> stack = new Stack<>();
        int ak = Integer.MIN_VALUE; // This will represent nums[k]

        // Traverse the array from right to left
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < ak) {
                return true; // Found a valid 132 pattern
            }
            while (!stack.isEmpty() && stack.peek() < nums[i]) {
                ak = stack.pop(); // Update ak to the last element popped
            }
            stack.push(nums[i]); // Push current element onto the stack
        }
        return false;
    }

    // Main function to test the solution
    public static void main(String[] args) {
        Pattern132 solution = new Pattern132();

        int[] nums1 = {1, 2, 3, 4};
        System.out.println("Does nums1 have a 132 pattern? " + solution.find132pattern(nums1));

        int[] nums2 = {3, 1, 4, 2};
        System.out.println("Does nums2 have a 132 pattern? " + solution.find132pattern(nums2));

        int[] nums3 = {-1, 3, 2, 0};
        System.out.println("Does nums3 have a 132 pattern? " + solution.find132pattern(nums3));
    }
}
