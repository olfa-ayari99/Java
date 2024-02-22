package Regular_Expressions;

import java.io.Console;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class patternSyntaxExcep {

    public static void main(String[] args){
        Pattern pattern = null;
        Matcher matcher = null;

        Console console = System.console();
        if(console==null){
            System.err.println("no Console.");
            System.exit(1);
        }
        while (true) {
            try {
                pattern= Pattern.compile(console.readLine("%nEnter your regex: "));
                matcher = pattern.matcher(console.readLine("Enter input string to search: "));
         
            } catch (PatternSyntaxException pse) {
                console.format("There is a problem" + " with the regular expression!%n");
                console.format("The pattern in question is: %s%n", pse.getPattern());
                console.format("The description is: %s%n",  pse.getDescription());
                console.format("The message is: %s%n",  pse.getMessage());
                console.format("The index is: %s%n",  pse.getIndex());
                System.exit(0);
            }
            boolean found = false;
            while (matcher.find()) {
                console.format("I found the text" + " \"%s\" starting at " + "index %d and ending at index %d.%n", 
                matcher.group(),
                matcher.start(),
                matcher.end());
                found = true; 
            }
            if(!found){
                console.format("no match found.%n");
            }
            
        }
        

        
    }
    
}
