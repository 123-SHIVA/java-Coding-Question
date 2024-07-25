package BinarySearch;

//this is the code for modified binary search
public class FindTarget {
    
    public static void main(String[] args) {
        int arr[]={5,8,11,20,25,27,30,34,39};
        int target=27;
        int res=findTarget(arr,target);
        System.out.println(res);
  
    } 

    static int findTarget(int arr[],int target){
          
        int start=0;
        int end=arr.length-1;

        while(start<=end){
           // int mid=(start+end)/2;//it may be exceed the range of integer that why we do not use this now
              int mid=start+(end-start)/2;
              if(target<arr[mid]){
                end=mid-1;
              }else if(target>arr[mid]){
                start=mid+1;
              }else{
                return mid;
              }
        }

        return -1;
    }
}
