package Stack;

import java.util.*;

public class StackUsingCollectionFramework {

     // insert an element at the bottom of the stack
     // public static void pushAtBottom(Stack <Integer> s, int data){

     // //Base case
     // if (s.isEmpty()) {
     // s.push(data);
     // return;
     // }
     // int top = s.pop();
     // pushAtBottom(s, data);
     // s.push(top);
     // }
     // public static void main(String[] args) {
     // Stack <Integer> s = new Stack<>(); // This is the built-in java's stack class
     // s.push(10);
     // s.push(20);
     // s.push(30);

     // pushAtBottom(s , 40);
     // System.out.println(s);
     // while (!s.isEmpty()) {
     // System.out.println(s.pop());
     // }

     // }

     // reverse a string using a Stack
     // public static String reverseString(String str){
     // Stack <Character> s = new Stack<>();
     // int idx = 0;
     // while (idx < str.length()) {
     // s.push(str.charAt(idx));
     // idx++;
     // }

     // StringBuilder result = new StringBuilder("");
     // while (!s.isEmpty()) {
     // char curr = s.pop();
     // result.append(curr);
     // }

     // return result.toString();

     // }
     // public static void main(String[] args) {
     // String str = "abc";
     // String result = reverseString(str);
     // System.out.println(result);

     // }

     // Next greater element-- Right
     // public static void main(String[] args) {
     // int arr[] = {6, 8, 0, 1, 3};
     // Stack <Integer> s = new Stack<>();
     // int nxtGreater[] = new int[arr.length];

     // for(int i = arr.length-1; i >= 0; i--){
     // while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
     // s.pop();
     // }

     // if (s.isEmpty()) {
     // nxtGreater[i] = -1;
     // }else{
     // nxtGreater[i] = arr[s.peek()];
     // }

     // s.push(i);
     // }
     // for(int i = 0; i < nxtGreater.length; i++){
     // System.out.print(nxtGreater[i]+" ");
     // }
     // System.out.println();

     // next Greater Right
     // next Greater Left
     // next smaller Right
     // next Smaller left

     // }
     // }
     // Valid parenthesis
     // public static boolean isValid(String str){
     // Stack <Character> s = new Stack<>();

     // for(int i = 0; i < str.length(); i++){
     // char ch = str.charAt(i);
     // //opening
     // if (ch == '(' || ch == '{' || ch == '[') {
     // s.push(ch);
     // }else{ //closing
     // if (s.isEmpty()) {
     // return false;
     // }
     // if ((s.peek() == '(' && ch == ')')||
     // (s.peek() =='{' && ch == '}')||
     // (s.peek() == '[' && ch == ']') ){
     // s.pop();
     // } else {
     // return false;
     // }
     // }
     // }
     // if (s.isEmpty()) {
     // return true;
     // }else{
     // return false;
     // }
     // }
     // //Valid parenthesis
     // public static void main(String[] args) {
     // String str = "[((()))]";//true
     // System.out.println(isValid(str));

     // }

     // Duplicate parenthesis

     // public static boolean isDuplicate(String str){
     // Stack <Character> s = new Stack<>();

     // for(int i = 0; i < str.length(); i++){
     // char ch = str.charAt(i);
     // //closing
     // if (ch == ')') {
     // int count = 0;
     // while (s.peek() != '(') {
     // s.pop();
     // count++;
     // }
     // if (count < 1) {
     // return true; //duplicate
     // } else {
     // s.pop(); // opening pair
     // }
     // }else{
     // //opening
     // s.push(ch);
     // }
     // }
     // return false;
     // }
     // public static void main(String[] args) {
     // String str = "((a + b))";
     // System.out.println(isDuplicate(str));

     // }

     // max area histogram

     // public static void maxArea(int[] arr) {
     //      int maxArea = 0;

     //      int nsr[] = new int[arr.length];
     //      int nsl[] = new int[arr.length];

     //      //Next smaller right
     //      Stack<Integer> s = new Stack<>();

     //      for(int i = arr.length - 1; i >= 0; i--){
     //           while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
     //                s.pop(); 
     //           }
     //           if (s.isEmpty()) {
     //                nsr[i] = arr.length;
     //           }else{
     //                nsr[i] = s.peek();
     //           }
     //           s.push(i);
     //      }

     //      //Next smaller left
     //      s = new Stack<>();//clear stack

     //      for(int  i = 0; i < arr.length ; i++){
     //           while (!s.empty() && arr[s.peek()] >= arr[i]) {
     //                s.pop();
     //           }

     //           if (s.isEmpty()) {
     //                nsl[i] = -1;
     //           }else{
     //                nsl[i] = s.peek();
     //           }
     //           s.push(i);
     //      }

     //      //Current area : width = j-i-1 = nsr[i] - nsl[i] - 1
     //      for(int i = 0; i< arr.length; i++){
     //           int height = arr[i];
     //           int width = nsr[i] - nsl[i] - 1;
     //           int currArea = height * width;
     //           maxArea = Math.max(currArea, maxArea);

     //      }

     //      System.out.println("Max area in histogram = " + maxArea);
     // }

     // public static void main(String[] args) {
     //      int[] arr = { 2, 1, 5, 6, 2, 3 };

     //      maxArea(arr);
     // }

}
