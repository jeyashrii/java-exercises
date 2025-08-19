package BinarySearch;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
//https://leetcode.com/problems/find-peak-element/description/
public class PeakInMountainArray {
    public static void main( String[]args){
        int[] arr = {0,1,6,8,1,0};
      System.out.println((findPeak(arr)));
    }
    static int findPeak(int[]arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                //we are in inc part of array
                start=mid+1;
            }else{
                //we are in dec part of array(arr[mid]>arr[mid+1]
                //now the mid can also be the peak(largest element)so end=mid instead of mid-1
                end=mid;
            }
        }
        //in the end start==end is pointing to the largest number
        //start and end are always trying to find the max element in above 2 checks
        //so when they have only one element remaining it must be the largest element
        return start;
    }
}
