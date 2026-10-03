package Hashing;

import java.util.*;

public class HashingPattern {
     // //1) Leetcode 242 - Valid Anagrams

    // public static boolean isValidAna(String s, String t){
    //     if(s.length() != t.length()){
    //         return false;
    //     }
    //     int count[] = new int[26];

    //     for(int i = 0; i < s.length(); i++){
    //         char ch = s.charAt(i);
    //         count[ch - 'a']++;
    //     }
    //      for(int i = 0; i < t.length(); i++){
    //         char ch = t.charAt(i);
    //         count[ch - 'a']--;
    //     }

    //     for(int i = 0; i < count.length; i++){
    //          if(count[i] > 0){
    //             return false;
    //         }
    //     }
    //        return true;

    // }
    // public static void main(String[] args) {
    //     String s = "anagram";
    //     String t = "nagaram";

    //     System.out.println(isValidAna(s, t));
    // }

    // //2)Leetcode - 1 TWO sum -- Optimized method

    // public static int [] twoSum(int nums[], int target){
    //     int n = nums.length;

    //     HashMap<Integer, Integer> map = new HashMap<>();

    //     for(int i = 0 ; i < n; i++){

    //         int complement = target - nums[i];
    //         if (map.containsKey(complement)) {
    //             return new int[]{map.get(complement), i};
    //         }
    //         map.put(nums[i], i);
    //     }
    //     return new int[]{};
    // }
    // public static void main(String[] args) {
    //     int nums[] = {2,7,11,15};
    //     int target = 9;

    //     System.out.println(Arrays.toString(twoSum(nums, target)));


    // }
}
