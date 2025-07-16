public class searchInRange {
    public static void main(String[]args){
        int[] arr={3,5,6,4,9,6};
        int target=77;
        System.out.println(search( arr,target,0,3));
    }
    static int search(int[] arr,int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for(int index=start;index<=end;index++){
            if(arr[index]==target) return index;
        }
        return -1;
    }
}
