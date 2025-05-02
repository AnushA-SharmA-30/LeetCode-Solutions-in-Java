import java.util.Arrays;

public class Twosum {
    public int[] twosum(int[]num,int target){
        int left=0,right=num.length-1;
        while (left<right) {
            int sum=num[left]+num[right];
            if (sum==target) {
                return new int[]{left+1,right+1};
                
            }
            else if (sum<target) {
                left++;
            }
            else{
                right--;
            }
            
            
        }
        return new int[]{-1,-1};

    }
    public static void main(String[] args) {
        Twosum sol=new Twosum();
        int nums[]={2,3,4};
        int target=6;
        int[] result=sol.twosum(nums, target);
                System.out.println(Arrays.toString(result));
    }
}
