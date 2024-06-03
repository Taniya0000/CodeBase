package Arrays;

import java.util.Arrays;

/*
 * <metadata>
 * <name>Find the Score of All Prefixes of an Array</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/IntersectionBwArrays.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/find-the-score-of-all-prefixes-of-an-array/description/</url>
 * <date>2024-06-03</date>
 * <level>Easy</level>
 * <remarks>Leard Yard</remarks>
 * <companies></companies>
 * <notes>1. Find maximum till the index and put in the individual array (maxArray). <br/> 2. Find conversion Array values and put in the conversion array. <br/> 3. Find the resultant array and return.</notes>
 * </metadata>
 * */
public class FindtheScoreOfAllPrefixesOfAnArray {

    public static void main(String[] args) {
        int[] nums = {2,3,7,5,10};
        System.out.println(Arrays.toString(findPrefixScore(nums)));
    }

    private static long[] findPrefixScore(int[] nums){
        int maxArray[] = new int[nums.length];
        int max = Integer.MIN_VALUE;
        for (int i=0; i<nums.length; i++){
            if(nums[i] > max){
                maxArray[i] = nums[i];
                max = nums[i];
            } else {
                maxArray[i] = max;
            }
        }

        int[] conversionArray = new int[nums.length];
        long[] result = new long[nums.length];
        for (int i=0; i<nums.length; i++){
            conversionArray[i] = nums[i] + maxArray[i];
        }

        result[0] = conversionArray[0];
        for (int i=1; i<nums.length; i++){
            result[i] = result[i-1] + conversionArray[i];
        }

        return result;
    }
}
