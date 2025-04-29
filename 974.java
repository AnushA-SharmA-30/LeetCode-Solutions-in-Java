class Solution { 
    public int subarraysDivByK(int[] nums, int k) { 
        Map<Integer,Integer> remainderCount=new HashMap<>(); 
        remainderCount.put(0,1); 
        int count=0,prefixsum=0; 
        for(int num:nums){ 
            prefixsum+=num; 
            int remainder=((prefixsum % k)+k)%k; 
        count+= remainderCount.getOrDefault(remainder,0); 
        remainderCount.put(remainder,remainderCount.getOrDefault(remainder,0)+1); 
 
        } 
        return count; 
    } 
    
} 
 
    public static void main(String[] args) { 
        Solution solution = new Solution(); 
        int[] nums = {4, 5, 0, -2, -3, 1}; 
        int k = 5; 
        System.out.println(solution.subarraysDivByK(nums, k)); 
    }