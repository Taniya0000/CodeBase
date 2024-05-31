package Arrays;

import java.util.HashSet;
import java.util.Set;

/*
 * <metadata>
 * <name>Maximum Number of Vowels in a SubString  of a given length</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/IntersectionBwArrays.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/</url>
 * <date>2024-05-31</date>
 * <level>Medium</level>
 * <remarks>Leard Yard</remarks>
 * <companies>Amazon</companies>
 * <notes>Approach : Sliding Window <br/> 1. Iterate through k length first. <br/> 2. Deduct the vowel variable value if the last element left is vowel else add 1.</notes>
 * </metadata>
 * */
public class MaxVowelsInSubString {

    public static void main(String[] args) {
        String s = "leetcode";
        int k = 3;
        System.out.println(maxVowels(s,k));
    }

    private static int maxVowels(String s, int k){
        int maxi = 0;
        int currvowel = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < k) {
                if (isVowel(s.charAt(i))) {
                    currvowel++;
                }
            } else {
                if (isVowel(s.charAt(i))) {
                    currvowel++;
                }
                if (isVowel(s.charAt(i - k))) {
                    currvowel--;
                }
            }
            if (i >= k - 1) {
                maxi = Math.max(maxi, currvowel);
            }
        }
        return maxi;
    }
    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
