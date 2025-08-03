package LinearSearch;

import java.util.Arrays;

public class searchInStrings {
    public static void main(String[]args){
        String name="jeyashri";
        char target='y';
        System.out.println(search( name,target));
        System.out.println(name.toCharArray());
        System.out.println(Arrays.toString(name.toCharArray()));
        char[] arrays={'d','s'};
        System.out.println(Arrays.toString(arrays));


    }

    static boolean search(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(char ch :str.toCharArray()){
            if(ch==target) return true;
        }
        return false;
    }
}
