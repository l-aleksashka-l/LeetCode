import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int N = 0, K = 0, M = 0, counter = 0, k = 0, kOst = 0, m = 0, mOst = 0;
        Scanner scanner = new Scanner(System.in);
        N = Integer.parseInt(scanner.next());
        K = Integer.parseInt(scanner.next());
        M = Integer.parseInt(scanner.next());
        m = K/M;
        mOst = K%M;
        while(N>=K){
            k = N/K;
            kOst = N%K;
            counter += (m*k);
            N = kOst + k*mOst;
        }
        System.out.println(counter);
    }
}
