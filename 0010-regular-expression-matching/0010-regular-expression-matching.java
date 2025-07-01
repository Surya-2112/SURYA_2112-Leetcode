class Solution {
    private int n, m;

    public boolean matching(String s, String p, int i, int j) {
        if (j == m) return i == n;

        boolean res = (i < n && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.'));
        if (j + 1 < m && p.charAt(j + 1) == '*') {
    
            return matching(s, p, i, j + 2) || (res && matching(s, p, i + 1, j));
        } else {

            return res && matching(s, p, i + 1, j + 1);
        }
    }

    public boolean isMatch(String s, String p) {
        n = s.length();
        m = p.length();
        return matching(s, p, 0, 0);
    }
}
