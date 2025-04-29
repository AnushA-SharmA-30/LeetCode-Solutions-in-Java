class Solution { 
    public int maxArea(int[] height) { 
        int left=0,right=height.length-1; 
        int maxWater=0; 
        while(left<right){ 
            int minHeight=Math.min(height[left],height[right]); 
            int width=right-left; 
            maxWater=Math.max(maxWater,minHeight*width); 
            if(height[left]<height[right]){ 
                left++; 
            } 
            else{ 
                right--; 
            } 
        } 
        return maxWater; 
    } 
} 
 public static void main(String[] args) { 
        Solution solution = new Solution(); 
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7}; 
} 
System.out.println(solution.maxArea(height)); // Output: 49 
} 