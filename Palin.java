public class Palin {
    public boolean ispalin(String s){
        int left=0,right=s.length()-1;
        while(left<right){
            
            while(left<right &&  !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s=" A man, a plan, a canal: Panama";
        Palin pal=new Palin();
        System.out.println(pal.ispalin(s));
    }
}
