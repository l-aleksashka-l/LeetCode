public class Solution {
    static int counter = 0;
    static int chet_nechet = 0;

    public static int P(int a, int b, int c){
        if(a==b&&b==c)return 1;
        else if(a==b||a==c||b==c)return 3;
        else return 6;
    }
    public static int X(int sum){
        if(sum )
    }

    public static void main(String[] args) {
        int N = 4;
        int a1=N, b1=0, c1 = 0 , b2, c2, c3;
        while (a1>N/3){
            int sum = 3*N - a1 - 2*b1 - 2*c1;
            c3 = N-c1;
            c2 = N - c1 - c3;
            while(c3 > c2) {
                c2 = N - c1 - c3;
                b2 = N - Math.max(b1, c2);
                while(b2+c2>a1){
                    counter+=;

                    b2--;
                }
                c3--;

            }
            chet_nechet++;
            if(chet_nechet%2==1 && chet_nechet>=2){b1--;c1++;}
            else{a1--;b1++;}
        }
    }
}
