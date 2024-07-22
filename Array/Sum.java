import java.util.Scanner;

public class Sum {

     public static int sumArray(int arr[],int sum){
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];  
        }
        return sum;
     }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();  
        }

        int sum=0;
        int res=sumArray(arr, sum);
        System.out.println(res);

    }
}
