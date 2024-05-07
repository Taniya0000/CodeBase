package Arrays;

/*
 * <metadata>
 * <name>Richest Customer Wealth</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/IntersectionBwArrays.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/richest-customer-wealth/description/</url>
 * <date>2024-05-07</date>
 * <level>Easy</level>
 * <remarks>Leard Yard</remarks>
 * <companies>Adobe</companies>
 * <notes>1. Iterate over the array and sum the values and return the maximum value</notes>
 * </metadata>
 * */
public class RichestCustomerWealth {

    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        for(int i=0; i<accounts.length; i++){
            int sum = 0;
            for(int j=0; j<accounts[0].length; j++){
                sum+= accounts[i][j];
            }
            maxWealth = Math.max(maxWealth, sum);
        }
        return maxWealth;
    }

}
