package LinearSearch;

import java.util.Scanner;

public class FindElement {

    static int findTargetValue(int arr[],int target){
       if(arr.length==0){
        return -1;
       }

        for (int i = 0; i < arr.length; i++) {
            int element=arr[i];
            if(element==target){
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

           int target=sc.nextInt();
           int res=findTargetValue(arr,target);
           System.out.println(res);
           
    }
}
