class Solution {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }

        long n = Math.abs((long) num);
        String res = base(n);

        if (num < 0) {
            res = "-" + res;
        }

        return res;
    }

    static String base(long n) {
        if (n < 7) {
            return String.valueOf(n);
        }

        return base(n / 7) + (n % 7);
    }
}