package TwoPointers;
import java.util.*;;

public class TwoPointer {
    
    //1)Valid palindrome - Leetcode 125

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


        //2)Two sum input array sorted - leetcode 167

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

        //3)Sort colors 

        // public static int[] sortColors(int colors[]){
        //     Arrays.sort(colors);
        //     return colors;
        // }
        // public static void main(String[] args) {
        //     int colors[] = {2, 0, 0, 1, 2, 1, 0, 1};
        //     System.out.println(Arrays.toString(sortColors(colors)));
            
        // }

        //4)Sort colors without using the inbuilt method

        // public static int[] sortColors(int colors[]){
        //     int count0 = 0;
        //     int count1 = 0;
        //     int count2 = 0;

        //     for(int i = 0 ; i < colors.length; i++){
        //         if (colors[i] == 0) {
        //             count0++;
        //         }
        //          if (colors[i] == 1) {
        //             count1++;
        //         }
        //           if (colors[i] == 2) {
        //             count2++;
        //         }
        //     }

        //     int index = 0;
        //     while (count0 > 0) {
        //         colors[index] = 0;
        //         index++;
        //         count0--;
        //     }
        //     while (count1 > 0) {
        //         colors[index] = 1;
        //         index++;
        //         count1--;
        //     }

        //     while (count2 > 0) {
        //         colors[index] = 2;
        //         index++;
        //         count2--;
        //     }

        //     return colors;
        // }
        // public static void main(String[] args) {
        //     int colors[] = {2, 0, 0, 1, 2, 1, 0, 1};
        //     System.out.println(Arrays.toString(sortColors(colors)));
        // }
}
