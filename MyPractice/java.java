package MyPractice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

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

    // 13) 136- single number -- using XOR operator
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

    // 14) pow(x,n) -- Brute force approach -- o(n)-complexity

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

    // 15) pow(x,n) - using recursive divide and conquer
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

    // 16) Maximum Subarray- 53 - using brute force approach - O(n3)- complexity
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

    // 17) Maximum Subarray - kadane's algorithm --"Should I start a new subarray
    // with
    // this element, or should I add this element to my existing subarray?"
    // public static int maxSubArrays(int arr[]){
    // int n = arr.length;
    // int currSum = arr[0];
    // int maxSum = arr[0];

    // for(int i = 1; i < n; i++){
    // currSum = Math.max(arr[i], currSum + arr[i]);
    // maxSum = Math.max(maxSum, currSum);
    // }

    // return maxSum;

    // }

    // public static void main(String[] args) {
    // int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
    // System.out.println(maxSubArrays(arr));
    // }

    // 18) Container with the most water
    // public static int maxArea(int[] height) {
    // int left = 0, right = height.length - 1;
    // int maxArea = 0;

    // while (left < right) {
    // int ht = Math.min(height[left], height[right]);
    // int wt = right - left;
    // maxArea = Math.max(maxArea, ht * wt);

    // if (height[left] < height[right]) {
    // left++;
    // } else {
    // right--;
    // }
    // }

    // return maxArea;
    // }

    // public static void main(String[] args) {
    // int height [] = {1,8,6,2,5,4,8,3,7};
    // System.out.println(maxArea(height));
    // }

    // 19) sort color problem - 75 - using counting approach - easy way -TC - O(n)
    // SC-O(1)

    // 20) 3 sum problem using brute force approach--TC=O(n3) --- but it can take
    // duplicates values

    // public static List<List<Integer>> threeSum(int nums[]) {
    // List<List<Integer>> result = new ArrayList<>();

    // for (int i = 0; i < nums.length; i++) {
    // for (int j = i + 1; j < nums.length; j++) {
    // for (int k = j + 1; k < nums.length; k++) {

    // if (nums[i] + nums[j] + nums[k] == 0) {
    // List<Integer> triplets = new ArrayList<Integer>();
    // triplets.add(nums[i]);
    // triplets.add(nums[j]);
    // triplets.add(nums[k]);

    // result.add(triplets);
    // }
    // }
    // }
    // }
    // return result;
    // }

    // public static void main(String[] args) {
    // int nums[] = { -1, 0, 1, 2, -1, -4 };
    // System.out.println(threeSum(nums));
    // }

    // 21) 3sum problem using optimized approach -- that remove duplicates
    // public static List<List<Integer>> threeSum(int nums[]) {
    // List<List<Integer>> result = new ArrayList<List<Integer>>();

    // // sort
    // Arrays.sort(nums);
    // for (int i = 0; i < nums.length - 2; i++) {
    // if (i > 0 && nums[i] == nums[i - 1]) {
    // continue;
    // }

    // int left = i + 1;
    // int right = nums.length -1;

    // while (left < right) {
    // int sum = nums[i] + nums[left] + nums[right];

    // if (sum == 0) {
    // List<Integer> triplets = new ArrayList<Integer>();

    // triplets.add(nums[i]);
    // triplets.add(nums[left]);
    // triplets.add(nums[right]);

    // result.add(triplets);

    // //remove duplicates
    // while(left < right && nums[left] == nums[left+1]){
    // left++;
    // }

    // //remove duplicates
    // while (left < right && nums[right] == nums[right - 1]) {
    // right--;
    // }

    // left++;
    // right--;

    // }else if (sum < 0) {
    // left++;
    // }else{
    // right--;
    // }
    // }
    // }
    // return result;
    // }

    // public static void main(String[] args) {
    // int nums[] = { -1, 0, 1, 2, -1, -4 };
    // System.out.println(threeSum(nums));

    // }

    // 22) Interleave two half of a queue(even length)
    // public static Queue<Integer> interLeave(Queue<Integer> q) {
    // Queue<Integer> q2 = new LinkedList<Integer>();
    // int size = q.size();
    // for (int i = 0; i < size / 2; i++) {
    // q2.add(q.remove());
    // }
    // while (!q2.isEmpty()) {
    // q.add(q2.remove());
    // q.add(q.remove());
    // }
    // return q;
    // }

    // public static void main(String[] args) {
    // Queue<Integer> q = new LinkedList<Integer>();
    // q.add(1);
    // q.add(2);
    // q.add(3);
    // q.add(4);
    // q.add(5);
    // q.add(6);
    // q.add(7);
    // q.add(8);
    // q.add(9);
    // q.add(10);

    // System.out.println(interLeave(q));
    // }

    // 23) Difference betn queue and stack
    // public static void main(String[] args) {
    // Queue<Integer> q = new LinkedList<Integer>();
    // q.add(1);
    // q.add(2);
    // q.add(3);
    // q.add(4);
    // q.add(5);

    // System.out.println(q);
    // q.remove();
    // System.out.println(q);

    // Stack<Integer> s = new Stack<>();
    // s.add(1);
    // s.add(2);
    // System.out.println(s);
    // s.pop();
    // System.out.println(s);

    // }

    // 24) Queue reversal

    // public static Queue<Integer> reversal(Queue<Integer> q) {
    // Stack<Integer> s = new Stack<Integer>();
    // int size = q.size();

    // for(int i = 0; i < size; i++ ){
    // s.add(q.remove());
    // }
    // while (!s.isEmpty()) {
    // q.add(s.pop());
    // }
    // return q;
    // }

    // public static void main(String[] args) {
    // Queue<Integer> q = new LinkedList<Integer>();
    // q.add(1);
    // q.add(2);
    // q.add(3);
    // q.add(4);
    // q.add(5);

    // System.out.println(reversal(q));
    // }

    // 25) search in a 2D matrix -- by brute force approach --TC- O(n*m) and SC-
    // O(1)

    // public static boolean SearchInTwoD(int matrix[][], int target) {
    // for(int i = 0; i < matrix.length; i++){
    // for(int j = 0; j < matrix[i].length; j++){
    // if (target == matrix[i][j]) {
    // return true;
    // }
    // }
    // }
    // return false;
    // }

    // public static void main(String[] args) {
    // int matrix[][] = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
    // int target = 26;
    // System.out.println(SearchInTwoD(matrix, target));
    // }

    // 26) search in 2D matrix by optimized method -TC = O(log(n*m)) SC = O(1)

    // public static boolean SearchInTwoD(int matrix[][], int target){
    // int n = matrix.length;
    // int m = matrix[0].length;

    // int left = 0;
    // int right = n * m - 1;

    // while (left <= right) {
    // int mid = left + (right - left) / 2;
    // int row = mid / m;
    // int col = mid % m;

    // if (matrix[row][col] == target) {
    // return true;
    // }else if (matrix[row][col] < target) {
    // left = mid + 1;
    // }else{
    // right = mid - 1;
    // }
    // }
    // return false;
    // }
    // public static void main(String[] args) {
    // int matrix[][] = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
    // int target = 26;
    // System.out.println(SearchInTwoD(matrix, target));
    // }

    // 27) next greater element from an array

    // public static int[] nextGreater(int arr[]) {
    // int n = arr.length;
    // int ans[] = new int[arr.length];
    // Arrays.fill(ans, -1);
    // for (int i = 0; i < n; i++) {
    // for (int j = i + 1; j < n; j++) {
    // if (arr[j] > arr[i]) {
    // ans[i] = arr[j];
    // break;
    // }

    // }

    // }
    // return ans;
    // }

    // public static void main(String[] args) {
    // int arr[] = { 22, 4, 2, 5, 3, 12 };
    // System.out.println(Arrays.toString(nextGreater(arr)));

    // }

    // 28) Next greater element I - leetcode 496 -- by brute force approach --

    // public static int[] nextGreater(int num1[], int num2[]){
    // int ans [] = new int[num1.length];

    // for(int i = 0; i < num1.length; i++){
    // int element = num1[i];
    // ans[i] = -1;
    // for(int j = 0; j < num2.length; j++){

    // if (num2[j] == element) {
    // for(int k = j + 1; k < num2.length; k++){
    // if (num2[k] > element) {
    // ans[i] = num2[k];
    // break;
    // }
    // }
    // break;
    // }
    // }

    // }
    // return ans;
    // }
    // public static void main(String[] args) {
    // int nums1[] = {1, 3, 4};
    // int nums2[] = {1, 2, 3, 4, 6};

    // System.out.println(Arrays.toString(nextGreater(nums1, nums2)));

    // }

    // Next greater element --O(n) -- monotonic solution -O(N)

    // public static int[] nextGreater(int nums2[]) {
    // Stack<Integer> helperStack = new Stack<Integer>();
    // int ans[] = new int[nums2.length];
    // for (int i = nums2.length - 1; i >= 0; i--) {
    // int element = nums2[i];
    // if (helperStack.isEmpty()) {
    // helperStack.push(element);
    // ans[i] = -1;
    // continue;
    // }

    // if (helperStack.peek() > element) {
    // ans[i] = helperStack.peek();
    // helperStack.push(element);
    // continue;
    // }

    // while (!helperStack.isEmpty() && helperStack.peek() <= element) {
    // helperStack.pop();
    // }

    // if (helperStack.isEmpty()) {
    // ans[i] = -1;
    // } else {
    // ans[i] = helperStack.peek();
    // }

    // helperStack.push(element);
    // }
    // return ans;
    // }

    // public static void main(String[] args) {
    // int nums2[] = { 1, 3, 4, 1, 2 };
    // System.out.println(Arrays.toString(nextGreater(nums2)));
    // }

    // Sunday leetcode revision - 23-08-2026
    // 29)print Squares of a sorted array - 977 - Brute force approach - TC= O(n log
    // n)

    // public static int[] sortedArrays(int arr[]){
    // int n = arr.length;
    // int result[] = new int[arr.length];
    // for(int i = 0; i < n; i++){
    // result[i] = arr[i] * arr[i];
    // }
    // Arrays.sort(result);
    // return result;

    // }
    // public static void main(String[] args) {
    // int arr[] = {9,2,4,15,25,6};
    // System.out.println(Arrays.toString(sortedArrays(arr)));

    // }

    // 30) print Squares of a sorted array - 977 - Optimized approach - Two pointer-
    // TC = O(n) & SP = O(n)

    // public static int [] sortedArrays(int arr[]){
    // int n = arr.length;
    // int ans[] = new int[n];

    // int left = 0;
    // int right = n - 1;

    // for(int i = n - 1; i >= 0; i--){

    // if (Math.abs(arr[left]) > Math.abs(arr[right])) {
    // ans[i] = arr[left] * arr[left];
    // left++;
    // }else{
    // ans[i] = arr[right] * arr[right];
    // right--;
    // }

    // }
    // return ans;
    // }
    // public static void main(String[] args) {
    // int arr[] = {-7, -3, -1, 2, 5, 8};
    // System.out.println(Arrays.toString(sortedArrays(arr)));

    // }

    // 31) Majority element( majority element is the element that appears more than
    // n/2 times) --Leetcode 169 -- brute force approach-TCO(n2)

    // public static int majElement(int arr[]){
    // int n = arr.length;

    // for(int i = 0; i < n; i++){
    // int count = 0;
    // for(int j = 0; j < n; j++){
    // if (arr[i] == arr[j]) {
    // count++;
    // }

    // if (count > n / 2) {
    // return arr[i];
    // }
    // }
    // }
    // return -1;
    // }
    // public static void main(String[] args) {
    // int arr[] = {3, 2, 1, 1, 1};
    // System.out.println(majElement(arr));

    // }

    // 32) Majority element( majority element is the element that appears more than
    // n/2 times) --Leetcode 169 -- Boyer-Moore Voting Algorithm- TC O(n)
    // public static int majElement(int[] nums) {

    // int candidate = 0;
    // int count = 0;

    // for (int num : nums) {

    // if (count == 0) {
    // candidate = num;
    // }

    // if (num == candidate) {
    // count++;
    // } else {
    // count--;
    // }
    // }

    // return candidate;
    // }

    // public static void main(String[] args) {
    // int nums[] = { 3, 2, 1, 1, 1 };
    // System.out.println(majElement(nums));

    // }

    // 33) Majority element -- Another approach -- but this is the worst case -
    // TC = O(n log n)

    // public static int majElement(int nums[]) {
    // int n = nums.length;
    // Arrays.sort(nums);
    // return nums[n / 2];
    // }

    // public static void main(String[] args) {
    // int nums[] = { 3, 2, 1, 1, 1 };
    // System.out.println(majElement(nums));

    // }

    // 34)Reverse first k element of queue
    // public static Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {

    // Stack<Integer> s = new Stack<Integer>();

    // for (int i = 0; i < k; i++) {
    // s.add(q.remove());
    // }
    // while (!s.isEmpty()) {
    // q.add(s.pop());
    // }

    // int remaining = q.size() - k;
    // for (int i = 0; i < remaining; i++) {
    // q.add(q.remove());
    // }
    // return q;
    // }

    // public static void main(String[] args) {
    // Queue<Integer> q = new LinkedList<Integer>();
    // int k = 3;
    // q.add(7);
    // q.add(7);
    // q.add(5);
    // q.add(6);
    // q.add(5);
    // q.add(10);
    // q.add(8);

    // System.out.println(reverseFirstK(q, k));
    // }

    // 35) Time to buy a tickets
    // public static int timeToBuy(int tickets[], int k){
    // Queue<Integer> q = new LinkedList<Integer>();
    // for(int i= 0; i < tickets.length ; i++){
    // q.add(i);
    // }
    // int time = 0;
    // while (!q.isEmpty()) {
    // int person = q.remove();

    // tickets[person]--;
    // time++;

    // if (person == k && tickets[person] == 0) {
    // return time;
    // }

    // if (tickets[person] > 0) {
    // q.add(person);
    // }

    // }
    // return time;

    // }
    // public static void main(String[] args) {
    // int tickets[] = {2,3,2};
    // int k= 2;
    // System.out.println(timeToBuy(tickets, k)+ " seconds");

    // }
    // 36)Next greater element -- using brute force approach

    // public static int[] nextGreater(int nums[]){
    // int ans[] = new int[nums.length];

    // for(int i = 0; i < nums.length; i++){
    // ans[i] = -1;

    // for(int j = i+1; j < nums.length; j++){
    // if (nums[j] > nums[i]) {
    // ans[i] = nums[j];
    // break;
    // }
    // }
    // }
    // return ans;
    // }
    // public static void main(String[] args) {
    // int nums [] = {1,2,1};
    // System.out.println(Arrays.toString(nextGreater(nums)));

    // }

    // 37) Next greater element -II --circuloar array -- using brute force approach
    // public static int[] nextGreater(int nums[]){
    // int ans[] = new int[nums.length];

    // for(int i = 0; i < nums.length; i++){
    // ans[i] = -1;

    // for(int j = 1; j < nums.length; j++){
    // int index = (i + j) % nums.length;
    // if (nums[index] > nums[i]) {
    // ans[i] = nums[index];
    // break;
    // }
    // }
    // }
    // return ans;
    // }
    // public static void main(String[] args) {
    // int nums [] = {1,2,1};
    // System.out.println(Arrays.toString(nextGreater(nums)));

    // }
    // 38)Stock span

    // static class StockSpanner {

    // Stack<int[]> stack;

    // public StockSpanner() {
    // stack = new Stack<>();
    // }

    // public int next(int price) {

    // int span = 1;

    // // Remove all previous prices <= current price
    // while (!stack.isEmpty() && stack.peek()[0] <= price) {
    // span += stack.pop()[1];
    // }

    // // Store {price, span}
    // stack.push(new int[] { price, span });

    // return span;
    // }

    // }

    // public static void main(String[] args) {

    // Scanner sc = new Scanner(System.in);

    // System.out.print("Enter number of days: ");
    // int n = sc.nextInt();

    // StockSpanner spanner = new StockSpanner();

    // System.out.println("Enter stock prices:");

    // for (int i = 0; i < n; i++) {

    // int price = sc.nextInt();

    // int span = spanner.next(price);

    // System.out.println(
    // "Price = " + price + " , Span = " + span);
    // }

    // sc.close();
    // }

    // // 39)TWO sum problem -- optimized approach -O(n) TC
    // public static int[] twoSum(int arr[], int target) {
    //     int n = arr.length;
    //     HashMap<Integer, Integer> map = new HashMap<>();

    //     for (int i = 0; i < n; i++) {
    //         int complement = target - arr[i];
    //         if (map.containsKey(complement)) {
    //             return new int[] { map.get(complement), i };
    //         }

    //         map.put(arr[i], i);
    //     }

    //     return new int[] {};
    // }

    // public static void main(String[] args) {
    //     int arr[] = { 2, 7, 11, 15 };
    //     int target = 9;
    //     System.out.println(Arrays.toString(twoSum(arr, target)));
    // }

    //40) check palidrome problem 
     
    // private static boolean checkPalindrome(String str){
    //     int left = 0;
    //     int right = str.length() - 1;
    //     while(left < right){
    //         if(str.charAt(left) != str.charAt(right)){
    //             return false;
    //         }
    //         left++;
    //         right--;
    //     }
    //     return true;
    // }
    // public static boolean isPalindrome(int x) {
    //     if(x < 0){
    //         return false;
    //     }
    //     String str = x + "";
    //     return checkPalindrome(str);
    // }

    // public static void main(String[] args) {
    //     int x = 121;
    //     System.out.println(isPalindrome(x));
    // }

    // //41)Search insert element-bineary search
    // public static int search(int nums[], int target){
    //     int mid ;
    //     int left = 0;
    //     int right = nums.length - 1;
    //     while(left <= right){
    //         mid = left + (right - left)/2;
    //         if(nums[mid] == target){
    //             return mid;
    //         }else if(target < nums[mid]){
    //             right = mid - 1;
    //         }else{
    //             left = mid + 1;
    //         }
    //     }
    //     return left;
    // }
    //  public static void main(String[] args) {
    //     int nums[] = {1, 2, 4, 6, 8};
    //     int target = 3;
    //     System.out.println(search(nums,target));
    //  }

    //42)Length of last word

    public static int lengthOfLastWord(String s) {
        String words[] = s.split(" ");
        String lastWord = words[words.length - 1];
        int length = lastWord.length();
        return length;
    }
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }

     
}
