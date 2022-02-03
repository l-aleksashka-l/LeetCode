import java.util.Scanner;

public class SolutionRecurcion {

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
        return Reduction(sum, sum, max)/Fact(min, min);
    }

    public static long Reduction(long sum, long sum2, long max){
        if(sum2>max+1)
            return Reduction(sum*(sum2-1), --sum2, max);
        return sum;
    }

    public static long Fact(long min, long min2){
        if(min2>1)
            return Fact(min * (min2 - 1), --min2);
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(horse(scanner.nextInt(),scanner.nextLong()));
        String[] arg = new String[0];
        main(arg);
    }
}
