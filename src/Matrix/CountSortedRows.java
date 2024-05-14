package Matrix;

/*
 * <metadata>
 * <name>Count Sorted Rows</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/IntersectionBwArrays.png"></description>
 * <status>Try Again</status>
 * <url>https://www.geeksforgeeks.org/problems/count-sorted-rows2702/1</url>
 * <date>2024-05-14</date>
 * <level>Easy</level>
 * <remarks>Leard Yard</remarks>
 * <companies>Samsung</companies>
 * <notes>1. Find whether the row is sorted reverse or simply sorted. <br/> 2. Return the count accordingly.</notes>
 * </metadata>
 * */
public class CountSortedRows {

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{6,5,4},{8,7,9}};
        System.out.println(sortedCount(matrix.length, matrix[0].length, matrix));
    }


    private static int sortedCount(int N, int M, int[][] matrix){
        int count = 0;
        for (int[] row: matrix){
            if(isSorted(row) || isSortedReverse(row)){
                count++;
            }
        }
        return count;
    }

    private static boolean isSorted(int[] row){
        for (int i=1; i<row.length; i++){
            if(row[i-1] >= row[i]){
                return false;
            }
        }
        return true;
    }

    private static boolean isSortedReverse(int[] row){
        for(int i=1; i<row.length; i++){
            if(row[i-1] <= row[i]){
                return false;
            }
        }
        return true;
    }

}
