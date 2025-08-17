package BinarySearch;

public class InfiniteArray {
    public static void main(String[]args){
        int[] arr = {1, 4, 6, 7, 32, 43, 45, 91};
        int target = 1;
        System.out.println(ans(arr,target));
    }
    static int ans(int[]arr,int target){
        //find the range
        //lets set the fist window size as 2
        int start=0;
        int end=1;
        while(target>arr[end]){
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
        return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int[]arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else {return mid;}
        }
        return -1;
    }
}
