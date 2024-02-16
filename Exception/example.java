package Exception;

import java.io.FileWriter;
import java.io.PrintWriter;

import javax.print.attribute.Size2DSyntax;

public class example {
    public void writeList(){
        PrintWriter out =null;

        try{
            System.out.println("Entering" + "try statement");

            out = new PrintWriter(new FileWriter("OutFile"));
            int SIZE;
            for(int i = 0; i< SIZE ; i++){
                out.println("Value at: " +i+"="+ list.get(i));

                
            }
        } catch(IndexOutOfBoundsException e){
            System.out.println("Caught IndexOutOfBoundsException" + e.getMessage());
        }
    }
    
}
