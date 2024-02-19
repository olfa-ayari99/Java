package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class reduce {

    public static void main(String[] args){
       // List<Integer> ints = List.of(3, 6, 2, 1);
    /**BinaryOperator<Integer> sum = (a, b) -> a + b;
    int identity = 0;

    int result = identity;
    for (int i: ints) {
    result = sum.apply(result, i);  
}

    System.out.println("sum = " + result);*/





    Stream<Integer> ints = Stream.of(0,0,0,0);

    int sum = ints.reduce(10,(a,b) -> a+b);
    System.out.println("sum= "+sum);


    List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
    int res = numbers
    .stream()
    .reduce(0,(subtotal,element)-> subtotal+ element);
    assertThat(res).isEqualTo(21);





    }
    
}
