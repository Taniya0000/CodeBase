package Strings;

import java.util.Arrays;

/*
 * <metadata>
 * <name>Reverse String </name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/IntersectionBwArrays.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/reverse-string/description/</url>
 * <date>2024-06-02</date>
 * <level>Easy</level>
 * <remarks>Leard Yard</remarks>
 * <companies></companies>
 * <notes>Either use stack to reverse the string characters or use two pointer approach.</notes>
 * </metadata>
 * */
public class ReverseString {

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        System.out.println(Arrays.toString(s));
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }

    private static void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        while (i <= j){
            char c = s[i];
            s[i] = s[j];
            s[j] = c;
            i++;
            j--;
        }
    }
}


