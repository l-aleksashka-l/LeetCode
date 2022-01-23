import java.util.HashMap;
import java.util.Map;

public class Solution {
        public static String convert(String s, int numRows) {
            if(numRows==1)return s;
            //String[] letters = s.split("");
            String[] lilStrings = new String[numRows];
            String answer = "";
            //Map<Integer,String> map = new HashMap<Integer,String>();
            int loopCounter = (numRows-1)*2, j=0;
            for(int i =0;i<numRows;i++){
                lilStrings[i] = "";
            }
        /*while(j < numRows){
            map.put(j,"");
            j++;
        }*/
            for(int i = 0; i < s.length(); i++){
                lilStrings[i%loopCounter>=numRows?loopCounter-i%loopCounter:i%loopCounter]+=s.charAt(i);
            }
        /*for(int i = 0; i < s.length(); i++){
            map.put(i%loopCounter>=numRows?loopCounter-i%loopCounter:i%loopCounter,map.get(i%loopCounter>=numRows?loopCounter-i%loopCounter:i%loopCounter)+letters[i]);
        }*/

            for(String word: lilStrings)
                answer+=word;
        /*j=0;
        while(j < numRows){
            answer += map.get(j);
            j++;
        }*/
            return answer;
        }

        public static void main(String[] args) {
            System.out.println(convert("abcdefghijklmnop",3));
        }
    }
