package Matrix;

public class RowWithMaxOne {

    public static void main(String[] args) {
        int[][] arr ={{0,0},
                {0, 0},
                };
        System.out.println(rowWithMax1s(arr, arr.length, arr[0].length));
    }

    static int rowWithMax1s(int arr[][], int n, int m) {
        int maxOnesCount = Integer.MIN_VALUE;
        int maxOnesRowIndex = -1;

        for(int i = 0; i < n; i++) {
            int onesCount = countOnes(arr[i], 0, m - 1);
            if (onesCount > maxOnesCount) {
                maxOnesCount = onesCount;
                maxOnesRowIndex = i;
            }
        }

        return maxOnesRowIndex;
    }

    private static int countOnes(int[] row, int start, int end) {
        int count = Integer.MIN_VALUE;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (row[mid] == 1) {

                count += end - mid + 1;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return count;
    }
}
