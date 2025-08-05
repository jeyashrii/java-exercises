package BinarySearch;

import java.util.Arrays;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
public class FindCeiling {
    public static void main(String[] args) {
        int[] arr = {2,3,5,8,14,16,18};
        int target = 15;
        Arrays.sort(arr);
        System.out.println(findCeiling(arr, target));
        System.out.println(findCeiling(arr, 19));

    }
//return the index of the number =target or smallest number >target
    static int findCeiling(int[] arr, int target) {
        //what if target is greater than the last element of array ?if it doesn't exist in array we cannot go out of array bound so,
        if(target>arr[arr.length-1]){return -1;}
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
        return start;
    }

}
