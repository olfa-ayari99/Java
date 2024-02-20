package JavaI.O_API;

import static org.junit.Assert.assertThat;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;

public class pathTest {

    @Test  //path == file
    public void path_exists()throws Exception{
       Path path= Paths.get("C:\\Java Initiation\\Java\\JavaI\\windows\\licence.txt");

       assertThat(Files.exists(path)).isTrue();

        path= Paths.get("C:/Java Initiation/Java/JavaI/windows/licence.txt");

       assertThat(Files.exists(path)).isTrue();

       @Test
       public void can_read_path() throws Exception{
        Path path = Paths.get("C:/Java Initiation/Java/JavaI/windows/licence.txt"); // operating system independant!
        String fileContent = new String(Files.readAllBytes(path));
        assertThat(fileContent).isEqualTo("hello, this is our licence!");



       }
       


        

    }

    
}
