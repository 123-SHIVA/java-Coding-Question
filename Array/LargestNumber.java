import java.util.Scanner;

public class LargestNumber {

  public static int findLargestNum(int arr[]){
    int largest=arr[0];
    for(int i=0;i<arr.length;i++){
        if(arr[i]>largest){
            largest=arr[i];
        }
    }
    return largest;
  }

    public static void main(String[] args) {

         Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           int arr[]=new int[n];

           for(int i=0;i<arr.length;i++){
               arr[i]=sc.nextInt();  
           }

          int res= findLargestNum(arr);
          System.out.println(res);
    }
}
