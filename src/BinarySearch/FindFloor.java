package BinarySearch;

import java.util.Arrays;

public class FindFloor {
    public static void main(String[] args) {
        int[] arr = {2,3,5,8,14,16,18};
        int target = 15;
        Arrays.sort(arr);
        System.out.println(findFloor(arr, target));
        //what if target is lesser than the first element?end will automatically become -1
        System.out.println(findFloor(arr, 1));

    }
//return the index of the number =target or greatest number < target
    static int findFloor(int[] arr, int target) {

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
        return end;
    }

}
