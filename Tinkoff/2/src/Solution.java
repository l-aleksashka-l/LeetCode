import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static int paint(int min, int max){
        int counter = 1;
        if(min<max){return recursion(max,min,counter);}else if(min>max){return recursion(min,max,counter);}else return counter;
    }
    public static int recursion(int max,int min, int counter){
        if(min<max){max-=min; counter++; return recursion(max,min,counter);}else if(min>max){return recursion(min,max,counter);}else return counter;
    };

    public static void main(String[] args) {
        System.out.println(paint(50,49));
    }
}
