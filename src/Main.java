//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int target=5;
       int[] arr={1,2,5,2,3};
       int result= LinearSearch(target,arr);
     System.out.println("result: "+result);
    }
    static int LinearSearch(int target, int[] arr){
        if(arr.length==0){
            return -1;
        }

        for(int element : arr){
               if(element==target){
                   return element;
               }
        }
        return -1;
}}