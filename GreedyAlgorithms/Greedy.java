package GreedyAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Greedy {
    

    //1)Activity selection problem
    // public static void main(String[] args) { //TC O(n)
    //     int start[] = {1, 3, 0, 5, 8, 5};
    //     int end[] = {2, 4, 6, 7, 9, 9};

    //     //end time based sorted 
    //     int maxAct = 0;
    //     ArrayList<Integer> ans = new ArrayList<>();

    //     //1st activity
    //     maxAct = 1;
    //     ans.add(0);
    //     int lastEnd = end[0];

    //     for(int  i = 1; i < start.length; i++){
    //         if (start[i] >= lastEnd) {
    //             maxAct++;
    //             ans.add(i);
    //             lastEnd = end[i];
    //         }
    //     }

    //     System.out.println("Maximum activities are : " + maxAct);
       
    //     for(int  i = 0; i < ans.size(); i++){
    //         System.out.print("A" + ans.get(i) + " ");
    //     }
    //     System.out.println();
    // }

    //2)Activity selection problem - if end is not sorted we need to sort it using matrix 
    //  public static void main(String[] args) { //TC O(n)
    //     int start[] = {0, 1, 3, 5, 5, 8};
    //     int end[] = {6, 2, 4, 7, 9, 9};


    //     //sorting
    //     int activities[][] = new int[start.length][3];
    //     for(int  i= 0; i < start.length; i++){
    //         activities[i][0] = i;
    //         activities[i][1] = start[i];
    //         activities[i][2] = end[i];
    //     }

    //     //lamda function -> shortform---sort the col no 2 from 2d matrix
    //     Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
    //     //end time based sorted 
    //     int maxAct = 0;
    //     ArrayList<Integer> ans = new ArrayList<>();

    //     //1st activity
    //     maxAct = 1;
    //     ans.add(activities[0][0]);
    //     int lastEnd = activities[0][2];

    //     for(int  i = 1; i < start.length; i++){
    //         if (activities[i][1] >= lastEnd) {
    //             maxAct++;
    //             ans.add(activities[i][0]);
    //             lastEnd = activities[i][2];
    //         }
    //     }

    //     System.out.println("Maximum activities are : " + maxAct);
       
    //     for(int  i = 0; i < ans.size(); i++){
    //         System.out.print("A" + ans.get(i) + " ");
    //     }
    //     System.out.println();
    // }

    //3)Fractional knapsack problem

    public static void main(String[] args) {
        int val[] = {60, 100, 120};
        int weight[] = {10, 20, 30};
        int W = 50;

        double ratio[][] = new double[val.length][2];
        //0th col => idx ; 1st col => ratio

        for(int i = 0; i < val.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)weight[i];
        }
        
        //sort in asending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = W;
        double finalVal = 0;
        for(int i = ratio.length - 1; i >= 0; i--){
            int idx = (int)ratio[i][0];
            if (capacity >= weight[idx]) { //include full item
                finalVal += val[idx];
                capacity -= weight[idx];
            }else{
                //include fractional item
                finalVal += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println("Final value = " + finalVal);

    }
}
