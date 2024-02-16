package PatternMatching;

public class exemple2 {
    public static void main(String[] args){
        String name = "Olfa";

        // checks if name is instance of String
        boolean result1 = name instanceOf String;
        System.out.println("name is an instance of String: "+ result1);

        exemple2 ex = new exemple2();
        
        // checks if obj is an instance of exemple2
        boolean result2 = ex instanceOf exemple2;
        System.out.println("obj is an instance of exemple2 "+ result2);
    }   
    
}
