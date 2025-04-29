import java.util.Stack;

public class LargestRectangleHistogram {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i <= n; i++) {
            // Use 0 as a sentinel value for the last iteration
            int h = (i == n) ? 0 : heights[i];
            while (!stack.isEmpty() && h < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }

        return maxArea;
    }

    // Main function to test the solution
    public static void main(String[] args) {
        LargestRectangleHistogram solution = new LargestRectangleHistogram();

        int[] heights1 = {2, 1, 5, 6, 2, 3};
        System.out.println("Largest rectangle area in heights1: " + solution.largestRectangleArea(heights1));

        int[] heights2 = {2, 4};
        System.out.println("Largest rectangle area in heights2: " + solution.largestRectangleArea(heights2));
    }
}
