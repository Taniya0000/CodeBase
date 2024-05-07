package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
 * <metadata>
 * <name>Unique Number of Occurences</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/IntersectionBwArrays.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/unique-number-of-occurrences/description/</url>
 * <date>2024-05-07</date>
 * <level>Easy</level>
 * <remarks>Leard Yard</remarks>
 * <companies>Amazon:Adobe:Facebook:Apple:Bloomberg:Google</companies>
 * <notes>1. Iterate over the array and put count occurrence accordingly.<br/> 2. Put counts in the set and if any already contains return false<br/></notes>
 * </metadata>
 * */
public class UniqueNumberOfOccurences {


    public static void main(String[] args) {
        int[] array = {1,2,2,1,1,3};
        System.out.println(uniqueOccurrences(array));
    }
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> occurenceMap = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            occurenceMap.put(arr[i], occurenceMap.getOrDefault(arr[i],0)+1);
        }

        Set<Integer> set = new HashSet<>();
        for (int i: occurenceMap.values()){
            if(set.contains(i)){
                return false;
            }
            set.add(i);
        }

        return true;
    }
}
