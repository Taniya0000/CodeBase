package Arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * <metadata>
 * <name>Add to Array-Form of Integer</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/IntersectionBwArrays.png"></description>
 * <status>Try Again</status>
 * <url>https://leetcode.com/problems/add-to-array-form-of-integer/description/</url>
 * <date>2024-05-08</date>
 * <level>Easy</level>
 * <remarks>Leard Yard</remarks>
 * <companies>Facebook</companies>
 * <notes>Same as Plus One Problem approach from Leetcode </notes>
 * </metadata>
 * */
public class AddToArrayFormOfInteger {

    public static void main(String[] args) {
        int[] num = {2,1,5};
        int k = 806;
        System.out.println(addToArrayForm(num, k));
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> secondNum = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        while (k > 0){
            int n = k%10;
            secondNum.add(n);
            k = k/10;
        }
        Collections.reverse(secondNum);

        ArrayList<Integer> firstNum = new ArrayList<>();
        for (int i=0; i<num.length; i++){
            firstNum.add(num[i]);
        }

        Collections.reverse(firstNum);
        Collections.reverse(secondNum);

        int index = 0;
        int carry = 0;
        while(index < firstNum.size() && index < secondNum.size()){
            int sum = firstNum.get(index) + secondNum.get(index) + carry;
            carry = sum / 10;
            result.add(sum % 10);
            index++;
        }

        while (index < firstNum.size()){
            int sum = firstNum.get(index) + carry;
            carry = sum/10;
            result.add(sum % 10);
            index++;
        }

        while (index < secondNum.size()){
            int sum = secondNum.get(index) + carry;
            carry = sum/10;
            result.add(sum % 10);
            index++;
        }
        result.add(carry);

        Collections.reverse(result);
        return result;
    }
}
