public class Solution {
    public static boolean isPalindrome(int x){
        if(x<0 || x%10==0 && x!=0) return false;
        int  answer = 0;
        while (x>answer){
            answer = answer*10 + x%10;
            x/=10;
        }
        return x==answer || x==answer/10 ;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(214757412));
    }
}
