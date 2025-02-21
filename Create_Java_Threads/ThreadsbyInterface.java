// This java program creates threads through interface, called Runnable.

class Worker implements Runnable{

 private String task;
 
 //constructor
 public Worker(String t){
 task = t;
 } 
 
 // use run() method
 public void run(){
 // run a for loop
 for(int i = 0; i < 6; i++){
 System.out.println("task " + task + " is running " + i);
 }
 }

} // end of class
public class ThreadsbyInterface {

    public static void main(String[] args) {
       Worker tsk1 = new Worker("'file uploading'");
       Worker tsk2= new Worker("'email sending'");
       Worker tsk3 = new Worker("'data processing'");
       Worker tsk4 = new Worker("'document searching'");
       
       Thread t1 = new Thread(tsk1);
       Thread t2 = new Thread(tsk2);
       Thread t3 = new Thread(tsk3);
       Thread t4 = new Thread(tsk4);
       
       t1.start();
       t2.start();
       t3.start();
       t4.start();
    }
    
}
