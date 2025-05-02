import java.util.HashMap;
public class Sumsubarray {
    public int subarray(int nums[],int k){
        int count=0,sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int num:nums){
            sum+=num;
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
    public static void main(String args[]){
        Sumsubarray sub=new Sumsubarray();
        int nums[]={1,2,3};
        int k=3;
        int result=sub.subarray(nums,k);
        System.out.println(result);
    }
}
