package HashMap;

import java.util.*;

public class Hashing {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Insertion
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 130);

        System.out.println(map); // print map

        // map.put("China", 150);//keys are not duplicate, its updates with another
        // value

        // System.out.println(map); //print map

        // //Search

        // //check key or value present or not
        // if(map.containsKey("China")) { //true or false for key
        // System.out.println("key is present in the map!!");
        // }else{
        // System.out.println("key is not present in the map!!");
        // }

        // if(map.containsValue(150)){ //true or false fro value
        // System.out.println("Value is present!!");
        // }else{
        // System.out.println("Value is not present!!");
        // }

        // //fetch value using key

        // System.out.println(map.get("China"));;//existing key in map get result as
        // value
        // System.out.println(map.get("Pak"));//non-existing key in map get result as
        // null - becoz no such key is present in map so value is null

        // // Iteration in HashMap

        // int arr[] = { 12, 15, 18 };
        
        // for (int i = 0; i < arr.length; i++) { // Normal for loop
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();

        // for (int num : arr) { // Enhanced for loop
        //     System.out.print(num + " ");
        // }
        // System.out.println();

        //Iteration on HashMap  //using entrySet();
        // for(Map.Entry<String, Integer> e: map.entrySet()){
        //     System.out.println(e.getKey() + "->" + e.getValue());
        // }

        //Iteration on HashMap  //using keySet();
        // Set<String> keys = map.keySet();
        // for(String key: keys){
        //     System.out.println(key + " " + map.get(key));
        // }

        //To remove entire set using remove()
        // map.remove("China");
        // System.out.print(map);


    }

}
