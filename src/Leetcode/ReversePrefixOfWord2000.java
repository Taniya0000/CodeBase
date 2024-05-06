package Leetcode;

public class ReversePrefixOfWord2000 {

    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        System.out.println(reversePrefix(word, ch));
    }

    /*
     * <metadata>
     * <name> Reverse Prefix of Word</name>
     * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/IntersectionBwArrays.png"></description>
     * <status>Completed</status>
     * <url>https://leetcode.com/problems/reverse-prefix-of-word/description/</url>
     * <date>2024-05-02</date>
     * <level>Easy</level>
     * <remarks>Try Again</remarks>
     * <notes>1. Iterate through the string and find the prefix. <br/></notes>
     * <companies>Optum</companies>
     * </metadata>
     * */
    public static String reversePrefix(String word, char ch) {
        char[] charArray = word.toCharArray();
        int lastIndex = -1;
        for(int i=0; i<word.length(); i++){
            if(charArray[i] == ch){
                lastIndex = i;
                break;
            }
        }

        int start = 0;
        int end = lastIndex;
        while(start <= end){


                char leftChar = charArray[start];
                char rightChar = charArray[end];
                charArray[start] = rightChar;
                charArray[end] = leftChar;

            start++;
            end--;

        }
        String result = new String(charArray);
        return result;


    }
}
