// this program illustrates how we can write into a file using java. if the file exists, it will write into it and
// if it doesn't exist, then Java will create the text file and write on it. 
import java.io.*;
public class FileWrite {

    public static void main(String args[]) {
        
        FileWriter fwriter = null;
        PrintWriter pwriter = null;
      try{
          fwriter = new FileWriter("story.txt");
          pwriter = new PrintWriter(fwriter);
          
          String S1 = "";
          String S2 = "";
          
          pwriter.println(S1);
          pwriter.println(S2);
          
          System.out.print("Successful writing!");
          pwriter.close();
          fwriter.close();
          
    }
      catch(IOException e){
          e.printStackTrace();
      }}
}
