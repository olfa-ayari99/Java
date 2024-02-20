package JavaI.O_API;
import java.io.*;



public class file {
    public static void main(String[] args){
    try{
        //write a new file

   /** BufferedWriter bw = new BufferedWriter(
        new FileWriter("C:\\Users\\olfaa\\OneDrive\\Bureau\\Test\\\\output.txt"));   // write the path where you want the file to go and give a name to the file
    bw.write("olfa\n");
    bw.write("lala\n");
    bw.write("ppp\n");
    bw.close();*/

        //copy the text from one file to another
        BufferedWriter bw = new BufferedWriter(
            new FileWriter("C:\\Users\\olfaa\\OneDrive\\Bureau\\Test\\output-copy.txt"));

        //read a file
    BufferedReader br =new BufferedReader(
        new FileReader("C:\\Users\\olfaa\\OneDrive\\Bureau\\Test\\output.txt"));
    String  s;
    while ((s= br.readLine())!=null) {
        //System.out.println(s); 
        bw.write(s+"\n");
    }
    br.close();
    bw.close();
    }catch(Exception ex){
            return;
        }
     }
    }
