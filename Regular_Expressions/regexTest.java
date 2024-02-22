package Regular_Expressions;

import java.io.Console;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexTest {

    public static void main(String[] args){
        Console console = System.console(); // l'objet console fournit des méthodes pour intéragir avec la console d'entrée,sortie du systeme pour lire et écrire des données depuis et vers la console
        if (console == null) {
            System.err.println("No console.");
            System.exit(1);
        }
        while (true) {

            Pattern pattern = 
            Pattern.compile(console.readLine("%nEnter your regex: "), Pattern.CASE_INSENSITIVE); //Pattern: is a compiled representation of a regular expression

            Matcher matcher = 
            pattern.matcher(console.readLine("Enter input string to search: ")); //Matcher: is the engine that interprets the pattern and performs match operations against an input string

            boolean found = false;
             // le prog recherche des correspondances entre l'expression régulière et la chaine de caract
            while (matcher.find()) {
                console.format("I found the text" +
                    " \"%s\" starting at " +
                    "index %d and ending at index %d.%n",
                    matcher.group(),
                    matcher.start(),
                    matcher.end());
                found = true;
            }
            if(!found){
                console.format("No match found.%n");
            }
        }    
    }
    
}
