package BinarySearch;

public class orderAgonosticBinarySearch {
    public static void main(String[]args){
        int[] arr={8,8,8,8,8,8,8};
        int target=4;
        System.out.println(orderAgonisticBS(arr,target));
    }
    static int orderAgonisticBS(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        boolean isAsc=arr[start]<arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target)return mid;
            if(isAsc){
               if(target<arr[mid]){
                   end=mid-1;
               }
               else{
                   start=mid+1;
               }
            }
            else{
                if(target<arr[mid]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }

        }
return -1;
    }

}
