package Lambdas;

import java.util.function.Predicate;

public class exp2Impl {

    public static void main(String [] args){
        Predicate isEmptyString = t -> ((String) t).isEmpty();

        String test1 = ""; 
        String test2 = "olfa";

        System.out.println(test2);
        System.out.println("Not Empty   "+ isEmptyString.test(test2));
        System.out.println(test1);
        System.out.println("String empty    "+ isEmptyString.test(test1));
        
    
    
}
}
