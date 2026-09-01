package GreedyAlgorithms;

import java.util.*;

public class Greedy {

    // 1)Activity selection problem
    // public static void main(String[] args) { //TC O(n)
    // int start[] = {1, 3, 0, 5, 8, 5};
    // int end[] = {2, 4, 6, 7, 9, 9};

    // //end time based sorted
    // int maxAct = 0;
    // ArrayList<Integer> ans = new ArrayList<>();

    // //1st activity
    // maxAct = 1;
    // ans.add(0);
    // int lastEnd = end[0];

    // for(int i = 1; i < start.length; i++){
    // if (start[i] >= lastEnd) {
    // maxAct++;
    // ans.add(i);
    // lastEnd = end[i];
    // }
    // }

    // System.out.println("Maximum activities are : " + maxAct);

    // for(int i = 0; i < ans.size(); i++){
    // System.out.print("A" + ans.get(i) + " ");
    // }
    // System.out.println();
    // }

    // 2)Activity selection problem - if end is not sorted we need to sort it using
    // matrix
    // public static void main(String[] args) { //TC O(n)
    // int start[] = {0, 1, 3, 5, 5, 8};
    // int end[] = {6, 2, 4, 7, 9, 9};

    // //sorting
    // int activities[][] = new int[start.length][3];
    // for(int i= 0; i < start.length; i++){
    // activities[i][0] = i;
    // activities[i][1] = start[i];
    // activities[i][2] = end[i];
    // }

    // //lamda function -> shortform---sort the col no 2 from 2d matrix
    // Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
    // //end time based sorted
    // int maxAct = 0;
    // ArrayList<Integer> ans = new ArrayList<>();

    // //1st activity
    // maxAct = 1;
    // ans.add(activities[0][0]);
    // int lastEnd = activities[0][2];

    // for(int i = 1; i < start.length; i++){
    // if (activities[i][1] >= lastEnd) {
    // maxAct++;
    // ans.add(activities[i][0]);
    // lastEnd = activities[i][2];
    // }
    // }

    // System.out.println("Maximum activities are : " + maxAct);

    // for(int i = 0; i < ans.size(); i++){
    // System.out.print("A" + ans.get(i) + " ");
    // }
    // System.out.println();
    // }

    // 3)Fractional knapsack problem

    // public static void main(String[] args) {
    // int val[] = {60, 100, 120};
    // int weight[] = {10, 20, 30};
    // int W = 50;

    // double ratio[][] = new double[val.length][2];
    // //0th col => idx ; 1st col => ratio

    // for(int i = 0; i < val.length; i++){
    // ratio[i][0] = i;
    // ratio[i][1] = val[i]/(double)weight[i];
    // }

    // //sort in asending order
    // Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

    // int capacity = W;
    // double finalVal = 0;
    // for(int i = ratio.length - 1; i >= 0; i--){
    // int idx = (int)ratio[i][0];
    // if (capacity >= weight[idx]) { //include full item
    // finalVal += val[idx];
    // capacity -= weight[idx];
    // }else{
    // //include fractional item
    // finalVal += (ratio[i][1] * capacity);
    // capacity = 0;
    // break;
    // }
    // }
    // System.out.println("Final value = " + finalVal);

    // }

    // 4) sum of Min absolute differenece pairs

    // public static int absDiff(int a[], int b[]){
    // Arrays.sort(a);
    // Arrays.sort(b);

    // int minSum = 0;
    // for(int i = 0; i < a.length; i++){
    // minSum += Math.abs(a[i] - b[i]);//Math.abs() calaulte absolute value
    // }
    // return minSum;

    // }

    // public static void main(String[] args) {
    // int a[] = { 1, 2, 3 };
    // int b[] = { 2, 1, 3 };
    // System.out.println(absDiff(a, b));

    // }

    // 5) Maximum length chain of pairs // O(nlogn)

    // public static void main(String[] args) {
    // int pairs[][] = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};

    // Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

    // System.out.println(Arrays.deepToString(pairs));

    // //1st pair
    // int chainLen = 1;
    // int pairEnd = pairs[0][1];
    // for(int i = 1; i < pairs.length; i++){
    // if (pairs[i][0] > pairEnd) {
    // chainLen++;
    // pairEnd = pairs[i][1];
    // }
    // }
    // System.out.println("Max length of a chain is: " + chainLen);
    // }

    // 6) Indian coins
    // public static void main(String[] args) {
    // Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};
    // int amount = 590;

    // Arrays.sort(coins, Comparator.reverseOrder());

    // System.out.println(Arrays.deepToString(coins));

    // ArrayList<Integer> ans = new ArrayList<>();

    // int countCoins = 0;

    // for(int i = 0; i < coins.length; i++){
    // if (coins[i] <= amount) {
    // while (coins[i] <= amount) {
    // countCoins++;
    // ans.add(coins[i]);
    // amount -= coins[i];
    // }

    // }
    // }
    // System.out.println("Total no of min coins used are: " + countCoins);
    // System.out.println("The coins used are : " + ans);//OR

    // System.out.print("The coins used are : ");
    // for(int i = 0; i < ans.size(); i++){
    // System.out.print(ans.get(i) + " ");
    // }
    // }

    // 7)Job sequencing problem

    // static class Job {
    // int deadline;
    // int profit;
    // int id;

    // public Job(int i, int d, int p){
    // id = i;
    // deadline = d;
    // profit = p;
    // }

    // }
    // public static void main(String[] args) {
    // int jobsInfo[][] = {{4,20}, {1, 10}, {1, 40}, {1, 30}};

    // ArrayList<Job> jobs = new ArrayList<>();

    // for(int i = 0; i < jobsInfo.length; i++){
    // jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
    // }

    // Collections.sort(jobs, (obj1 , obj2) -> obj2.profit -
    // obj1.profit);//desending order of profit
    // ArrayList<Integer> seq = new ArrayList<>();

    // int time = 0;
    // for(int i = 0; i < jobs.size(); i++){
    // Job curr = jobs.get(i);
    // if (curr.deadline > time) {
    // seq.add(curr.id);
    // time++;
    // }
    // }

    // System.out.println("Max jobs = " + seq.size());
    // for(int i = 0; i <seq.size(); i++){
    // System.out.print(seq.get(i)+ " ");
    // }
    // System.out.println();
    // }

    // 8) chocola problem

    public static void main(String[] args) {
        int n = 4, m = 6;
        Integer costVer[] = { 2, 1, 3, 1, 4 };
        Integer costHor[] = { 4, 1, 2 };

        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int cost = 0;

        while (v < costVer.length && h < costHor.length) {
            if (costVer[v] >= costHor[h]) {//vertical cut
                cost += (costVer[v] * hp);
                vp++;
                v++;
            } else {  // horizontal cut
                cost += (costHor[h] * vp);
                hp++;
                h++;
            }
        }

        while (h < costHor.length) {
            cost += (costHor[h] * vp);
            hp++;
            h++;
        }
         while (v < costVer.length) {
            cost += (costVer[v] * hp);
            vp++;
            v++;
        }

        System.out.println("Minimum  cuts cost is :  " + cost);
    }
}
