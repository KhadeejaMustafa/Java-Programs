// client will open a dialog box and ask the user to enter any message, to send to the server. 
import java.net.*;
import java.io.*;
import javax.swing.*;
public class Client {

    public static void main(String args[]) {
        
        try{
            Socket s = new Socket("localhost", 2222);
            
            while(true){
             
             // input stream
            InputStream is = s.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader bfr = new BufferedReader(isr);
            
            // output stream
            OutputStream os =s.getOutputStream();
            PrintWriter pw = new PrintWriter(os, true);
            
            // get msg from the user:
            String msg = JOptionPane.showInputDialog("Please enter a message you would like to send to the server: ");
            
            // send the msg to the server
            pw.println(msg);
            
            // receive msg from the server
            msg = bfr.readLine();
            
            JOptionPane.showMessageDialog(null, msg);
            
            s.close();
            
            }// end of while
            
        }
         catch(Exception e){
        e.printStackTrace();}
    }
        
      
}
