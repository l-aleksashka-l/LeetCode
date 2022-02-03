import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static long paint(long min, long max){
        long counter = 1;
        if(min<max){return recursion(max,min,counter);}else if(min>max){return recursion(min,max,counter);}else return counter;
    }
    public static long recursion(long max,long min, long counter){
        if(min<max){max-=min; counter++; return recursion(max,min,counter);}else if(min>max){return recursion(min,max,counter);}else return counter;
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(paint(sc.nextLong(), sc.nextLong()));
    }
}
