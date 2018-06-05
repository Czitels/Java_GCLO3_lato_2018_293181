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
public class MyWorkerListener implements WorkerListener{

    @Override
    public void onWorkedStarted() {
        System.out.println("WORKER STARTED !!!");
    }

    @Override
    public void onWorkedStoped() {
        System.out.println("WORKER STOPPED !!!");
    }

    @Override
    public void onTaskStarted(int taskNumber) {
        System.out.println(Thread.currentThread().getName() + " doing Task [" + taskNumber + "] STARTED!!!");
    }

    @Override
    public void onTaskCompleted(int taskNumber) {
        System.out.println(Thread.currentThread().getName() + " doing Task [" + taskNumber + "] FINISHED!!!");
    }
    
}
