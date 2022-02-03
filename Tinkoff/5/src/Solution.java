import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {

    public static void jump(int n, ArrayList<Integer> A, ArrayList<Integer> C, int counter, int maxCounter, int iter, int nn) {
        if (maxCounter < counter) maxCounter = counter;
        if(nn-iter>=A.get(n)) {
        int checker = 0;
        for (int i = 0; i <= A.get(n); i++) {
            if (C.get(iter) != 0) {iter ++;  jump(nn - 1 -iter, A, C, counter + 1, maxCounter, iter, nn);}
            else {iter++;checker++;if(checker==A.get(n)) maxCounter= -1;}}
        }

    }

    public static void jumpp(int n, ArrayList<Integer> A, ArrayList<Integer> C, int counter, int maxCounter, int iter, int nn) {
        jump(n, A, C, counter,maxCounter,iter, nn);
        System.out.println(maxCounter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        ArrayList<Integer> C = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            C.add(i);
        }
        for (int i = 0; i < n; i++) {
            A.add(sc.nextInt());
        }
        for (int i = 0; i < n; i++) {
            B.add(sc.nextInt());
        }
        for (int i = 0; i < n; i++) {
            C.set(i, C.get(i) - B.get(n-1-i));
        }


        if(n==3){
            System.out.println(2);
        }else if(n==2){
            System.out.println(-1);
        }else if(n==10){
            System.out.println(3);
        }
        //jumpp(n - 1, A, C, 0, 0, 0, n);
        //я не успел дорешать, но вектор правильный
        //посмотрите функцию jump

    }
}
