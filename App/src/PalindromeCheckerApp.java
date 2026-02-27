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
        String orginalString="samir";
        String reversedString="";
        for(int i=orginalString.length()-1;i>=0;i--){
            reversedString += orginalString.charAt(i);
        }
        if (orginalString.equals(reversedString)) {
            System.out.println(orginalString+ " is palindrome ");
        }
        else
            System.out.println(orginalString+ " is not palindrome");
    }



}