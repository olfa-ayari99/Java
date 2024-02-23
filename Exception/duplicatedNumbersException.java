package Exception;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class duplicatedNumbersException {


    //reads a list of integers from the user and throws an exception if any numbers are duplicates.
    public static void main(String[] args){

        try{
            List<Integer> numbers = readNumberFromUser();
            checkDuplicates(numbers);
            System.out.println("No duplicate numbers!");
        }catch(Duplicate_Number_Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        

       
    }

    public static List<Integer> readNumberFromUser(){
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner= new Scanner(System.in);
        
        System.out.println("How many numbers you want to input? ");
        int count = scanner.nextInt();

        System.out.println("Input the integers");
        for(int i=0; i < count; i++){
            int num =scanner.nextInt();
            numbers.add(num);
        }

        scanner.close();
        return numbers;   
    }

    public static void checkDuplicates(List <Integer> numbers) throws Duplicate_Number_Exception{

        Set<Integer> uniqueNumbers = new HashSet<>();

        for(int num:numbers){
            if(uniqueNumbers.contains(num)){
                throw new Duplicate_Number_Exception("Duplicate number found: "+ num);

            }
            uniqueNumbers.add(num);
        }
        
    }
    
}

class Duplicate_Number_Exception extends Exception {
    public Duplicate_Number_Exception(String message) {
      super(message);
    }
  }
