package Strings;

// import java.util.Scanner;

public class Strings {


  

    // public static void main(String[] args) {
        // Input
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();

        // System.out.println(name);

// Concatenation
// public static void main(String[] args) {
        
//         // //    String firstName = "Ananta";
//         // //    String lastName = "Rajegore";

//         // //    String fullName = firstName +" "+lastName;

//         // //    System.out.println(fullName);

//         //   String s1 = "Hello";
//         //   s1.concat("World");
//         //   System.out.println(s1);



// }
    // }

//Print letter of a String
        // public static void printLetters(String str){
        //         for(int i = 0; i<str.length(); i++){
        //             System.out.print(str.charAt(i) +" ");
        //         }
        //         System.out.println();
        //     }
        // public static void main(String[] args) {
            
        //     String fullName = "Ananta Rajegore";

        //         printLetters(fullName);
        // }



//Check if a String is palindrome

        // public static boolean isPalindrome(String str){

        //     int n = str.length();
            
        //     for(int i = 0; i<n /2; i++ ){
        //         if (str.charAt(i)!=str.charAt(n-1-i)) {
        //             return false;
        //         }
        //     }
        //     return true;
        // }
        //        public static void main(String[] args) {
        //         String str = "racecar";
        //         System.out.println(isPalindrome(str));
        //        }


//Given a route containing 4 directions(EWNS) find the shortwst path to reach destination

            // public static float getShortestPath(String path){
            //     int x = 0; int y = 0;
            //     for(int i = 0; i<path.length(); i++){
            //         char dir = path.charAt(i);
            //         //south
            //         if(dir == 'S'){
            //             y--;
            //         }
            //         //north
            //         else if (dir == 'N') {
            //             y++;
            //         }
            //         //west
            //         else if (dir == 'W') {
            //             x--;
            //         }
            //         //east
            //         else{
            //             x++;
            //         }
            //     }
            //     int x2 = x*x;
            //     int y2 = y*y;
            //     return (float)Math.sqrt(x2 + y2);
            // }
            // public static void main(String[] args) {
            //     String path = "WNEENESENNN";
            //     System.out.println(getShortestPath(path));
            // }


//Comparision of two String
            //  public static void main(String[] args) {
            //     String s1 = "Tony";    // String ban chuki hai memory mai tony nam ki s1 and s2 usko point out kr kre hai
            //     String s2 = "Tony";    
            //     String s3 = new String("Tony");// this create a new string in memory

            //     if(s1 == s2){
            //         System.out.println("Strings are equal");
            //     } else{
            //         System.out.println("Strings are not equal");
            //     }
                
            //     if(s1.equals(s3)){
            //         System.out.println("Strings are equal");
            //     } else{
            //         System.out.println("Strings are not equal");
            //     }
            //  }   
            
            
//Substring of String

            //    public static String substring(String str,int si,int ei){
            //     String subStr = "";
            //     for(int i = si; i<ei ; i++){
            //         subStr += str.charAt(i);
            //     }
            //     return subStr;
            //    }
            //    public static void main(String[] args) {
            //     String str = "HelloWorld";
            //     System.out.println(substring(str,0,5));

            //    }          
            
            
// print the largest String 

        //       public static void main(String[] args) {
        //         String fruits[] = {"apple","mango","banana" };

        //         String largest = fruits[0];

        //         for( int i = 0; i<fruits.length; i++){
        //                 if (largest.compareTo(fruits[i] ) < 0) {
        //                         largest = fruits[i];
        //                 }
        //         }
        //         System.out.println(largest);       

        //       }

// String builder 
        // public static void main(String[] args) {
        //         StringBuilder sb = new StringBuilder("");
        //         for(char ch = 'a'; ch<='z'; ch++){
        //                 sb.append(ch);
        //         }
        //         System.out.println(sb);
        //         System.out.println(sb.length());
        // }


}
