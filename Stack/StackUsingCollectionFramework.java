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
    // public static String reverseString(String str){
    //     Stack <Character> s = new Stack<>();
    //     int idx = 0;
    //     while (idx < str.length()) {
    //         s.push(str.charAt(idx));
    //         idx++; 
    //     }
       
    //     StringBuilder result = new StringBuilder("");
    //     while (!s.isEmpty()) {
    //         char curr = s.pop();
    //         result.append(curr);
    //     }
    //     return result.toString();
    
    // }
    // public static void main(String[] args) {
    //     String str = "abc";
    //     String result = reverseString(str);
    //     System.out.println(result);

        
    //}

    //Next greater element-- Right
    // public static void main(String[] args) {
    //     int arr[] = {6, 8, 0, 1, 3};
    //     Stack <Integer> s = new Stack<>();
    //     int nxtGreater[] = new int[arr.length];

    //      for(int i = arr.length-1; i >= 0; i--){
    //         while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
    //             s.pop();
    //         }

    //         if (s.isEmpty()) {
    //             nxtGreater[i] = -1;
    //         }else{
    //             nxtGreater[i] = arr[s.peek()];
    //         }

    //         s.push(i);
    //      }
    //      for(int i = 0; i < nxtGreater.length; i++){
    //      System.out.print(nxtGreater[i]+" ");
    //      }
    //      System.out.println();

         //next Greater Right
         //next Greater Left
         //next smaller Right
         //next Smaller left

    
    
    //     }
    // }
    //Valid parenthesis
        // public static boolean isValid(String str){
        // Stack <Character> s = new Stack<>();

        //     for(int i = 0; i < str.length(); i++){
        //         char ch = str.charAt(i);
        //         //opening
        //         if (ch == '(' || ch == '{' || ch == '[') {
        //             s.push(ch);
        //         }else{      //closing
        //         if (s.isEmpty()) {
        //             return false;
        //         }
        //         if ((s.peek() == '(' && ch == ')')||
        //                 (s.peek() =='{' && ch == '}')||
        //                 (s.peek() == '[' && ch == ']') ){
        //                 s.pop();
        //         } else {
        //             return false;
        //         }
        //         }
        //     }
        //     if (s.isEmpty()) {
        //         return true;
        //     }else{
        //         return false;
        //     }
        // }
        // //Valid parenthesis
        // public static void main(String[] args) {
        //     String str = "[())]";//true
        //     System.out.println(isValid(str));

        // }     
    
}

