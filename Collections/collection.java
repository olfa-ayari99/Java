package Collections;

import java.util.ArrayList;
import java.util.Collection;

public class collection {
    public static void main(String[] args){
        

    Collection<String> strings = new ArrayList<>();
    strings.add("one");
    strings.add("two");
    System.out.println("strings = "+ strings);
    //strings.remove("one");
    //System.out.println("strings = " + strings);

    if(strings.contains("one")){
        System.out.println("one is here");
    }

    if (!strings.isEmpty()){
        System.out.println("indeed strings is not empty!");
    }
    System.out.println("the number of elements is strings is "+ strings.size());
    //size(): Returns the number of elements in a collection, as an int.

    //Then you can delete the content of a collection by simply calling clear() on it.

    strings.clear();
    System.out.println("the number of elements is strings is "+ strings.size());
    
    
    }


    
}
