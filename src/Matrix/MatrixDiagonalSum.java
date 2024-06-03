package Matrix;

/*
 * <metadata>
 * <name>Matrix Diagonal Sum</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/IntersectionBwArrays.png"></description>
 * <status>Try Again</status>
 * <url>https://leetcode.com/problems/matrix-diagonal-sum/description/</url>
 * <date>2024-05-14</date>
 * <level>Easy</level>
 * <remarks>Leard Yard</remarks>
 * <companies>Bloomberg:Amazon</companies>
 * <notes>1. Primary diagonal is primarily all the elements with same i and j value. <br/> 2. Secondary diagonal are having elements with i as row and j as column value. <br/> 3. Do the sum of primary and secondary diagonal elements. <br/> 4. If the matrix length is odd subtract the matrix n by 2 and n by 2 element else return sum.</notes>
 * </metadata>
 * */
public class MatrixDiagonalSum {

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonalSum(matrix));
    }

    private static int diagonalSum(int[][] matrix){
        int sum = 0;
        int n = matrix.length;
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        for (int i=0;i<matrix.length; i++){
            primaryDiagonalSum += matrix[i][i];
            secondaryDiagonalSum += matrix[i][matrix.length-i-1];
        }
        sum = primaryDiagonalSum + secondaryDiagonalSum;

        return n%2 != 0 ? sum - matrix[n/2][n/2] : sum;
    }
}
