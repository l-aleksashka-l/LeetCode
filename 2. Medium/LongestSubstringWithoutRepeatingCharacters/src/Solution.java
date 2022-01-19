import java.util.*;

public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        String[] fullstring = s.split("");
        int counter = 0, lilcounter = 1;
        if (!s.equals("")) {
            int IteratorFirst = 0, IteratorSecond;
            ArrayList<String> substring = new ArrayList<>();
            substring.add(fullstring[IteratorFirst]);
            for (int iter = 1; iter < fullstring.length; iter++) {
                if(!substring.contains(fullstring[iter])){
                    substring.add(fullstring[iter]);
                    lilcounter++;
                } else{
                    if(lilcounter>counter) counter = lilcounter;
                    int a = substring.indexOf(fullstring[iter]);
                    for (int i=a;i>=0;i--){
                        substring.remove(i);
                    }
                    substring.add(fullstring[iter]);
                    lilcounter = substring.size();
                }
            }
            if(lilcounter>counter) counter = lilcounter;
        }
        return counter;
    }


    public static void main(String[] args) {
        String a = "";
        System.out.println(lengthOfLongestSubstring(a));
    }


}
