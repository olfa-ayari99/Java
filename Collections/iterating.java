package Collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class iterating {

    public static void main(String[] args){
        //The iterator() method is defined on the Iterable interface, extended by the Collection interface,
        Collection<String> strings = List.of("one", "two","three","four");
        for(Iterator<String> iterator = strings.iterator(); iterator.hasNext();){
            String element =iterator.next();
            if(element.length() ==3)  // si l'element a 3 caracteres 
             {
                System.out.println(element);
            }
        }


        Collection <String> str = Arrays.asList("one", "two","three");

        List<String> list = List.copyOf(str);
        Set<String> set =Set.copyOf(str);


        //Changing the Order of the Elements of a List

        List<String> l = Arrays.asList("0", "1", "2", "3", "4");
        System.out.println(l);
        int formIndex = 1;
        int toIndex=4;

        Collections.rotate(l.subList(formIndex, toIndex),-1);
        
        System.out.println(l);

        








        
    }
    
}
