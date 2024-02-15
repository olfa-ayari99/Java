package Lambdas;

import java.util.Random;
import java.util.function.Supplier;

public class lmabdaSupplierImpl {
    
    
    //C'est l'implementation de l'interface Supplier
    //Supplier<String> supplier = ()->"Hello";

    Random random = new Random(314L);
    Supplier<Integer> newRandom = () -> random.nextInt(10);
    
    for (int i = 0;i < 5; i ++) {
        System.out.println(newRandom.get() + " ");
    }






    
}
