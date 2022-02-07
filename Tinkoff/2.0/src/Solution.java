import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static int counter = 0;
    public static int sum = 0;
    static ArrayList<Integer> digits = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stop = 0;
        while (stop < 10) {
            int temp = scanner.nextInt();
            digits.add(temp);
            sum += temp;
            stop++;
        }
        sum /= 10;
        for (Integer digit : digits) {
            if (digit > sum) counter++;
        }
        System.out.println(counter);
    }
}
