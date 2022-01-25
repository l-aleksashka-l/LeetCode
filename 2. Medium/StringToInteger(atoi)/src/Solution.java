public class Solution {
    public static int myAtoi(String s) {
        String number = "0";
        int sign = 1, i = 0;
        //if(s.isEmpty()) return 0;
        try {
        while (s.charAt(i) == ' ') {i++;/*if(i>=s.length())return 0;*/}
        if (s.charAt(i) == '-') {sign = -1;i++;} else if (s.charAt(i) == '+') {i++;}
        while (i<s.length() && (s.charAt(i) == '1' || s.charAt(i) == '2' || s.charAt(i) == '3' || s.charAt(i) == '4' || s.charAt(i) == '5' || s.charAt(i) == '6' || s.charAt(i) == '7' || s.charAt(i) == '8' || s.charAt(i) == '9' || s.charAt(i) == '0')) {
            number += s.charAt(i) ;
            i++;
        }
        i = Integer.parseInt(number);
        return i * sign;
        } catch (NumberFormatException e) {
            if (sign == 1) return Integer.MAX_VALUE;
            else return Integer.MIN_VALUE;
        } catch (Exception e){
            return 0;
        }
    }


    public static void main(String[] args) {
        String s = "     1";
        System.out.println(myAtoi(s));
    }
}
