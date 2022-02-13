import java.beans.IntrospectionException;
import java.util.*;

public class Solution {
    static String full;
    static String first;
    static String second;
    static int I = 0, F = 0, S = 0, WHICH = 0;
    static int change = 0;
    static Set<Integer> firstList = new HashSet<>();
    static Set<Integer> secondList = new HashSet<>();
    static Map<Character, Set<Integer>> firstMap = new HashMap<>();
    static Map<Character, Set<Integer>> secondMap = new HashMap<>();

    public static int coincidence() {
        int i = I;
        while(i < full.length()){
            char l = full.charAt(i);
            Set<Integer> f = firstMap.get(full.charAt(i));
            Set<Integer> s = secondMap.get(full.charAt(i));
        }
    }

    public static void main(String[] args) {
        full = "gagabaac";
        first = "gab";
        second = "agaac";

        while (F < first.length()) {
            if (firstMap.containsKey(first.charAt(F))) {
                firstList = firstMap.get(first.charAt(F));
            } else {
                firstList = new HashSet<>();
            }
            firstList.add(F + 1);
            firstMap.put(first.charAt(F), firstList);
            F++;
        }
        while (S < second.length()) {
            if (secondMap.containsKey(second.charAt(S))) {
                secondList = secondMap.get(second.charAt(S));
            } else {
                secondList = new HashSet<>();
            }
            secondList.add(S + 1);
            secondMap.put(second.charAt(S), secondList);
            S++;
        }

        System.out.println(firstMap);
        System.out.println(secondMap);

        while (I < full.length()) {
            char l = full.charAt(I);
            Set<Integer> f = firstMap.get(full.charAt(I));
            Set<Integer> s = secondMap.get(full.charAt(I));
            if (firstMap.containsKey(l) && secondMap.containsKey(l)) {
                if (f.isEmpty()) f.add(Integer.MAX_VALUE);
                if (s.isEmpty()) s.add(Integer.MAX_VALUE);
                if (f.stream().findFirst().get() < s.stream().findFirst().get()) {

                    if (WHICH == 1) {
                        change++;
                    }

                    f.remove(f.stream().findFirst().get());
                    I++;
                    WHICH = 0;
                } else if (f.stream().findFirst().get() > s.stream().findFirst().get()) {

                    if (WHICH == 0) {
                        change++;
                    }

                    s.remove(f.stream().findFirst().get());
                    I++;
                    WHICH = 1;
                } else {
                    if (I != 0) {
                        if (WHICH == 0) {
                            f.remove(f.stream().findFirst().get());
                            I++;
                        } else {
                            s.remove(f.stream().findFirst().get());
                            I++;
                        }
                    }else{

                    }

                }
            }

        }


    }
}
