package Arrays;

import java.util.Arrays;

/*
 * <metadata>
 * <name>Cyclic Rotate Array by One</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/IntersectionBwArrays.png"></description>
 * <status>Completed</status>
 * <url>https://www.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1</url>
 * <date>2024-05-31</date>
 * <level>Easy</level>
 * <remarks>Leard Yard</remarks>
 * <companies></companies>
 * <notes>1. Iterate over the array through n-2 to 0 and at last copy last element to the first index.</notes>
 * </metadata>
 * */
public class CyclicRotateArrayByOne {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(Arrays.toString(array));
        rotate(array, array.length);
        System.out.println(Arrays.toString(array));
    }

    private static void rotate(int[] arr, int n){
        int lastElement = arr[n-1];

        for(int i=n-2; i>=0; i--){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        arr[0] = lastElement;
    }
}
