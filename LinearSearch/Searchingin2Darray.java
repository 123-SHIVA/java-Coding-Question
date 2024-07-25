package LinearSearch;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Searchingin2Darray {

    static int[] searchTarget(int arr[][],int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
             if(arr[i][j]==target){
                return new int[]{i,j};
             }
            }  
         
        }
        return null;
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           int m=sc.nextInt();
           int arr[][]=new int[n][m];
           
           for(int i=0;i<arr.length;i++){
               for(int j=0;j<arr[i].length;j++){
                   arr[i][j]=sc.nextInt();
                }  
            }
            
           int target=sc.nextInt();
           int[] res = searchTarget(arr, target);
          System.out.println(Arrays.toString(res));
    }
}
