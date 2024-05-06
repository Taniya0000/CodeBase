package Leetcode;

public class LargestNumberWithNegativeExist {
    public static void main(String[] args) {
        int[] nums = {14,33,40,-33,8,-24,-42,30,-18,-34};
        System.out.println(findMaxK(nums));
    }

    /*
     * <metadata>
     * <name> Largest Positive Integer That Exists With Its Negative</name>
     * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/IntersectionBwArrays.png"></description>
     * <status>Try Again</status>
     * <url>https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/description/</url>
     * <date>2024-05-02</date>
     * <level>Easy</level>
     * <remarks>Try Again</remarks>
     * <notes>1. Sort the array. <br/> 2. Apply two pointer approach. Start from start of the array to the end and compare value. <br/>
     3. If the sum of the start and end value sums upto the zero then move both the pointers. <br/>
    4. If the sum is positive then move end pointer else move start pointer. <br/></notes>
     * <companies>Apple:Adobe:Amazon:Google:Facebook:JPMorgan:Microsoft:Bloomberg</companies>
     * </metadata>
     * */
    public static int findMaxK(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i=0; i<nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }

        boolean doesNegativeExist = false;
        int negative = (-1) * (max);
        for(int j=0; j<nums.length; j++){
            if(negative == nums[j]){
                doesNegativeExist = true;
            }
        }

        if(doesNegativeExist == true){
            return max;
        }
        return -1;
    }
}
