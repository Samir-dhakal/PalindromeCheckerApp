import java.util.Scanner;

public class PalindromeCheckerApp {

    /**
     * Application entry point
     * This is the first method executed by the JVM
     *when the program starts.
     * * @param args command-line arguments
     * @author samir dhakal
     * @version 1.0

     */
    public static void main(String[] args){


        String orginalString="samir";
      char[] arr=orginalString.toCharArray();
      int start=0;
      int end =arr.length-1;
      while(start<=end){
          if(arr[start++]!=arr[end--]){
              System.out.println(" the given string "+ orginalString+" is not palidrome ");
              return ;
          }
      }
        System.out.println(" the given string "+orginalString +" is palindrome ");
    }



}