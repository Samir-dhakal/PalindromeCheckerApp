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

        System.out.println("welcome to palindrom Checker Management System");
        System.out.println("version :1.0");
        System.out.println("System initialized successfully ");
      Scanner input = new Scanner(System.in);

        String str=new String("hafrdh");
        for( int i =0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i))
            {  System.out.println("The string  not the plindrome");
                return ;}
        }
        System.out.println(" the string is palindrome ");


    }
}