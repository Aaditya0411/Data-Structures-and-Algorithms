package Hashing;

import java.util.HashMap;

public class HashMapDemo  {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        
        //Insert - O(1)
        hm.put("India" , 100) ;
        hm.put("China" , 150) ;
        hm.put("US" , 50) ;

        //Get - O(1)
        System.out.println(hm.get("India"));
        System.out.println(hm.get("Inodnesia"));

        //Containskey-O(1) True or False
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Inodoia"));
        
        //Remove 
        System.out.println(hm.remove("India"));

        //Size 
        System.out.println(hm.size());

        //IsEmpty
        System.out.println(hm.isEmpty());

        //FOR CLEAR
        hm.clear();
        

        System.out.println(hm);
    }
}
