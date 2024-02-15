package Lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class newExp {

    List<String> names = Arrays.asList("olfa", "bob", "alice");

    Collections.sort (names , new Comparator<String>() {

        @Override
        
        public int compare(String s1, String s2) {
            return s1.compareTo(s2);
        }
    });
}
