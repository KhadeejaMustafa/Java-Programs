
class Worker extends Thread{
private String task;
 
 //constructor
 public Worker(String t){
 task = t;
 } 
 
 // override run() method
 @Override
 public void run(){
 // run a for loop
 for(int i = 0; i < 6; i++){
 System.out.println("task for " + task + " is running " + i);
 }
 }

}
public class ThreadsbyInheritance {

    public static void main(String[] args) {
       Worker tsk1 = new Worker("file searching");
       Worker tsk2= new Worker("file uploading");
       Worker tsk3 = new Worker("file sending");
       Worker tsk4 = new Worker("file processing");
       
   
       
       tsk1.start();
       tsk2.start();
       tsk3.start();
       tsk4.start();
    }
}
