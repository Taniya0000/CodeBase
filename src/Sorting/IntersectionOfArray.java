package Sorting;

import java.util.HashSet;
import java.util.Set;

/*
 * <metadata>
 * <name>Intersection of Two Arrays</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/IntersectionBwArrays.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/intersection-of-two-arrays/description/</url>
 * <date>2024-04-16</date>
 * <level>Easy</level>
 * <remarks>Kunal Kushwaha</remarks>
 * <notes>1. Use Sets </br> 2. Use Two Pointers Approach</notes>
 * <companies>Apple:Adobe:Amazon:Google:Facebook:JPMorgan:Microsoft:Bloomberg</companies>
 * </metadata>
 * */
public class IntersectionOfArray {
        public int[] intersection(int[] nums1, int[] nums2) {
            Set<Integer> uniqueElements = new HashSet<>();
            Set<Integer> intersection = new HashSet<>();
            for(int i=0; i<nums1.length; i++){
                uniqueElements.add(nums1[i]);
            }

            for(int j=0; j<nums2.length; j++){
                if(uniqueElements.contains(nums2[j])){
                    intersection.add(nums2[j]);
                }
            }

            int[] result = new int[intersection.size()];
            int index = 0;
            for(Integer val : intersection){
                result[index] = val;
                index++;
            }

            return result;
        }
}
