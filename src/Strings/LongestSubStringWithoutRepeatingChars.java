package Strings;
import java.util.Arrays;

/*
 * <metadata>
 * <name>Longest Substring Without Repeating Characters</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/IntersectionBwArrays.png"></description>
 * <status>Try Again</status>
 * <url>https://leetcode.com/problems/longest-substring-without-repeating-characters/description/</url>
 * <date>2024-06-03</date>
 * <level>Medium</level>
 * <remarks>Leard Yard</remarks>
 * <companies>Amazon:Microsoft:Google:Facebook:Bloomberg:Apple:Spotify:Adobe:Uber:VMware:Yahoo:Goldman Sachs:Oracle:Walmart:Paypal:Intuit:Salesforce:Zoho:JPMorgan:Yandex:Samsung</companies>
 * <notes>1. Intialize hash array and fill it with -1. <br/>
2. Start iterating through the string and loop until it reaches length of the string. <br/>
3. If character reached is earlier visible hash value of array of that char should be greater than -1. <br/>
4. Check the index value with the left pointer value before change and change only if it is under the current window. <br/>
5. Calculate maximum substring length and increment right also put index value in hash[char]. <br/>
6. Return the length.<br/></notes>
 * </metadata>
 * */
public class LongestSubStringWithoutRepeatingChars {

    public static void main(String[] args) {
        String s = "abdefgabef";
        System.out.println(lengthOfLongestSubstringBruteForce(s));
        System.out.println(lengthOfLongestSubString(s));

    }

    private static int lengthOfLongestSubstringBruteForce(String s){

        int max = Integer.MIN_VALUE;
        for (int i=0; i<s.length(); i++){
            int[] hash = new int[255];
            for (int j=i; j<s.length(); j++){
                if(hash[s.charAt(j)] == 1){
                    break;
                }

                max = Math.max(max, j - i + 1);
                hash[s.charAt(j)] = 1;
            }
        }
        return max;
    }

    private static int lengthOfLongestSubString(String s){
        int left = 0;
        int right = 0;
        int n = s.length();
        int max = Integer.MIN_VALUE;
        int[] hash = new int[256];
        // fill the Array with -1
        Arrays.fill(hash, -1);
        // Stop iterating until right touches n
        while (right < n){
            // if character already saw earlier then hash of character should be equal to ascii
            if(hash[s.charAt(right)] != -1){
                // if character already visited but not within the current window
                if(hash[s.charAt(right)] >= left){
                    left = hash[s.charAt(right)] + 1;
                }
            }
            // calculate the max substring length
            max = Math.max(max, right - left + 1);
            // Increment right and put index of the char respective to its ascii of hash array
            hash[s.charAt(right)] = right;
            right++;
        }
        return max;
    }
}
