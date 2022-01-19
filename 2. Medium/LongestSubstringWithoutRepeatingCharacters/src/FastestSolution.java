class FastestSolution {

    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        if (chars.length == 0)
            return 0;

        if (chars.length == 1)
            return 1;

        int start = 0, longestLength = 0;

        for (int i = 0; i < chars.length; i++) {
            char to = chars[i];

            //Checks if its valid
            for (int j = start; j < i; j++) {
                char checked = chars[j];

                if (to == checked) {
                    start = j + 1;
                    break;
                }
            }

            if (longestLength < i - start) {
                longestLength = i - start;
            }
        }

        return longestLength + 1;
    }
}