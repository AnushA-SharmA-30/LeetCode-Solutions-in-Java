import java.util.*;
public class Greater {

    public int[] great(int nums1[],int nums2[]){
        Stack<Integer> stack=new Stack<>();
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i=nums2.length-1;i>=0;i--){
            while (!stack.isEmpty() && stack.peek()<=nums2[i]) {
                stack.pop();
                
            }
            map.put(nums2[i], stack.isEmpty()?-1:stack.peek());
            stack.push(nums2[i]);
        }
        int []res=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            res[i]=map.get(nums1[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int nums1[]={4,1,2};
        int nums2[]={1,3,4,2};
        Greater g=new Greater();
        System.out.println(Arrays.toString(g.great(nums1, nums2)));
    }
}