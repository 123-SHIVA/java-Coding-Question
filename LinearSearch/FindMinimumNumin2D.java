package LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinimumNumin2D {

    static int findMin(int arr[][]){
        int min=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]<min){
                       min=arr[i][j];
                }
             }  
         }
         return min;
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
            
           int res = findMin(arr);
          System.out.println(res);
    }
}
