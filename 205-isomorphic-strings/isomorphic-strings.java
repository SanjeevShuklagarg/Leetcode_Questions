class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] arr = new int[65536];
        int[] arr2 = new int[65536];

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);

            if (arr[a] != arr2[b]) {
                return false;
            }

            arr[a] = i + 1;
            arr2[b] = i + 1;
        }

        return true;
    }
}