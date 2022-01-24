public class Solution {
    public static int reverse(int x) {
        int answer = 0;
        while(x!=0){
            int last = x%10;
            x/=10;
            if(answer>Integer.MAX_VALUE/10 || (answer==Integer.MAX_VALUE/10 && last>7)||answer<Integer.MIN_VALUE/10 || (answer==Integer.MIN_VALUE/10 && last<-8))return 0;
            answer = answer*10 + last;
        }
        return answer;
    }

    public static void main(String[] args) {

        System.out.println(reverse(1534236469));
    }
}
