package MyPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class java {

    // 1. Write a Java method to compute the average of three numbers.

    // public static double avg(double a, double b, double c){
    // return (a + b + c)/3;
    // }
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Average of three numbers!!");
    // System.out.println("Enter number n 1");
    // double a = sc.nextDouble();
    // System.out.println("Enter number n 2");
    // double b = sc.nextDouble();
    // System.out.println("Enter number n 3");
    // double c = sc.nextDouble();
    // System.out.println("The avg of three numbers is :"+ avg(a, b, c));

    // }

    // 2.Write a method named isEven that accepts an int argument.The method should
    // return true if the argument is even,or false otherwise.Also write a program
    // to test your method.

    // public static boolean isEven(int n){
    // if (n % 2 == 0) {
    // return true;
    // }else{
    // return false;
    // }
    // }
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter number :");
    // int n = sc.nextInt();
    // if (isEven(n)) {
    // System.out.println("The given number is Even");
    // }else{
    // System.out.println("The given number is odd");
    // }

    // }

    // 3.Write a Java program to check if a number is a palindrome in Java?
    // (121isapalindrome, 321 is not) A number is called a palindrome if the number
    // is equal to the reverse of a numbere
    // .g.,121 is a palindrome because the reverse of 121 is 121 itself.On the
    // otherhand,321 is not a palindrome because the reverse of 321 is 123, which is
    // not equal to 321.
    // public static boolean isPalindrome(int number){
    // int palindrome = number;
    // int reverse = 0;
    // while (number > 0) {
    // int rem = number % 10;//get last digit from number
    // reverse = reverse * 10 + rem; //Build reverse number
    // number = number / 10;//remove last digit form number
    // }

    // if (reverse == palindrome ) {
    // return true;
    // }else{
    // return false;
    // }
    // }
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter a number : ");
    // int number = sc.nextInt();//"sc.nextInt() expects the input to fit within the
    // range of the int data type(-2,147,483,648 to 2,147,483,647). The entered
    // number exceeds Integer.MAX_VALUE (2,147,483,647), so the scanner cannot parse
    // it as an int and throws an InputMismatchException."
    // if (isPalindrome(number)) {
    // System.out.println("The number is palindrome!!");
    // }else{
    // System.out.println("The number is not palindrome!!");
    // }

    // }
    // 4.Write a Java method to compute the sum of the digits in an integer.

    // public static int sumOfdigit(int n){
    // int sum = 0;
    // while ( n > 0) {
    // int lastDigit = n % 10;
    // sum = sum + lastDigit;
    // n = n / 10;
    // }
    // return sum;
    // }
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter digits : ");
    // int digit = sc.nextInt();
    // System.out.println("The sum of digits is : "+ sumOfdigit(digit));
    // }

    // 5)Reverse of an array
    // public static void reverseArr(int numbers[]){
    // int start = 0 ; int last = numbers.length-1 ;
    // while(start<last){
    // int temp = numbers[last];
    // numbers[last] = numbers[start];
    // numbers[start] = temp;
    // start++;
    // last--;
    // }
    // }

    // public static void main (String args[]){
    // int numbers[] = {2,3,5,8,9,15};
    // reverseArr(numbers);
    // //print
    // for(int i = 0; i<numbers.length; i++){
    // System.out.print(numbers[i]+" ");
    // }

    // }

    // 6)find the index on an array

    // public static int LinearSearch(int numbers[],int key){
    // for(int i = 0; i<numbers.length; i++){
    // if(numbers[i]==key){
    // return i;
    // }
    // }
    // return -1;
    // }
    // public static void main (String args[]){
    // int numbers [] ={2,3,4,6,8,2,54,7,1};
    // int key = 54 ;
    // int index = LinearSearch(numbers, key);
    // if(index==-1){
    // System.out.println("index not found");
    // }else{
    // System.err.println("index is :"+index);
    // }

    // }

    // 7)find the largest value in the array

    // public static int LargestValue(int arr[]){
    // int largest = Integer.MIN_VALUE;
    // for(int i = 0; i<arr.length; i++){
    // if(largest<arr[i]){
    // largest = arr[i];
    // }
    // }
    // return largest;
    // }
    // public static void main(String[] args) {
    // int arr[] = {1,2,3,7,5,11};
    // System.out.println("The largest value in the given array
    // is:"+LargestValue(arr));
    // }

    // 8)Majority element in array n-- by brute force approach
    // public static int majorityEl(int arr[]){
    // int n = arr.length;
    // for(int i = 0; i < n; i++){
    // int count = 0;
    // for(int j = 0; j < n; j++){
    // if(arr[i]==arr[j]){
    // count++;
    // }
    // }
    // if (count > n/2) {
    // return arr[i];
    // }
    // }
    // return -1;
    // }
    // public static void main(String[] args) {
    // int arr[] = {1,2,3,2,2,2};
    // System.out.println(majorityEl(arr));
    // }

    // 9) Find the missing number and repeated

    // public static int[] findMissingAndRepeatedValues(int[][] grid) {
    // HashSet<Integer> set = new HashSet<>();
    // int n = grid.length;
    // int sq = n*n;
    // int currSum = 0;
    // int[] ans = new int[2];
    // for(int i = 0; i < n; i++){
    // for(int j = 0; j < n; j++){
    // if(set.contains(grid[i][j])){
    // ans[0] = grid[i][j];
    // }else{
    // set.add(grid[i][j]);
    // currSum+=grid[i][j];
    // }
    // }
    // }
    // int totalSum = sq *(sq+1)/2;
    // ans[1] = totalSum - currSum;
    // return ans;
    // }
    // public static void main(String[] args) {

    // int[][] grid = {
    // {1, 3},
    // {2, 2}
    // };
    // System.out.println(Arrays.toString(findMissingAndRepeatedValues(grid)) );
    // }

    //

    // 10)Merge two sorted array without extra space -- Brute force approach

    // public static void mergeSorted(int arr1[], int arr2[]) {
    // int n = arr1.length;
    // int m = arr2.length;

    // for (int i = 0; i < n; i++) {
    // if (arr1[i] > arr2[0]) {

    // // swap
    // int temp = arr1[i];
    // arr1[i] = arr2[0];
    // arr2[0] = temp;

    // // sort arr2[]
    // Arrays.sort(arr2);
    // }
    // }
    // }

    // public static void main(String[] args) {
    // int arr1[] = { 1, 4, 7, 8 };
    // int arr2[] = { 2, 3, 6, 9 };

    // System.out.println(arr1);
    // System.out.println(Arrays.toString(arr1));
    // mergeSorted(arr1, arr2);
    // System.out.println(arr1);
    // System.out.println(Arrays.toString(arr1));

    // System.out.println("arr1 = " + Arrays.toString(arr1));
    // System.out.println("arr2 = " + Arrays.toString(arr2));

    // }
    // 11)Merge two sorted array without extra space -- Two pointer approach

    // public static void mergeSorted(int arr1[], int arr2[]){
    // int i = arr1.length - 1;
    // int j = 0;

    // while (i >= 0 && j < arr2.length) {

    // if ( arr1[i] > arr2[j]) {

    // //swap
    // int temp = arr1[i];
    // arr1[i] = arr2[j];
    // arr2[j] = temp;

    // i--;
    // j++;
    // }else{
    // break;
    // }
    // }
    // Arrays.sort(arr1);
    // Arrays.sort(arr2);
    // }
    // public static void main(String[] args) {
    // int arr1[] = {1, 4, 7, 8};
    // int arr2[] = {2, 3, 6, 9};

    // mergeSorted(arr1, arr2);

    // }

    // 12) Merger two sorted arrays-- leetcode 88
    // public static void merge(int nums1[], int m, int nums2[], int n){

    // int i = m - 1;
    // int j = n - 1;
    // int k = m + n -1;

    // while (i >= 0 && j >= 0) {
    // if (nums1[i] > nums2[j]) {
    // nums1[k] = nums1[i];
    // i--;
    // }else{
    // nums1[k] = nums2[j];
    // j--;
    // }
    // k--;
    // }

    // while (j >= 0) {
    // nums1[k] = nums2[j];
    // j--;
    // k--;
    // }
    // }
    // public static void main(String[] args) {
    // int nums1[] = {1, 2, 3, 0, 0 ,0};
    // int nums2[] = {2, 5, 6};
    // int m = 3;
    // int n = 3;
    // merge(nums1, m, nums2, n);

    // System.out.println(Arrays.toString(nums1));
    // }

    // 136- single number -- using XOR operator
    // public static int singleNumber(int nums[]) {
    // int n = nums.length;
    // int ans = 0;
    // for (int i = 0; i < n; i++) {
    // ans = ans ^ nums[i];
    // }
    // return ans;
    // }

    // public static void main(String[] args) {
    // int nums[] = { 4, 1, 2, 1, 2 };
    // System.out.println(singleNumber(nums));
    // }

    // pow(x,n) -- Brute force approach -- o(n)-complexity

    // public static double pow(double x, long n) {
    // long power = n;
    // boolean negative = power < 0;
    // if (power == 0) {
    // return 1;
    // } else if (negative) {
    // power = -power;
    // }
    // double result = 1;
    // for (int i = 0; i < power; i++) {
    // result = result * x;
    // }

    // if (negative) {
    // return 1 / result;
    // }

    // return result;
    // }

    // public static void main(String[] args) {
    // double x = 2;
    // int n = 10;
    // System.out.println(pow(x, n));
    // }

    // pow(x,n) - using recursive divide and conquer
    // public static double myPow(double x, long n){
    // long power = n;

    // if (power < 0) {
    // return 1 /pow(x, -power);
    // }
    // return pow(x, power);
    // }

    // public static double pow(double x, long n) {
    // if (n == 0) {
    // return 1;
    // }
    // double half = pow(x, n/2);

    // if (n % 2 == 0) {
    // return half * half;
    // }else{
    // return half * half * x;
    // }
    // }

    // public static void main(String[] args) {
    // double x = 2;
    // long n = 10;
    // System.out.println(myPow(x, n));
    // }

    // Maximum Subarray- 53 - using brute force approach - O(n3)- complexity
    // public static int maxSubArray(int arr[]) {
    // int n = arr.length;
    // int max = Integer.MIN_VALUE;
    // for (int i = 0; i < n; i++) {
    // for (int j = i; j < n; j++) {
    // int sum = 0;
    // for (int k = i; k <= j; k++) {
    // sum += arr[k];
    // max = Math.max(sum, max);
    // }
    // }
    // }
    // return max;
    // }

    // public static void main(String[] args) {
    // int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
    // System.out.println(maxSubArray(arr));
    // }

    // Maximum Subarray - kadane's algorithm --"Should I start a new subarray with
    // this element, or should I add this element to my existing subarray?"
    // public static int maxSubArrays(int arr[]){
    //     int n = arr.length;
    //     int currSum = arr[0];
    //     int maxSum = arr[0];

    //     for(int i = 1; i < n; i++){
    //         currSum = Math.max(arr[i], currSum + arr[i]);
    //         maxSum = Math.max(maxSum, currSum);
    //     }

    //     return maxSum;

    // }

    // public static void main(String[] args) {
    //     int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
    //     System.out.println(maxSubArrays(arr));
    // }
}