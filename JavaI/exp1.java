package JavaI;

import java.io.File;

public class exp1 {

    public static void main(String[] args){

        //get a list of all file/directory names in the given directory
        File file = new File ("C:\\Users\\olfaa\\OneDrive\\Bureau\\Test");
        String[] fileList = file.list();
        for(String name: fileList){
            System.out.println(name);
        }

    }
    
}
