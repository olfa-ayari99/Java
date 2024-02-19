package Collections;

import java.security.Key;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class exp {

    public static void main(String[] args){
        Key one = new Key("1");
        Key two = new Key("2");

        Map<Key, String> map =  new HashMap<>();
        map.put(one,"one");
        map.put(two,"two");

        System.out.println("map.get(one)= "+map.get(one));
        System.out.println("map.get(two)= "+map.get(two));
        
        



    }
    
}
