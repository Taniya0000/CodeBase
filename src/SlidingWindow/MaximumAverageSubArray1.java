package SlidingWindow;

/*
 * <metadata>
 * <name>Maximum Average SubArray I</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/IntersectionBwArrays.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/maximum-average-subarray-i/description/</url>
 * <date>2024-06-01</date>
 * <level>Easy</level>
 * <remarks>Leard Yard</remarks>
 * <companies></companies>
 * <notes>Sliding Window Approach <br/> 1. Iterate through the array find k window sum and then use the already computed result with the next elememts.</notes>
 * </metadata>
 * */
public class MaximumAverageSubArray1 {

    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(findMaxAverage(nums,k));

    }

    private static double findMaxAverage(int[] nums, int k){
        double average = 0.0;
        double max = 0.0;
        for (int i=0; i<k; i++){
            average += nums[i];
        }
        max = average;
        for (int i=k; i<nums.length; i++){
            average += nums[i] - nums[i-k];
            max = Math.max(average, max);
        }
        return max/k;
    }

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
    public static class MaxVowelsInSubString {

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
}
