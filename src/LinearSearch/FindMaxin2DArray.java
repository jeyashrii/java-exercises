package LinearSearch;

import java.util.Arrays;

public class FindMaxin2DArray {
    public static void main(String[] args) {
        int[][] arr = {{2, 3, 5, 6}, {8, 9, 47}};
        System.out.println(Arrays.toString(findMaxPos(arr)));
        int[][] arr1 = {{2, 3, 5, 6}, {8, 9, 47}};
        System.out.println(findMaxNum(arr1));
    }
//return the position of maximum value

    static int[] findMaxPos(int[][] arr) {
        int max = arr[0][0];
        int[] position = {0, 0};
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                    position[0] = row;
                    position[1] = col;
                }
            }
        }
        return position;
    }

    //return the maximum value
    static int findMaxNum(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] rows:arr) {
            for (int element:rows) {
                if (element> max) {
                    max = element;
                }
            }
        }
        return max;
    }
}
