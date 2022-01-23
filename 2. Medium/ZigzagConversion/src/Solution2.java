public class Solution2 {
    public static String convert(String s, int numRows) {
        if (numRows == 1) return s;
        int loopCounter = (numRows - 1) * 2;
        char[] string = new char[s.length()];
        int index = 0;
        for (int i = 0; i < numRows; i++) {
            int max = i;
            if (max == 0 || max == numRows-1) {
                while (max < s.length()) {
                    string[index] += s.charAt(max);
                    index++;
                    max += loopCounter;
                }
            } else {
                int max2 = loopCounter-max;
                while (max < s.length()) {
                    string[index] += s.charAt(max);
                    index++;
                    max += loopCounter;
                    if(max2 < s.length()){
                    string[index] += s.charAt(max2);
                    index++;
                    max2 += loopCounter;}
                }
            }
        }
        return new String(string);
    }
    public static void fun(String[] string, int index,String s, int max, int loopCounter){
        string[index] += s.charAt(max);
        index++;
        max += loopCounter;
    }

    public static void main(String[] args) {
        System.out.println(convert("abcdefghijklmnopjj", 3));
    }
}
