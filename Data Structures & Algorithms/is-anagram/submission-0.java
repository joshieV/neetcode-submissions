class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26];
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            count[a[i] - 'a']++;
            count[b[i] - 'a']--;
        }

        for (int n : count) {
            if (n != 0) return false;
        }
        return true;
    }
}
