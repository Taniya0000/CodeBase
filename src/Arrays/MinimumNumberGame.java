package Arrays;

import java.util.Arrays;

/*
     * <metadata>
     * <name>Minimum Number Game</name>
     * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/IntersectionBwArrays.png"></description>
     * <status>Completed</status>
     * <url>https://leetcode.com/problems/minimum-number-game/description/</url>
     * <date>2024-05-06</date>
     * <level>Easy</level>
     * <remarks>Try Again</remarks>
     * <notes>Sort the array and then swap i and i+1 index values <br/></notes>
     * <companies>Optum</companies>
     * </metadata>
     * */
public class MinimumNumberGame {

    public static void main(String[] args) {
        int[] nums = {5,4,2,3};
        System.out.println(numberGame(nums));
    }

    public static int[] numberGame(int[] arr) {
        Arrays.sort(arr);

        for(int i=0; i<arr.length-1; i=i+2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        return arr;
    }
}
