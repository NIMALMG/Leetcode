class Solution {
    public int countRotations(String s, int k) {
         int n = s.length();

        int total = 0;

        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                total++;
            }
        }

        if (s.charAt(n - 1) == s.charAt(0)) {
            total++;
        }

        if (k == total) {
            return n - total;
        }

        if (k == total - 1) {
            return total;
        }

        return 0;
    }
}