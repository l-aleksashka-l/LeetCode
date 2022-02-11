import java.util.*;

class Solution1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N,K,M ;
        N=scanner.nextInt();
        K=scanner.nextInt();
        M=scanner.nextInt();
        System.out.println(N/K/M+N/K%M+N%K);
    }
}