import java.util.*;

public class Classroom {


// public static void main(String[] args) {
       
//Operations in AL
        //ArrayList<Integer> list = new ArrayList<>();

        //add an element  O(1)
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        // System.out.println(list);

        //add an element at index
        // list.add(2, 9);
        // System.out.println(list);

        //get element  O(1)
        //int element = list.get(2);
        //System.out.println(element);

        //Remove or delete an element O(n)
        //list.remove(2);
        //System.out.println(list);

        //set element O(n)  replace original number with new number not add
        //list.set(2 , 7);
        //System.out.println(list);

        //contains   true  or false 
        //System.out.println(list.contains(11));
        //System.out.println(list.contains(1));


//Size of an AL
    //    ArrayList<Integer> list = new ArrayList<>();
    //    list.add(1);
    //    list.add(2);
    //    list.add(3);
    //    list.add(4);
    //    list.add(5);

    //    System.out.println(list.size());
    //    System.out.println(list.reversed());  //actual list reverse करते (list permanently बदलते).

       //print the arrayList
        // for(int i = 0 ; i < list.size(); i++){       //loop method → फक्त print करते, original list बदलत नाही.
        //     System.out.print(list.get(i) + " ");
        // }
        // System.out.println();
      
       //print the reverse of an arrayList O(n)- linear time complexity
            // for(int i = list.size() - 1 ; i >= 0; i-- ){     //loop method → फक्त reverse order मध्ये print करते, original list बदलत नाही.
            //         System.out.print(list.get(i) + " ");
            // } 
            // System.out.println();

    
//Find the maximum in an ArrayList
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(2);
        // list.add(5);
        // list.add(9);
        // list.add(6);
        // list.add(8);

       
        // int max = Integer.MIN_VALUE;
        // for(int i = 0; i<list.size(); i++){
        //     if (list.get(i) > max) {
        //         max = list.get(i);
        //     }
        // }
        // System.out.println("Max element is :" + max);
         
//sorting of an arraylist
            // ArrayList<Integer> list = new ArrayList<>();
            // list.add(2);
            // list.add(7);
            // list.add(1);
            // list.add(4);
            // list.add(8);  

            // Collections.sort(list); // inbuilt fnx for sort in ascending order
            // System.out.println(list);

            // Collections.sort(list, Collections.reverseOrder());// sort in descending order  -- comparator fnx
            // System.out.println(list);

//Multidimensional Arraylist
        //  ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        //  ArrayList<Integer> list1 = new ArrayList<>();
        //  ArrayList<Integer> list2 = new ArrayList<>();
        //  ArrayList<Integer> list3 = new ArrayList<>();

        //  for(int i = 1; i <= 5; i++ ){
        //     list1.add(i*1);
        //     list2.add(i*2);
        //     list3.add(i*3);
        //  }
        //  mainList.add(list1);
        //  mainList.add(list2);
        //  mainList.add(list3);
        //  System.out.println(mainList);

        //  for(int i = 0; i < mainList.size(); i++){
        //    ArrayList<Integer> currList = mainList.get(i);
        //    for(int j = 0; j < currList.size(); j++){
        //       System.out.print(currList.get(j)+" ");
        //    }
        //    System.out.println();
        //  }
// }

//Swap  two numbers
    // public static void Swap(ArrayList<Integer> list, int idx1 , int idx2){
    //      int temp = list.get(idx1);
    //      list.set(idx1, list.get(idx2));
    //      list.set(idx2, temp);
    // }
  
//Container with the most water-- Brute force approach
    //   public static int storeWater(ArrayList<Integer> height){
    //    int maxWater = 0;
    //    for(int i = 0; i < height.size(); i++){
    //     for(int j = i+1; j < height.size(); j++){
    //         int ht = Math.min(height.get(i), height.get(j));
    //         int wt = j - i;
    //         int currWater = ht * wt;
    //         maxWater = Math.max(maxWater, currWater);
    //     }
    //    }
    //    return maxWater;
    //   }    

//Container with the most water-- 2 pointer approach
        // public static int storeWater(ArrayList<Integer> height){
        //     int maxWater = 0;
        //     int lp = 0;
        //     int rp = height.size()-1;

        //     while (lp < rp) {
        //         //calculate water area
        //         int ht = Math.min(height.get(lp), height.get(rp));
        //         int wt = rp-lp ;
        //         int currWater = ht * wt ;
        //         maxWater = Math.max(maxWater, currWater);
          
        //         //update
        //         if (height.get(lp) < height.get(rp)) {
        //             lp++;
        //         }else{
        //             rp--;
        //         }

        //     }
        //     return maxWater;
        // }
       
//Find any pair in a sorted ArrayList has a target sum  --  Brute force approach
        //  public static boolean pairSum1(ArrayList<Integer> list, int target){
        //      for(int i = 0; i < list.size(); i++){
        //         for(int j = i + 1; j < list.size(); j++){
        //              if (list.get(i) + list.get(j) == target) {
        //                 return true;
        //              }
        //         }
        //      }
        //       return false;
        //  }      

//Find any pair in a sorted ArrayList has a target sum -- two pointer approach  for sorted arraylist or array
        // public static boolean pairSum1(ArrayList<Integer> list, int target){
        //     int lp = 0;
        //     int rp = list.size()- 1;
            
        //     while(lp != rp){
        //         //case 1
        //         if (list.get(lp) + list.get(rp) == target) {
        //             return true;
        //         }
        //         // case2
        //         if (list.get(lp) + list.get(rp) < target) {
        //             lp++;
        //         }else{
        //             rp--;
        //         }
        //     }
        //     return false;
        // }
     public static void main(String[] args) {
 //swap to numbers in arrayList
          
            // ArrayList<Integer> list = new ArrayList<>();
            // list.add(2);
            // list.add(5);
            // list.add(9);
            // list.add(6);
            // list.add(8);  


            // int idx1 = 1, idx2  = 3;
            // System.out.println(list);
            // Swap(list, idx1, idx2);
            // System.out.println(list);

//Container with the most water 
            //  ArrayList<Integer> height = new ArrayList<>();
            //  height.add(1);
            //  height.add(8);
            //  height.add(6);
            //  height.add(2);
            //  height.add(5);
            //  height.add(4);
            //  height.add(8);
            //  height.add(3);
            //  height.add(7);

            //  System.out.println(storeWater(height));
             
//Find any pair in a sorted ArrayList has a target sum
        //    ArrayList<Integer> list = new ArrayList<>();
        //    list.add(1);
        //    list.add(2);
        //    list.add(3);
        //    list.add(4);
        //    list.add(5);
        //    list.add(6);
        //    int target = 5;
        //    System.out.println(pairSum1(list, target));




     }
  
}
