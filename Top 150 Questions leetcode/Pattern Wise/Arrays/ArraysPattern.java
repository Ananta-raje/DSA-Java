import java.util.*;

public class ArraysPattern {

    ////1) Leetcode 217 - Contains Duplicate
    // public static boolean containsDup(int[] nums) {
    //     int n = nums.length;

    //     HashSet<Integer> set = new HashSet<>();

    //     for (int i = 0; i < n; i++) {
    //         if (set.contains(nums[i])) {
    //             return true;
    //         }

    //         set.add(nums[i]);
    //     }

    //     return false;
    // }

    // public static void main(String[] args) {
    //     int[] nums = { 1, 2, 3, 1};
    //     System.out.println(containsDup(nums));
    // }

    // //2) Leetcode 238 - Product of Arrays except Self
    // public static int[] proExceptSelf(int [] nums){
    //     int n = nums.length;
    //     int ans [] = new int[n];

    //     //prefix product
    //     int prefix = 1;

    //     for(int i = 0; i < n; i++){
    //         ans[i] = prefix;
    //         prefix =prefix * nums[i];
    //     }

    //     //Suffix product 

    //     int suffix = 1;
    //     for(int i = n - 1; i >= 0; i--){
    //         ans[i] = ans[i] * suffix;
    //         suffix = suffix * nums[i];
    //     }

    //     return ans;
    // }
    // public static void main(String[] args) {
    //     int[] nums = {1, 2, 3, 4};
    //     System.out.println(Arrays.toString(proExceptSelf(nums)));
    // }

    // //3) LeetCode 36 - Valid Sudoku
    // public static boolean isValidSudoku(char[][] board) {

    // HashSet<Character>[] rows = new HashSet[9];
    // HashSet<Character>[] columns = new HashSet[9];
    // HashSet<Character>[] boxes = new HashSet[9];

    // // Create HashSet for each row, column and box
    // for (int i = 0; i < 9; i++) {
    // rows[i] = new HashSet<>();
    // columns[i] = new HashSet<>();
    // boxes[i] = new HashSet<>();
    // }

    // // Traverse the Sudoku board
    // for (int row = 0; row < 9; row++) {

    // for (int col = 0; col < 9; col++) {

    // char value = board[row][col];

    // // Ignore empty cells
    // if (value == '.') {
    // continue;
    // }

    // // Find which 3x3 box this cell belongs to
    // int box = (row / 3) * 3 + (col / 3);

    // // Check duplicate
    // if (rows[row].contains(value)
    // || columns[col].contains(value)
    // || boxes[box].contains(value)) {

    // return false;
    // }

    // // Add value to row, column and box
    // rows[row].add(value);
    // columns[col].add(value);
    // boxes[box].add(value);
    // }
    // }

    // return true;
    // }

    // public static void main(String[] args) {

    // char[][] board = {
    // {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
    // {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
    // {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
    // {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
    // {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
    // {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
    // {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
    // {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
    // {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
    // };

    // System.out.println(isValidSudoku(board));
    // }


   



}