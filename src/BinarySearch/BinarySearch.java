package BinarySearch;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 45, 32, 43, 7, 91};
        int target = 43;
        Arrays.sort(arr);
        System.out.println(findElement(arr, target));
        System.out.println(findElement(arr, 1));
    }

    static int findElement(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            //int mid=start+end/2; might be possible that (start+end) exceeds the integer limit
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
