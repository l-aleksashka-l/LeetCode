import java.math.BigInteger;
import java.util.*;

public class Solution {

    public static long findX(int n, ArrayList<Long> A){
        long x = 0;
        long temp;
        while(n>0){
            temp = (long) Math.ceil(Math.sqrt(x + A.get(n-1)));
            x = temp;
            n--;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        ArrayList<Long> A = new ArrayList<>();
        while (sc.hasNext()){
            A.add(Long.valueOf(sc.nextLong()));
            i++;
            if(i==n) break;
        }
        Collections.sort(A);

        System.out.println(A);
        System.out.println(findX(n, A));

    }
}
