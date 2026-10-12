class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        } else {
            int count = 0;
            int first = -1, second = -1;

            if (s.equals(goal)) {
                int[] freq = new int[26];

                for (int i = 0; i < s.length(); i++) {
                    freq[s.charAt(i) - 'a']++;

                    if (freq[s.charAt(i) - 'a'] > 1) {
                        return true;
                    }
                }
                return false;
            }

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != goal.charAt(i)) {
                    count++;

                    if (count == 1) {
                        first = i;
                    } else if (count == 2) {
                        second = i;
                    } else {
                        return false;
                    }
                }
            }

            if (count == 2) {
                if (s.charAt(first) == goal.charAt(second)
                        && s.charAt(second) == goal.charAt(first)) {
                    return true;
                }
            }
        }

        return false;
    }
}