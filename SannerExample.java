import java.util.Scanner;
import java.util.regex.MatchResult;

public class SannerExample {

    public static void main(String...args){
        String wordsAndNumbers = """
                Logging rusted furnace
                daybreak 17 beign
                9 homecoming 1
                freight car
                    
                    """;
        try(Scanner scanner = new Scanner(wordsAndNumbers)){
            scanner.findAll("benign").map(MatchResult::group).forEach(System.out::println);
        }
    }
    
}

// the Scanner and MtchResult classes can be executed with the java launcher
