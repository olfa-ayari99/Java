package Lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class newExp {

   public static void main(String[] args){
        sumInterface SumCalculator=(x,y) -> x + y;
        int r = SumCalculator.sum(2,3);

        System.out.println(r);

   }

   
}
