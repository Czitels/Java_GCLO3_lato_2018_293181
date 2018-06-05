/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrency;

/**
 *
 * @author bitel
 */
public class MyTask implements Task{
    
    public String taskName;
    public boolean isWork;

    
    MyTask(String name) {
        taskName = name;
        isWork = true;
    }
    
    @Override
    public void run(int TaskNumber) throws InterruptedException {
        for(int i = 10; i > 0; i--) {
            System.out.println("> Task " + taskName + " is writing: " + i);
            Thread t1 = new Thread();
            t1.sleep(1000);
            while (!isWork) {
                try { 
                    t1.join();
                }
                catch(InterruptedException ex){ 
                    Thread.currentThread().interrupt();
                }
            }
        }
    }    
}
