import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        int N = 5, K = 3, M = 3, SUM = 0;
        ArrayList<Integer> crosses = new ArrayList<>(N);
        crosses.add(1);
        crosses.add(1);
        crosses.add(1);
        crosses.add(3);
        crosses.add(3);

        int iteratorL = 0, iteratorR = 0;
        ArrayList<Integer> tempM = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        while (iteratorR < N) {
            if(iteratorR%K == 0)SUM += crosses.get(iteratorR)/K; else SUM += crosses.get(iteratorR)/K + 1;
            tempM.add(crosses.get(iteratorR));

            iteratorR++;
        }
        System.out.println(SUM);
    }
}
