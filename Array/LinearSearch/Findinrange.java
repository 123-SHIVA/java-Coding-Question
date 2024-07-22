package LinearSearch;

import java.util.Scanner;

public class Findinrange {

   static int findTargetValue(int arr[],int target,int start,int end){
            if(arr.length==0){
                return -1;
            }

            for (int i = start; i < end; i++) {
                if(target==arr[i]){
                    return i;
                }
            }
            return -1;
    }
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           int arr[]=new int[n];

           for(int i=0;i<arr.length;i++){
               arr[i]=sc.nextInt();  
           }
             
           System.out.println("enter the starting value");
           int start=sc.nextInt();
           System.out.println("enter the ending value");
           int end=sc.nextInt();
           int target=sc.nextInt();
           int res=findTargetValue(arr,target,start,end);
           System.out.println(res);
    }
}
