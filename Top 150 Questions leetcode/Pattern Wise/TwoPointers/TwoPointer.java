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

            public static int[] twoSum(int [] numbers, int target){
                int i = 0;
                int j = numbers.length - 1;

                while (i < j) {
                    int sum = numbers[i] + numbers[j];
                    if (sum == target) {
                        return new int[]{i + 1,j + 1};
                    }else if (sum > target) {
                        j--;
                    }else{
                        i++;
                    }
                    
                }
                return new int[]{};

            }

            public static void main(String[] args) {
               int [] numbers = {2,7,11,15};
               int target = 9 ;//output : [1,2]
               System.out.println(Arrays.toString(twoSum(numbers, target)));
            }
}
