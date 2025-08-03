package LinearSearch;

public class FindMin {
    public static void main(String[]args){
        int[] arr={1,4,5,-7,9,0};
        System.out.println(min(arr));
    }
    //assume arr.length!=0
    //return the minimum value in the array
        static int min(int[] arr){
        int minimum=arr[0];
            for(int i=0;i<arr.length;i++){
                if(arr[i]<minimum){
                    minimum=arr[i];
                }
            }
            return minimum;
        }


}
