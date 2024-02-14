package src.oopsadv.ThrowsException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab151 {
    public static void main(String[] args) throws  Exception {
         readFile("C://a.txt");
    }

    static void readFile(String filename) throws Exception {
      File f=new File(filename);
      FileReader f1=new FileReader(filename);
      if(filename.length()==0)
      {
          throw new FileNotFoundException();
      }
    }

}