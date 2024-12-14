// this program illustrates how we can write into a file using java. if the file exists, it will write into it and
// if it doesn't exist, then Java will create the text file and write on it. 
import java.io.*;
public class FileWrite {

    public static void main(String args[]) {
        
        FileWriter fwriter = null;
        PrintWriter pwriter = null;
      try{
          fwriter = new FileWriter("rosefacts.txt");
          pwriter = new PrintWriter(fwriter);
          
          String S1 = "Some facts about Roses:";
          String S2 = "\033[1mRoses Have Been Around For Over 35 Million Years.\033[0m \nFossil evidence shows that roses have been present on Earth for over 35 million years. \nThis ancient lineage indicates that roses have successfully evolved and adapted to a variety of climates and landscapes. \nTheir resilience through time highlights their deep-rooted place in nature’s history.";
          
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
