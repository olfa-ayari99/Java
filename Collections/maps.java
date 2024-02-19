package Collections;

import java.util.HashMap;
import java.util.Map;

public class maps {

    public static void main (String[] args){
    Map<Integer,String> map = 
    Map.of(
        1,"one",
        2,"two",
        3,"three"
    );

    Map.Entry<Integer,String> e1 =Map.entry(1,"one");
    Map.Entry<Integer,String> e2 =Map.entry(2,"two");
    Map.Entry<Integer,String> e3 =Map.entry(3,"three");


    Map<Integer,String> m =Map.ofEntries(e1,e2,e3);

    Map<String, Integer> mapp= new HashMap<>();

    mapp.put("one", 1);
    mapp.put("two",null);
    mapp.put("three",3 );
    mapp.put("four",null);
    mapp.put("five",5);

    for(int value: mapp.values()){
        System.out.println("value= "+value);
    }




    
}
}
