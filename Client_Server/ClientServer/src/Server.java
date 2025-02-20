import java.net.*;
import java.io.*;
public class Server {

    public static void main(String args[]) {
      
        try{
        
            ServerSocket ss = new ServerSocket(2222);
            System.out.println("THE SERVER SOCKET HAS BEEN CREATED..");
            
            while(true){
            // server socket will be waiting for a connection, using accept method
            Socket s = ss.accept();
            
            // get Input output streams
            InputStream is = s.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader bfr = new BufferedReader(isr);
                    
                    
            OutputStream os =s.getOutputStream();
            PrintWriter pw = new PrintWriter(os, true);
            
            // send and receive messages
            
            String msg = bfr.readLine();
            
            String message = "Message sent by the client is: " + msg;
            
            
            pw.println(message);
            
            
            s.close();
            }// end of while
        
        
        }
        catch(Exception e){
        e.printStackTrace();}
    }
}
