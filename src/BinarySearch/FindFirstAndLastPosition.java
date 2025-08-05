package BinarySearch;

import java.util.Arrays;

public class FindFirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = searchInRange(nums, target);
        System.out.println(Arrays.toString(result)); // Output: [3, 4]

    }
public static int[] searchInRange(int[]nums, int target){
    int[] ans={-1,-1};
    int start = search(nums, target,true);
    int end = search(nums, target,false);
    ans[0]=start;
    ans[1]=end;
    return ans;
}
//this function just returns the index of the target
    static int search(int[] nums, int target,boolean isFindStart) {
        int ans=-1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
           int mid = start + (end - start) / 2;
            if(target<nums[mid]){
                end=mid-1;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }else{
                if(isFindStart){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }

        }return ans;
    }


}
