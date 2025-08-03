package LinearSearch;

public class RichestCustomerWealth {
    public static void main(String[]args){
int[][] accounts={{1,5},{7,3},{3,5}};
System.out.println(findRichestCustomerWealth(accounts));
    }
    static int findRichestCustomerWealth(int[][]arr){
        int maxWealth=0;
for(int person=0;person<arr.length;person++){
    int wealth=0;
    for(int account=0;account<arr[person].length;account++){
        wealth+=arr[person][account];
    }
    if(wealth>maxWealth){
        maxWealth=wealth;
    }
}return maxWealth;
    }

}
