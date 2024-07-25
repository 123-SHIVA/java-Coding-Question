package LinearSearch;

import java.util.Scanner;

public class FindMaximumin2D {

    static int findMax(int arr[][]){
        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max){
                       max=arr[i][j];
                }
             }  
         }
         return max;
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
         
        int res = findMax(arr);
       System.out.println(res);

    }
}
