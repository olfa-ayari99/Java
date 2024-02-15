package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class firstLambda {

    public static void main(String[] args){

        List<String> strings = Arrays.asList("one", "two", "three");

        strings.forEach(t-> System.out.println(t));
        //strings.forEach((String t)-> System.out.println(t));
         Predicate<String> predicate = s ->s.length() ==3;

        Runnable runnable = () -> System.out.println("I am running");


    }
    
}
