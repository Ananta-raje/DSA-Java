package Recursion;

public class recursion {

//print from n to 1  (in decreasing order)

        // public static void printDec(int n){
        //  if (n == 1) {    // Base case
        //     System.out.println(n);
        //     return;
        //  }
        //  System.out.println(n);
        //  printDec(n-1);
        // }
        // public static void main(String[] args) {
        //     int n = 10;
        //     printDec(n);
            
        // }


 //print from 1 to n (in increasing order)
 
        //    public static void printInc(int n){
        //     if (n == 1) {
        //         System.out.print(n + " ");
        //         return;
        //     }
        //     printInc(n-1);
        //     System.out.print(n + " ");
        //    }
        //    public static void main(String[] args) {
        //     int n = 10;
        //     printInc(n);
        //    }


//print factorial of a number   O(n)--space complexity

        // public static int fact(int n){
        // if (n == 0) {
        // return 1;

        // }
        // int fnm1 = fact(n-1);
        // int fn = n * fnm1 ;
        // return fn;
        // }
        // public static void main(String[] args) {
        // int n = 5;
        // System.out.println(fact(n));
        // }

//print sum of first n natural numbers
    // 1) Using Recursion ----Tc = O(n), Sc = O(n)
                // public static int calcSum(int n){
                //         if (n == 1) {
                //                 return 1 ;
                //         }
                //         int Snm1 = calcSum(n-1);
                //         int Sn = n + Snm1;
                //         return Sn;
                // }
                // public static void main(String[] args) {
                //         int n = 5;
                //         System.out.println(calcSum(n));
                // }
         
     // 2) Using loop -- Iterative method  ----Tc = O(n), Sc = O(1)
                //   public static void main(String[] args) {
                //         int  n = 5;
                //         int sum = 0;
                //         for( int i = 1; i<=n; i++){
                //                 sum = sum + i;
                //         }
                //         System.out.println(sum);
                //   }   
                
     // 3)Using formula ---  ----Tc = O(1), Sc = O(1)   --- best method  using single variable 
                //   public static void main(String[] args) {
                //         int n = 5;
                //         int sum = n*(n+1)/2;
                //         System.out.println(sum);
                //   }

//print nth fibonacci number 
    // 1) recursion very slow --- 
        //  public static int fib(int n){
        //       if (n == 1 || n == 0) {
        //         return n ;
        //       }
        //         int fnm1 = fib(n-1);
        //         int fnm2 = fib(n-2);
        //         int fn = fnm1 + fnm2;
        //         return fn;
        //  }
        //  public static void main(String[] args) {
        //         int n = 5;
        //         System.out.println(fib(n));
        //         System.out.println(fib(6));
        //         System.out.println(fib(7));
        //         System.out.println(fib(8));
        //         System.out.println(fib(9));
        //  }
     
    // 2) Iteratvive method -- fast 
         
        //   public static int fib(int n) {
        //                 if (n == 0 || n == 1)
        //                 return n;

        //                 int a = 0, b = 1, c = 0;

        //                 for (int i = 2; i <= n; i++) {
        //                 c = a + b;
        //                 a = b;
        //                 b = c;
        //                 }

        //                 return b;
        //         }

        //         public static void main(String[] args) {
        //                 System.out.println(fib(5));
        //                 System.out.println(fib(6));
        //                 System.out.println(fib(7));
        //                 System.out.println(fib(8));
        //                 System.out.println(fib(9));
        //         }


//Check given array is sorted or not
   // 1) using iterative method -- loop
        //     public static boolean isSorted(int arr[]){
        //         for(int i = 0; i<arr.length -1 ; i++){
        //             if (arr[i] > arr[i + 1]) {
        //                 return false;
        //             }
        //         }
        //         return true;
        //     }
        //    public static void main(String[] args) {
        //         int arr [] = {1, 2, 3, 4, 5};
        //          System.out.println(isSorted(arr));
        //    }
   
