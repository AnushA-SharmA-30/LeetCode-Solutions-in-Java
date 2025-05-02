import java.util.Arrays;

public class Productself {
    public int[] prod(int[]nums){
        int n=nums.length;
        int[]result=new int[n];
    int prefix=1;
            for(int i=0;i<n;i++){
                result[i]=prefix;
                prefix*=nums[i];
            }
            int suffix=1;
            for(int i=n-1;i>=0;i--){
                result[i]*=suffix;
                suffix*=nums[i];
            }
            return result;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4};
        Productself sel=new Productself();
        System.out.println(Arrays.toString(sel.prod(nums)));
    }
}
