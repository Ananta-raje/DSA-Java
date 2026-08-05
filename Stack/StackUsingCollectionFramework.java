package Stack;
import java.util.*;

public class StackUsingCollectionFramework {

    //insert an element at the bottom of the stack
    // public static void pushAtBottom(Stack <Integer> s, int data){

    //     //Base case
    //     if (s.isEmpty()) {
    //         s.push(40);
    //         return;
    //     }
    //     int top = s.pop();
    //     pushAtBottom(s, data);
    //     s.push(top);
    // }
    // public static void main(String[] args) {
    //     Stack <Integer> s = new Stack<>(); // This is the built-in java's stack class
    //     s.push(10);
    //     s.push(20);
    //     s.push(30);
        
    //     pushAtBottom(s , 40);
    //     System.out.println(s);
    //     while (!s.isEmpty()) {
    //         System.out.println(s.pop());
    //     }
         
    //   }

    //reverse a string using a Stack
    public static String reverseString(String str){
        Stack <Character> s = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++; 
        }
       
        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    
    }
    public static void main(String[] args) {
        String str = "abc";
        String result = reverseString(str);
        System.out.println(result);

        
    }
}
