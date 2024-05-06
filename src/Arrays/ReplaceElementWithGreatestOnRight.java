package Arrays;
/*
 * <metadata>
 * <name>Replace Elements with Greatest Element on Right Side</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/IntersectionBwArrays.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/</url>
 * <date>2024-05-06</date>
 * <level>Easy</level>
 * <remarks>Try Again</remarks>
 * <notes>Same approach as that in to find the leaders in an array <br/> Start iterating  from last of the array<br/></notes>
 * <companies>Facebook</companies>
 * </metadata>
 * */
public class ReplaceElementWithGreatestOnRight {

    public static void main(String[] args) {
        int[] nums = {17,18,5,4,6,1};
        System.out.println(replaceElements(nums));
    }

    public static int[] replaceElements(int[] arr) {
        int max = -1;
        if(arr.length == 1){
            arr[0] = -1;
            return arr;
        }
        arr[arr.length-1] = -1;
        for(int i=arr.length-2; i>=0; i--){
            if(arr[i] > max){
                max = arr[i];
            }
            arr[i] = max;
        }
        return arr;
    }
}
