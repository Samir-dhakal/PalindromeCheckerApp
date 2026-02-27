import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {

    /**
     * Application entry point
     * This is the first method executed by the JVM
     *when the program starts.
     * * @param args command-line arguments
     * @author samir dhakal
     * @version 1.0

     */
    public static void main(String[] args) {


        String orginalString = "saere";
        Stack<Character> sta = new Stack<>();
        Queue<Character> cha=new LinkedList<>() ;

        for (char c : orginalString.toCharArray()) {
            sta.push(c);
            cha.add(c);
        }
        while(!sta.empty()) {
            if (cha.remove() != sta.pop()) {
                System.out.println(" The given string " + orginalString + " is not palindrome ");
                return;
            }

        }
        System.out.println(" The given string " + orginalString + " is  palindrome ");

    }
}