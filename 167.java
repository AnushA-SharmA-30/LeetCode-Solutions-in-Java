class Solution { 
public int[] twoSum(int[] numbers, int target) { 
int left=0,right=numbers.length-1; 
while(left<right){ 
int sum= numbers[left]+numbers[right]; 
if(sum==target){ 
return new int[]{left+1,right+1}; 
} 
else if(sum<target){ 
left++; 
} 
else{ 
right--; 
} 
} 
return new int[]{}; 
} 
} 
public static void main(String[] args) { 
Solution solution = new Solution(); 
int[] numbers = {2, 7, 11, 15}; 
int target = 9; 
System.out.println(Arrays.toString(solution.twoSum(numbers, target))); // Output: [1, 2] 
} }