package Hashing;

import java.util.*;

public class HashingPattern {
    // //1) Leetcode 242 - Valid Anagrams

    // public static boolean isValidAna(String s, String t){
    // if(s.length() != t.length()){
    // return false;
    // }
    // int count[] = new int[26];

    // for(int i = 0; i < s.length(); i++){
    // char ch = s.charAt(i);
    // count[ch - 'a']++;
    // }
    // for(int i = 0; i < t.length(); i++){
    // char ch = t.charAt(i);
    // count[ch - 'a']--;
    // }

    // for(int i = 0; i < count.length; i++){
    // if(count[i] > 0){
    // return false;
    // }
    // }
    // return true;

    // }
    // public static void main(String[] args) {
    // String s = "anagram";
    // String t = "nagaram";

    // System.out.println(isValidAna(s, t));
    // }

    // //2)Leetcode - 1 TWO sum -- Optimized method

    // public static int [] twoSum(int nums[], int target){
    // int n = nums.length;

    // HashMap<Integer, Integer> map = new HashMap<>();

    // for(int i = 0 ; i < n; i++){

    // int complement = target - nums[i];
    // if (map.containsKey(complement)) {
    // return new int[]{map.get(complement), i};
    // }
    // map.put(nums[i], i);
    // }
    // return new int[]{};
    // }
    // public static void main(String[] args) {
    // int nums[] = {2,7,11,15};
    // int target = 9;

    // System.out.println(Arrays.toString(twoSum(nums, target)));

    // }

    // //3)Leetcod 49 - Group Anagrams

    // public static List<List<String>> groupAnagrams(String[] strs) {
    // HashMap<String, List<String>> map = new HashMap<>();
    // for(String s: strs){
    // int count[] = new int[26];
    // for(char c: s.toCharArray()){
    // count[c - 'a']++;
    // }

    // StringBuilder sb = new StringBuilder();

    // for(int i: count){
    // sb.append('#');
    // sb.append(i);
    // }

    // String key = sb.toString();

    // if(!map.containsKey(key)){
    // map.put(key, new ArrayList<String>());
    // }
    // map.get(key).add(s);
    // }

    // return new ArrayList<>(map.values());

    // }

    // public static void main(String[] args) {
    // String[] strs = {"eat", "xtea", "tan", "ate", "nat", "bat"};

    // System.out.println(groupAnagrams(strs));
    // }

    // // 4)Leetcode 347 - Top k frequent elements

    // public static int[] topK(int nums[], int k) {
    // HashMap<Integer, Integer> map = new HashMap<>();

    // //count frequency
    // for(int num: nums){
    // map.put(num, map.getOrDefault(num, 0) + 1);
    // }

    // //store unique
    // List<Integer> list = new ArrayList<>(map.keySet());

    // //sort
    // list.sort((a,b) -> map.get(b) - map.get(a));

    // int result[] = new int[k];

    // for(int i = 0; i < k; i++){
    // result[i] = list.get(i);
    // }
    // return result;
    // }

    // public static void main(String[] args) {
    // int nums[] = { 1, 1, 1, 2, 2, 3 };
    // int k = 2;
    // System.err.println(Arrays.toString(topK(nums, k)));
    // }

    // // 5)Leetcode 347 - Top k frequent elements --> Optimized approach


    // public static int[] topK(int nums[], int k){
    //     HashMap<Integer, Integer> map = new HashMap<>();

    //     //for count frequency
    //     for(int num: nums){
    //         map.put(num, map.getOrDefault(num, 0) +1);
    //     }

    //     PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));

    //     for(int num : map.keySet()){
    //         minHeap.offer(num);

    //         if (minHeap.size() > k) {
    //             minHeap.poll();
    //         }
    //     }

    //     int result[] = new int[k];

    //     for(int  i = 0; i < k; i++){
    //         result[i] = minHeap.poll();
    //     }

    //     return result;
    // }
    // public static void main(String[] args) {
    //     int nums[] = { 1, 1, 1, 2, 2, 3 };
    //     int k = 2;
    //     System.err.println(Arrays.toString(topK(nums, k)));
    // }

    // //5)Longest cosecutive sequence - leetcode - 128
    // public static int longConSeq(int nums[]){
    // HashSet<Integer> set = new HashSet<>();

    // for(int num: nums){
    // set.add(num);
    // }

    // int longest = 0;

    // for(int num: set){

    // if (!set.contains(num - 1)) {

    // int current = num;
    // int count = 1;

    // while (set.contains(current + 1)) {
    // current++;
    // count++;
    // }
    // longest = Math.max(count, longest);
    // }
    // }

    // return longest;
    // }

    // public static void main(String[] args) {
    // int nums[] = {100,4,200,1,3,2};
    // System.out.println(longConSeq(nums));
    // }

    //7)Valid palindrome - Leetcode 125

        // public static boolean checkPalindrome(String result){
        //     int i = 0;
        //     int j = result.length() - 1;

        //     while(i < j){
        //         if (result.charAt(i) != result.charAt(j)) {
        //             return false;  
        //         }
        //         i++;
        //         j--;
        //     }
        //     return true;

        // }

        // public static boolean isPalindrome(String s){
        //     StringBuilder sb = new StringBuilder();
        //     for(int i = 0; i < s.length(); i++){
        //         char ch = s.charAt(i);
        //         if (Character.isLetter(ch) || Character.isDigit(ch)) {
        //             sb.append(ch);//Adding all string letter and digit into the stringBulider 
        //         }
        //     }
        //    // System.out.println(sb);//print stringBuilder

        //     String result = sb.toString();//Converting stringBuilder(mutable) into the string(immutable)
        //     //System.out.println(result);
        //     result = result.toLowerCase();//Coverting to lowercase and result pointing towards the new string  
        //     // --Because immutability applies to the object, not the reference variable. 
        //     //System.out.println(result);

        //     if (checkPalindrome(result)) {
        //         return true;
        //     }
        //     return false;

        // }
        // public static void main(String[] args) {
        //     String s = "A man, a plan, a canal: Panama";
        //     System.out.println(isPalindrome(s));
        // }


        //8)Two sum input array sorted - leetcode 167

            // public static int[] twoSum(int [] numbers, int target){
            //     int i = 0;
            //     int j = numbers.length - 1;

            //     while (i < j) {
            //         int sum = numbers[i] + numbers[j];
            //         if (sum == target) {
            //             return new int[]{i + 1,j + 1};
            //         }else if (sum > target) {
            //             j--;
            //         }else{
            //             i++;
            //         }
                    
            //     }
            //     return new int[]{};

            // }

            // public static void main(String[] args) {
            //    int [] numbers = {2,7,11,15};
            //    int target = 9 ;//output : [1,2]
            //    System.out.println(Arrays.toString(twoSum(numbers, target)));
            // }

}
