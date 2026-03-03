import java.util.*;

//class LinkedList{
//    Node head= null;
//    class Node{
//        char data;
//        Node next;
//        public  Node(char data){
//            this.data = data;
//            this.next=null;
//        }
//
//    }
//    public void add(char data){
//        Node newNode = new Node(data);
//        if(head==null){
//            head=newNode;
//            return;
//        }
//        Node currNode=head;
//        while(currNode.next!=null){
//            currNode=currNode.next;
//        }
//        currNode=newNode;
//    }
//    public void printAll(){
//        Node currNode=head;
//        while(currNode!=null){
//            System.out.print(currNode.data+" ");
//            currNode=currNode.next;
//        }
//    }
//
//
//
//}
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


        String orginalString = "mottom";
        List<Character> list= new LinkedList<>();
//        LinkedList list = new LinkedList();
//
//
//
for(char c : orginalString.toCharArray()) {
    list.add(c);
}
//list.printAll();

        while(!list.isEmpty()) {
            if (list.removeFirst()!=list.removeLast()) {
                System.out.println(" The given string " + orginalString + " is not palindrome ");
                return;
            }
            if(list.size()==1)
                break;

        }
        System.out.println(" The given string " + orginalString + " is  palindrome ");

    }
}