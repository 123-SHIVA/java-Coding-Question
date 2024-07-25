package LinearSearch.LeetCodeque;


//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/1331042642/

public class Que1 {
    public static void main(String[] args) {
        int nums[]={12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }


    static int findNumbers(int nums[]){
        int count=0;
       for(int num:nums){
       if(even(num))
            count++;
       }
      return count;
    }

    // check number is even or not
  static boolean even(int num){
      int numOfDigits=digits(num);
      return numOfDigits%2==0;
  }


  //count the number of digits
  static int digits(int num){
      int count=0;

       if(num<0){
        return num*-1;
       }

       if(num==0){
        return 1;
       }

       while(num>0){
        num=num/10;
        count++;
       }

   return count;
  }


}
