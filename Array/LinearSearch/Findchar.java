package LinearSearch;

import java.util.Scanner;

public class Findchar {

    //this function is checking character is present or not present inside the string
       static boolean findChar(String name,char target){
        if(name.length()==0){
            return false;
        }

        for (int i = 0; i < name.length(); i++) {
            if(target==name.charAt(i)){
                return true;
            }
        }
        return false;
       }

       
    //this function is checking character is present or not present inside the string
    static boolean findChar2(String name,char target){
        if(name.length()==0){
            return false;
        }
             //toCharArray() is used to convert the character into array
              for (char ch : name.toCharArray()) {
                    if(ch==target){
                        return true;
                    }
              }
        return false;
       }

         

    public static void main(String[] args) {

         Scanner sc=new Scanner(System.in);
         String name=sc.nextLine();
         char target=sc.next().charAt(0); 

         //printing the function
        //  boolean res=findChar( name , target);
        boolean res=findChar2( name , target);
         System.out.println(res);
    }
}
