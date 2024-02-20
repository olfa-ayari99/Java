package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class avg {

    public static void main (String[] args){

        //Calculate the average of a lsit of integers
        
        List<Integer> ints = Arrays.asList(1, 3, 6, 8, 10, 18, 36);  
       double averageInt = ints.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
       System.out.println("Average " + averageInt);

        // convert a list of strings to uppercase or lowercase

        List<String> strings = Arrays.asList("OLFA", "LALA", "MAMA");
        List<String> convStrings= strings.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println("LowerCase List: " + convStrings);

        //Sum of Evens and odd numbers

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,12,14);
        
        int sumEven = numbers.stream().filter(num -> (num % 2 == 0)).mapToInt(Integer::intValue).sum();
        System.out.println("sum of evens: "+ sumEven);

        int sumOdd = numbers.stream().filter(n -> !(n % 2 == 0 )).mapToInt(Integer::intValue).sum();
        System.out.println("sum of Odd : "+ sumOdd);

        //remove all duplicate elements

        List<Integer> l = Arrays.asList(10, 23, 22, 23, 24, 24, 33, 15, 26, 15);
        System.out.println("c'est la liste l: "+ l);

        List<Integer> d = l.stream().distinct().collect(Collectors.toList());
        System.out.println("nouvelle liste "+d );


        //count the number of strings in a list that start with a specific letter

        List<String> str = Arrays.asList("olfa", "ola", "op","lala","mm");
        char lettre = 'o';
        long numero = str.stream().filter(s -> s.startsWith(String.valueOf(lettre))).count();
        System.out.println("nombre des mots qui commence avec o: "+ numero);

        // sort a list of strings in alphabetical order, ascending and descending

        List<String> liste =  Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
        List<String> ascendingList = liste.stream().sorted().collect(Collectors.toList());
        System.out.println("ascending order: " + ascendingList);

        List<String> descendingList = liste.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.print("descending order: "+ descendingList);


        //find the maximum and minimum values in a list of integers
        List<Integer> i = Arrays.asList(1, 17, 54, 14, 14, 33, 45, -11);
        Integer max = i.stream().max(Integer::compare).orElse(null);
        System.out.println("max: " +max);
        Integer min = i.stream().min(Integer::compare).orElse(null);
        System.out.println("min: " + +min);


        //find the second smallest and largest elements in a list of integers
        Integer secMax = i.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
        System.out.println("second largest : " + secMax);
        Integer secMin = i.stream().distinct().sorted().skip(1).findFirst().orElse(null);
        System.out.println("second smallest: " + secMin);

        







    }
    
}
