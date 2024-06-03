package Arrays;

import java.util.Arrays;

/*
 * <metadata>
 * <name>Left and Right Differences</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/IntersectionBwArrays.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/left-and-right-sum-differences/description/</url>
 * <date>2024-06-03</date>
 * <level>Easy</level>
 * <remarks>Leard Yard</remarks>
 * <companies></companies>
 * <notes>1. Iterate through nums array and find left array sum. <br/> 2. Iterate through nums array again to find out the right array sum. <br/> 3. Initialize new array result with same size as that of the nums and deduct left array element from right array element and absolute it and put in the result array.</notes>
 * </metadata>
 * */
public class LeftAndRightSumDifferences {

    public static void main(String[] args) {
        int[] nums = {10,4,8,3};
        System.out.println(Arrays.toString(leftRightDifference(nums)));
    }

    private static int[] leftRightDifference(int[] nums){
        int[] leftArray = new int[nums.length];
        int[] rightArray = new int[nums.length];
        leftArray[0] = 0;
        for (int i=1; i<nums.length; i++){
            leftArray[i] = nums[i-1] + leftArray[i-1];
        }

        rightArray[nums.length-1] = 0;
        for (int j=nums.length-2; j>=0; j--){
            rightArray[j] = nums[j+1] + rightArray[j+1];
        }

        int[] result = new int[nums.length];
        for (int i=0; i<nums.length; i++){
            result[i] = Math.abs(leftArray[i] - rightArray[i]);
        }
        return result;
    }
}
