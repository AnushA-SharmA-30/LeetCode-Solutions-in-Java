public class FindDuplicateNumber {
    public int findDuplicate(int[] nums) {
        // Phase 1: Detect intersection point
        int slow = nums[0];
        int fast = nums[0];
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Phase 2: Find entrance to the cycle
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return fast;
    }

    // Main function to test the solution
    public static void main(String[] args) {
        FindDuplicateNumber solution = new FindDuplicateNumber();

        int[] nums = {1, 3, 4, 2, 2};
        int duplicate = solution.findDuplicate(nums);
        System.out.println("The duplicate number is: " + duplicate);
    }
}
