package array;

/**
 * @author Zhangkj
 * @date 2019-12-17-17:37
 */
public class Jz4 {
    public static boolean Find_1(int target, int[][] array) {
        int row = array.length;
        int col = array[0].length;
        if (row == 0 || col == 0)
            return false;
        if (target < array[0][0] || target > array[row - 1][col - 1])
            return false;
        int i = 0;
        int j = col - 1;
        while (i < row && j >= 0) {
            if (array[i][j] > target) {
                j--;
            } else if (array[i][j] < target) {
                i++;
            } else {
                return true;
            }
        }

        return false;


    }



}
