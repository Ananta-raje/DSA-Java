package MyPractice;

import java.util.Scanner;

public class java {

   //1. Write a Java method to compute the average of three numbers.

        // public static double avg(double a, double b, double c){
        // return (a + b + c)/3;
        // }
        // public static void main(String[] args) {
        //     Scanner sc = new Scanner(System.in);
        //     System.out.println("Average of three numbers!!");
        //     System.out.println("Enter number n 1");
        //     double a = sc.nextDouble();
        //     System.out.println("Enter number n 2");
        //     double b = sc.nextDouble();
        //     System.out.println("Enter number n 3");
        //     double c = sc.nextDouble();
        //     System.out.println("The avg of three numbers is :"+ avg(a, b, c));

        // }

    //2.Write a method named isEven that accepts an int argument.The method should return true if the argument is even,or false otherwise.Also write a program to test your method.    
         
        // public static boolean isEven(int n){
        //     if (n % 2 == 0) {
        //         return true;
        //     }else{
        //         return false;
        //     }
        // }
        // public static void main(String[] args) {
        //     Scanner sc = new Scanner(System.in);
        //     System.out.print("Enter number :");
        //     int n = sc.nextInt();
        //     if (isEven(n)) {
        //         System.out.println("The given number is Even");
        //     }else{
        //         System.out.println("The given number is odd");
        //     }
            
        // }
   
    //3.Write a Java program to check if a number is a palindrome in Java?
    // (121isapalindrome, 321 is not) A number is called a palindrome if the number is equal to the reverse of a numbere 
    // .g.,121 is a palindrome because the reverse of 121 is 121 itself.On the otherhand,321 is not a palindrome because the reverse of 321 is 123, which is not equal to 321.
        //  public static boolean isPalindrome(int number){
        //   int palindrome = number;
        //   int reverse = 0;
        //   while (number > 0) {
        //     int rem = number % 10;//get last digit from number
        //     reverse = reverse * 10 + rem; //Build reverse number 
        //     number = number / 10;//remove last digit form number 
        //   }

        //   if (reverse == palindrome ) {
        //     return true;
        //   }else{
        //     return false;
        //   }
        //  }
        //  public static void main(String[] args) {
        //     Scanner sc = new Scanner(System.in);
        //     System.out.print("Enter a number : ");
        //     int number = sc.nextInt();//"sc.nextInt() expects the input to fit within the range of the int data type(-2,147,483,648 to 2,147,483,647). The entered number exceeds Integer.MAX_VALUE (2,147,483,647), so the scanner cannot parse it as an int and throws an InputMismatchException."
        //     if (isPalindrome(number)) {
        //         System.out.println("The number is palindrome!!");
        //     }else{
        //         System.out.println("The number is not palindrome!!");
        //     }
            
        //  }
   //4.Write a Java method to compute the sum of the digits in an integer.

        // public static int sumOfdigit(int n){
        // int sum = 0;
        // while ( n > 0) {
        //     int lastDigit = n % 10;
        //     sum = sum + lastDigit;
        //     n = n / 10;
        // }
        // return sum;
        // }
        // public static void main(String[] args) {
        //     Scanner sc = new Scanner(System.in);
        //     System.out.print("Enter digits : ");
        //     int digit = sc.nextInt();
        //     System.out.println("The sum of digits is : "+ sumOfdigit(digit));
        // }

//Reverse of an array
    // public static void reverseArr(int numbers[]){
    //     int start  = 0 ; int last = numbers.length-1 ;
    //     while(start<last){
    //         int temp = numbers[last];
    //         numbers[last] = numbers[start];
    //         numbers[start] =  temp;
    //         start++;
    //         last--;
    //     }
    // }

    // public static void main (String args[]){
    //     int numbers[] = {2,3,5,8,9,15};
    //     reverseArr(numbers);
    //     //print
    //     for(int i = 0; i<numbers.length; i++){
    //         System.out.print(numbers[i]+" ");
    //     }

    // }

// find the index on an array

//    public static int LinearSearch(int numbers[],int key){
//       for(int i = 0; i<numbers.length; i++){
//         if(numbers[i]==key){
//             return i;
//         }
//       }
//       return -1;
//    }
//     public static void main (String args[]){
//         int numbers [] ={2,3,4,6,8,2,54,7,1};
//         int key = 54 ;
//         int index = LinearSearch(numbers, key);
//         if(index==-1){
//             System.out.println("index not found");
//         }else{
//             System.err.println("index is :"+index);
//         }
        
//     }

// find the largest value in the array

//   public static int LargestValue(int arr[]){
//     int largest = Integer.MIN_VALUE;
//     for(int i = 0; i<arr.length; i++){
//         if(largest<arr[i]){
//             largest = arr[i];
//         }
//     }
//     return largest;
//   }
//   public static void main(String[] args) {
//     int arr[] = {1,2,3,7,5,11};
//     System.out.println("The largest value in the given array is:"+LargestValue(arr));
//   }

//Majority element in array n-- by brute force approach
//  public static int majorityEl(int arr[]){
//  int n = arr.length;
//  for(int i = 0; i < n; i++){
//     int count = 0;
//   for(int j = 0; j < n; j++){
//     if(arr[i]==arr[j]){
//       count++;
//     }
//   }
//   if (count > n/2) {
//     return  arr[i];
//   }
//  }
//  return -1;
//  }
//  public static void main(String[] args) {
//     int arr[] = {1,2,3,2,2,2};
//     System.out.println(majorityEl(arr));
//  }

}