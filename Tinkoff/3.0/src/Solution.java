import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(((N*N+3*N+3)*(N*N+3*N+3)-1)/8);
    }
}
