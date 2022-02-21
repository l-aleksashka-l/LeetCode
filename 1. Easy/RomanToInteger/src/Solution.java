import java.util.HashMap;
import java.util.Map;

public class Solution {

        static public int romanToInt(String str) {
            Map map = new HashMap<Character, Integer>();
            map.put('I', 1);
            map.put('V', 5);
            map.put('X', 10);
            map.put('L', 50);
            map.put('C', 100);
            map.put('D', 500);
            map.put('M', 1000);
            int n = str.length();
            int sum = 0;
            for (int i = n - 1; i >= 0; i--) {
                if (i == n - 1) {
                    sum += (Integer) map.get(str.charAt(i));
                    continue;
                }
                if ((Integer) map.get(str.charAt(i)) >= (Integer) map.get(str.charAt(i + 1))) {
                    sum += (Integer) map.get(str.charAt(i));
                } else {
                    sum -= (Integer) map.get(str.charAt(i));
                }
            }
            return sum;

        }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}
