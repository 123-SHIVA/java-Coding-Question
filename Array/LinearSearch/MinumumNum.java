package LinearSearch;

import java.util.Scanner;

public class MinumumNum {

    public static int findMinNum(int arr[]){

        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           int arr[]=new int[n];

           for(int i=0;i<arr.length;i++){
               arr[i]=sc.nextInt();  
           }

          int res= findMinNum(arr);
          System.out.println(res);
    }
}
