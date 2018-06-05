/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrency;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bitel
 */
public class MyThread implements Runnable {
    public MyTask task;
    int taskNumber;
    public MyWorkerListener nl = new MyWorkerListener();
    
    public MyThread(MyTask nt, int i){
        this.task = nt;
        this.taskNumber = i;
    }

    @Override
    public void run() {
        
        nl.onTaskStarted(taskNumber);
        try {        
            task.run(taskNumber);
        } catch (InterruptedException ex) {
            Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        nl.onTaskCompleted(taskNumber);
    }   
}
