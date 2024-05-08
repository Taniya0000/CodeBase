package Arrays;
import java.util.*;

/*
 * <metadata>
 * <name>Plus One</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/IntersectionBwArrays.png"></description>
 * <status>Try Again</status>
 * <url>https://leetcode.com/problems/plus-one/description/</url>
 * <date>2024-05-08</date>
 * <level>Easy</level>
 * <remarks>Leard Yard</remarks>
 * <companies>Facebook:Google:Amazon:Apple:Adobe:ByteDance</companies>
 * <notes>1. Reverse the list. <br/> 2.Set carry as 1. <br/> 3. Calucate the sum as number + carry. <br/> 4. Calculate carry as sum/10 (as everything less than 10 by dividing to 10 will give zero as carry and one case when its above 1 then give carry as 1 <br/> 5. Replace the ith digit with sum%10.</notes>
 * </metadata>
 * */
public class PlusOne {

    public static void main(String[] args) {
        int[] digits = {9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {
        int[] result = new int[digits.length+1];
        int carry = 1;
        for (int i=digits.length-1; i>=0; i--){
            int sum = digits[i] + carry;
            carry = sum/10;
            digits[i] = sum % 10;
            result[i+1] = sum % 10;
        }
        if(carry == 1){
            result[0] = 1;
            return result;
        }
        return digits;
    }
}
