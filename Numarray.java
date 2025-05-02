public class Numarray{
    private int []prefixSum;
    public Numarray(int[]nums){
        prefixSum=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            prefixSum[i+1]=prefixSum[i]+nums[i];
        }
    }
    public int sumArray(int left,int right){
        return prefixSum[right+1]-prefixSum[left];
    }
    public static void main(String[] args) {
        int []nums={-2,0,3,-5,2,-1};
        Numarray numarray=new Numarray(nums);
        System.out.println(numarray.sumArray(0, 2));
        System.out.println(numarray.sumArray(2, 5));
        System.out.println(numarray.sumArray(0, 5));
    }
}