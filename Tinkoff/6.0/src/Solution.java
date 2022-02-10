import com.sun.jdi.ArrayReference;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class Solution {

    static Set<Integer> X = new HashSet<>();
    static ArrayList<Integer> fullX = new ArrayList<>();
    static int counter = 0;
    static int fullCounter = 0;

    public static void A(int value) {
        if (!fullX.contains(value)) {
            counter++;
        }
        X.add(value);
        fullCounter++;
    }

    public static void D(int value){
        int a = 0;
        for(int digit: fullX){
            if(digit == value && a==1) {DD(value); break;}
            if(digit == value && a==0) {fullX.remove(digit); a = a + 1; }
        }
        fullCounter--;
    }

    public static void DD(int value){
        X.remove(value);
        counter--;
    }

    public static void Q(int value){
        if(fullCounter%2==1 || counter%2==1){

        }
    }

    public static void main(String[] args) {
        int mediana;

    }
}