package Regular_Expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class matcherDemo {

    // on veut rechercher des occurrences du mot "dog" 

    private static final String REGEX= "\\bdog\\b";  // '\b' est un métacaractère qui représente une frontière de mot.
    private static final String INPUT ="dog dog dog doggie dogg"; 
    public static void main (String[] args){
        Pattern p= Pattern.compile(REGEX);

        Matcher m = p.matcher(INPUT);
        int count =0;
        while (m.find()) {
            count++;
            System.out.println("Match number " + count); //pour afficher le numéro de l'occ actuelle
            System.out.println("start(): "+ m.start()); //pour afficher l'index debut occ
            System.out.println("end(): "+ m.end()); // pour afficher l'index fin occ
            
        }

    }
    
}
