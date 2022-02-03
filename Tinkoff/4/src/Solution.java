import java.util.Scanner;

public class Solution {

    public static long horse(long m, long n){
        m--;n--;
        if((m+n)%3==0 &&( 2*m>=n || 2*n>=m )&& n > 0 && m > 0) {
            if (m == n) return Combinatorics(m/3,n/3, (n+m)/3);
            else if (m>=n){if(m==2*n)return 1; else return Combinatorics((2*n - m)/3,(m-n) + (2*n - m)/3,(m-n) + 2*(2*n - m)/3 );}
            else{if(n==2*m)return 1; else return Combinatorics((2*m - n)/3,(n-m) + (2*m - n)/3,(n-m) + 2*(2*m - n)/3 );}
        }else if(n==0 && m==0){return 1;}
        else{return 0;}
    }

    public static long Combinatorics(long min, long max, long sum){
        long a = sum;
        long b = 2;
        while(a > max+1){
            a--;
            sum*=a;
            if(b <= min){
                sum/=b;
                b++;
            }
        }
        return sum;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(horse(scanner.nextLong(),scanner.nextLong()));
        String[] arg = new String[0];
        main(arg);
    }
}
