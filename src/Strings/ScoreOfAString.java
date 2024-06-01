package Strings;

/*
 * <metadata>
 * <name>Maximum Number of Vowels in a SubString  of a given length</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/IntersectionBwArrays.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/score-of-a-string/description/</url>
 * <date>2024-06-01</date>
 * <level>Easy</level>
 * <remarks>Leard Yard</remarks>
 * <companies></companies>
 * <notes>Loop through the string and find absolute ascii value of current and previous character and add to the final score</notes>
 * </metadata>
 * */
public class ScoreOfAString {

    public static void main(String[] args) {
        String s = "zaz";
        System.out.println(scoreOfString(s));
    }

    private static int scoreOfString(String s){
        int score = 0;
        for (int i=1; i<s.length(); i++){
            int firstAscii = (int) s.charAt(i-1);
            int secondAscii = (int) s.charAt(i);
            score += Math.abs(firstAscii - secondAscii);
        }
        return score;
    }
}
