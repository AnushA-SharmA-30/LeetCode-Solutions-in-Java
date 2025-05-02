class Solution { 
    public List<List<Integer>> threeSum(int[] nums) { 
        List<List<Integer>> res= new ArrayList<>(); 
        Arrays.sort(nums); 
        for(int i=0;i<nums.length-2;i++){ 
            if(i>0 && nums[i]==nums[i-1]){ 
                continue; 
            } 
            int left=i+1,right=nums.length-1; 
            while(left<right){ 
                int total=nums[i]+nums[left]+nums[right]; 
                if(total<0){ 
                    left++; 
                } 
                else if(total>0){ 
                    right--; 
                } 
                else{ 
                    res.add(Arrays.asList(nums[i],nums[left],nums[right])); 
                    while(left<right && nums[left]==nums[left+1]){ 
                        left++; 
                    } 
                    while(left<right && nums[right]==nums[right-1]){ 
                        right--; 
                    } 
                    left++; 
                    right--; 
                } 
 
            } 
        } 
        return res; 
    } 
} 
 
 public static void main(String[] args) { 
        Solution solution = new Solution(); 
        int[] nums = {-1, 0, 1, 2, -1, -4}; 
        System.out.println(solution.threeSum(nums)); // Output: [[-1, -1, 2], [-1, 0, 1]] 
    }