    // 2)recursion method

            //   public static boolean isSorted(int arr[], int i){
            //     if (i == arr.length-1) {
            //         return true;
            //     }
            //     if (arr[i]>arr[i+1]) {
            //         return false;
            //     }
            //     return isSorted(arr, i+1);
            //   }
            //   public static void main(String[] args) {
            //     int arr [] = {1, 2, 3, 4, 5};
            //     System.err.println(isSorted(arr, 0));
            //   }

 // wirte a function to find the first occurence of an element in an array
        // 1) Recursion method 
            //    public static int firOccurence(int arr[], int key, int i){
            //     if (i == arr.length) {
            //        return -1;
            //     }
            //     if (arr[i] == key) {
            //         return i;
            //     }
            //     return firOccurence(arr, key, i+1);
                
            //    }
            
            //    public static void main(String[] args) {
            //     int arr [] = {8, 4, 6, 2, 1, 5};
            //     int key = 5;
            //     System.out.println(firOccurence(arr, key, 0));

            //    }
      // 2) Iterative method
            // public static int  firOccurence(int arr[], int key){
            //   for(int i = 0; i < arr.length; i++){
            //      if (arr[i] == key) {
            //         return i ;  
            //      }
            //   }
            //   return -1;
            // }
            //     public static void main(String[] args) {
            //         int arr [] = {8, 4, 6, 0, 1, 2};
            //         int key = 5;
            //         System.out.println(firOccurence(arr, key));
            //     }

// wirte a function to find the last occurence of an element in an array
        // 1) recursion method  //  
                // public static int lastOccurence(int arr[], int key, int i){
                //         if (i == arr.length) {
                //         return -1;
                //         }
                //         int isFound =  lastOccurence(arr, key, i+1);
                //         if (isFound == -1 &&  arr[i] == key) {
                //             return i;
                //         }
                //         return isFound;
                        
                //     }
                    
                //     public static void main(String[] args) {
                //         int arr [] = {8, 4, 5, 2, 1, 0};
                //         int key = 5;
                //         System.out.println(lastOccurence(arr, key, 0));

                //     }

// Tiling problem 2 * n size board , count the number of ways to tile the board using the 2*1 tile?
             //1) recursion method
               
                //   public static int tilingProblem(int n){
                //      //Base
                //      if (n == 0 || n == 1) {
                //         return 1;
                //      }
                //      //choice 
                //      //verticle 
                //      int fnm1 = tilingProblem(n-1);
                //      //horizontal
                //      int fnm2 = tilingProblem(n-2);

                //      int totalWays = fnm1 + fnm2;
                //      return totalWays;
                //   }
                //   public static void main(String[] args) {
                //     System.out.println(tilingProblem(4));
                //   }
      
// Remove duplicates form a string ?
        // Recursion
//       public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]){
//         if (idx == str.length()) {
//            System.out.println(newStr);     
//            return;
//         }
//         char currChar = str.charAt(idx);
//         if (map[currChar - 'a'] == true) {
//               removeDuplicates(str, idx + 1, newStr, map);  
//         }else{
//                 map[currChar - 'a'] = true;
//                 removeDuplicates(str, idx + 1, newStr.append(currChar), map);
//         }

//       }
//       public static void main(String[] args) {
//         String str = "appnnacollege";
//         removeDuplicates(str, 0, new StringBuilder(" "), new boolean[26]);
//       }       

// friends pairing problem 

       public static int friendsPairing(int n){
        if (n==1 || n==2) {
                return n;
        }
        //choice 
        //single
        int fnm1 = friendsPairing(n-1);
        //pair
        int fnm2 = friendsPairing(n-2);
        int pairWays = (n-1) * fnm2;

        //totalWays
        int totalWays = fnm1 + pairWays;
        return totalWays;
        // return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);

       }   
       
       public static void main(String[] args) {
        System.out.println(friendsPairing(3));
       }
 }

