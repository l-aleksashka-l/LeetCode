import java.util.Scanner;

public class Solution {

    public static void check(int A, int B, int n) {
        if ((A + B) % 2 == 0 && (A - B) >= 2 * n) {
            if (n != 0)
                System.out.println("YES");
            else if (A == B && A != 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        check(sc.nextInt(),sc.nextInt(),sc.nextInt());
    }
}
