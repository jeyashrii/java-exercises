public class EvenDigits {
    public static void main(String[]args){
       // int[] arr={123,4,45,6789,012};
        //012 is octal-->decimal equivalent=10 so no of digits=2
        int[] arr={123,4,45,6789,12};
        System.out.println(findEvenDigits(arr));

    }
    static int findEvenDigits(int[] arr){
        int count=0;
        for(int i:arr){
            if(even(i)){
                count++;
            }
        }
        return count;
    }

    //function to check if a number has even digits
    static boolean even(int i){
        return findDigits(i)%2==0;
    }

    //function to find number of digits in a number
    static int findDigits(int num){
        //handle i=0 edge case
        if(num==0)return 1;
        //handle negative numbers
        num=Math.abs(num);
        int count=0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }

}
