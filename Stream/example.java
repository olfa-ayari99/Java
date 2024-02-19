package Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class example {

    public static void main (String [] args){

        //Average of squares of an int array
        Arrays.stream(new int[] {2,4,6,8,10})
        .map(x -> x * x)
        .average()
        .ifPresent(System.out::println);
        
        //reduction - sum

        double total= Stream.of(7.3,1.5,4.8).reduce(0.0, (Double a, Double b)-> a+b);
        System.out.println("Total= "+ total);





    }
    
}
