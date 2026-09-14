package Hashing;

import java.util.HashMap;
import java.util.Set;

public class IterationHashMap {
    public static void main(String[] args) {
        
        HashMap<String , Integer> hm = new HashMap<>();
        hm.put("India" , 100) ;
        hm.put("China" , 150) ;
        hm.put("US" , 50) ;
        hm.put("Indonesia" , 250) ;
        hm.put("Nepal" , 350) ;

        //Iterate

        Set<String> key = hm.keySet();
        System.out.println(key);
        
        for (String k : key) {
            System.out.println("Key= " + k + ", " + "value= " + hm.get(k) );
        }

    }
}
