public class Maxavg {
    public double maxavg(int nums[],int k){
        double sum=0;
        for(int i=0;i<k;i++){
            sum=sum+nums[i];
        }
        double max=sum;
        for(int i=k;i<nums.length;i++){
            sum=sum-nums[i-k]+nums[i];
            max=Math.max(max, sum);
        }
        return max/k;
    }
    public static void main(String[] args) {
        Maxavg max=new Maxavg();
        int nums[]={1,12,-5,-6,50,3};
        int k=4;
        double result=max.maxavg(nums, k);
        System.out.println(result);
    }
}
