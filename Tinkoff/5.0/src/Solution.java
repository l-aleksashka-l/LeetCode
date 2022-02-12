import java.util.ArrayList;
import java.util.List;

public class Solution {
    static String full;
    static String first;
    static String second;
    static boolean word = true;
    static boolean temp = true;
    static int I = 0, F = 0, S = 0, II = 0;
    static int change = 0;


    public static void compareF(int i, int f) {
        if (f == first.length()) {
            word = false;
        } else {
            if (full.charAt(i) == first.charAt(f)) {
                I++;
                II++;
                F++;
                System.out.println(full.charAt(i) + " " + first.charAt(f) + " " + word);
            } else {
                II++;
                word = false;
            }
        }
    }

    public static void compareS(int i, int s) {
        if (s == second.length()) {
            word = true;
        } else {
            if (full.charAt(i) == second.charAt(s)) {
                I++;
                II++;
                S++;
                System.out.println(full.charAt(i) + " " + second.charAt(s) + " " + word);
            } else {
                II++;
                word = true;
            }
        }
    }

    public static void main(String[] args) {
        full = "gagabaac";
        first = "gab";
        second = "agaac";


        if (second.charAt(S) == first.charAt(F)) {

            while (I < full.length()) {
                if(word != temp) {temp = word; change++;}

                if (word) {
                    compareF(I, F);
                } else {
                    compareS(I, S);
                }
                if (II == 2 * full.length()) {
                    break;
                }
            }
            int changeF = change;
            I = 0;
            F = 0;
            S = 0;
            II = 0;
            change = 0;
            word = false;
            temp = false;
            while (I < full.length()) {
                if(word != temp) {temp = word; change++;}

                if (word) {
                    compareF(I, F);
                } else {
                    compareS(I, S);
                }
                if (II == 2 * full.length()) {
                    break;
                }
            }

            System.out.println(Math.min(changeF, change));
        } else {
            if (full.charAt(I) != first.charAt(F)) {word = false; temp = word;}

            while (I < full.length()) {
                if(word != temp) {temp = word; change++;}
                if (word) {
                    compareF(I, F);
                } else {
                    compareS(I, S);
                }

                System.out.println(change);
            }
        }
    }
}
