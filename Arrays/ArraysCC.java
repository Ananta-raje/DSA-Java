

public class ArraysCC{
// find the index of element in a given array ---Linear Search 
    // public static int LinearSearch(int numbers[],int key){
    //     for (int i=0;i<numbers.length;i++){
    //         if(numbers[i]==key){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
   
// public static void main(String[] args) {
//      //Linear Search
//         int numbers [] = {2,4,6,8,10,12,16,18};
//         int key = 18;
//         int index = LinearSearch(numbers, key);
//         if(index==-1){
//             System.out.println("Index not found");
//         }else{
//             System.out.println("Index of an element is:"+index);
//         }
// }


//find the largest value in the given array also the smallest value in the array
        // public static int Value(int number[]){
        //     int largest = Integer.MIN_VALUE;
        //     int smallest = Integer.MAX_VALUE;

        //     for(int i=0; i<number.length;i++){
        //         if(largest<number[i]){
        //             largest = number[i];
        //         }
        //         if(smallest > number[i]) {
        //             smallest = number[i];
        //         }
        //     }
        //         System.out.println("The samllest value is:"+ smallest);
        //         return largest;
                
        //     }
        // public static void main(String[] args) {
        
        //     int number[] = {1,2,6,3,5};
        //     System.out.println("The largest number is:"+Value(number));
          
        // }

// Binary Search(array must be sorted) -- find the index of an element in given array
    //  public static int binarySearch(int number[],int key){
    //     int start = 0 ,end = number.length-1;

    //     while(start<=end){
    //         int mid = (start+end)/2 ;

    //         //comparision
    //         if(number[mid]==key){ //found
    //             return mid;
    //         }
    //         if(number[mid]<key){//right shift
    //             start = mid+1;
    //         }else{//left shift
    //             end = mid-1;

    //         }

    //     }
    //     return -1;
    // }
     
    // public static void main(String[] args) {
    //       int number[] = {2,4,6,8,10,12,14};
    //       int key = 20;

    //     System.out.println("key is at :"+binarySearch(number, key));
    // }


 //Reverse of an array
        // public static void reverse(int numbers[]){
        // int first = 0, last = numbers.length -1 ;

        // while(first<last){
        // //swap
        // int temp = numbers[last];
        // numbers[last]=numbers[first];
        // numbers[first] = temp;

        // first ++;
        // last --;
        // }

        // }
        
        
        // public static void main(String[] args) {
        //     int numbers[] = {2,4,6,8,10};

        // reverse(numbers);

        // for(int i = 0 ; i<numbers.length;i++){
        //     System.out.print(numbers[i]+ " ");
        // }
        // System.out.println();
        // }


//print subarrays
            // public static void PrintSubarrays(int numbers[]){
            //     for (int i = 0 ; i<numbers.length ; i++){
            //         for(int j = i ; j<numbers.length ; j++){
            //             for(int k = i ; k<=j ; k++){
            //                 System.out.print(numbers[k]+" ");
            //             }
            //             System.out.println();
            //         }
            //         System.out.println();
            //     }
            // }
            // public static void main(String[] args) {
            //     int numbers[] = {2,4,6,8,10};

            //     PrintSubarrays(numbers);
            // }

           
 // Max sum of subarrays
            // public static void MaxSumSubarrays(int numbers[]){

            //     int currSum = 0;
            //     int maxSum =  Integer.MIN_VALUE;
            //     for (int i = 0 ; i<numbers.length ; i++){
                
            //         for(int j = i ; j<numbers.length ; j++){
            //             currSum = 0;
            //             for(int k = i ; k<=j ; k++){
            //                 currSum+=numbers[k];
            //             }
            //             System.out.println(currSum);
            //             if(maxSum<currSum){
            //                 maxSum=currSum;
            //             }
                        
            //         }
            //         System.out.println();
                    
            //     }
            //     System.err.println("Max sum is:"+maxSum);
            // }
            // public static void main(String[] args) {
            //     int numbers[] ={2,4,6,8,10,12};
            //     MaxSumSubarrays(numbers);

            // }

//Pairs in array
            // public static void printPairs(int numbers[]){
            //     for(int i=0; i<numbers.length;i++){
            //         int curr = numbers[i];
            //         for(int j = i+1 ; j<numbers.length; j++){
            //             System.out.print("("+ curr +","+numbers[j]+") ");
            //         }
            //         System.out.println();
            //     }
            // }
            // public static void main(String[] args) {
            //     int numbers []= {2,4,6,8,10};
            //     printPairs(numbers);
            // }


    // public static void main(String[] args) {

    //input output of Arrays
        // int marks[] = new int[50];
        // Scanner sc = new Scanner(System.in);
        // marks[0] = sc.nextInt() ;
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();

        // System.out.println("phy marks = "+marks[0]);
        // System.out.println("che marks = "+marks[1]);
        // System.out.println("math marks = "+marks[2]);
        
    
       


    // }
}