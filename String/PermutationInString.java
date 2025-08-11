package String;

public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        if (m < n) return false;

        int[] map1 = new int[26];
        int[] map2 = new int[26];

        // build frequency for s1 and initial window of s2
        for (int i = 0; i < n; i++) {
            map1[s1.charAt(i) - 'a']++;
            map2[s2.charAt(i) - 'a']++;
        }

        if (isMatched(map1, map2)) return true;

        // slide window over s2
        for (int i = 1; i <= m - n; i++) {
            map2[s2.charAt(i - 1) - 'a']--;          // remove old char
            map2[s2.charAt(i + n - 1) - 'a']++;      // add new char
            if (isMatched(map1, map2)) return true;
        }
        return false;
    }

    private boolean isMatched(int[] map1, int[] map2) {
        for (int i = 0; i < 26; i++)
            if (map1[i] != map2[i]) return false;
        return true;
    }
    public static void main(String[] args) {
        PermutationInString sol = new PermutationInString();

        String s1 = "ab";
        String s2 = "eidbaooo";

        boolean result = sol.checkInclusion(s1, s2);

        System.out.println("Does \"" + s2 + "\" contain a permutation of \"" + s1 + "\"? " + result);
    }
}
