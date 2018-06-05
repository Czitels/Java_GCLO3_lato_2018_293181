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
public class Concurrency {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Worker MyWorker = new Worker("BRO", 3);
       
        MyTask task1 = new MyTask("nr1");
        MyTask task2 = new MyTask("nr2");
        MyTask task3 = new MyTask("nr3");
        MyTask task4 = new MyTask("nr4");
        MyTask task5 = new MyTask("nr5");
        
        MyWorker.enqueueTask(task1, "nr1");
        MyWorker.enqueueTask(task2, "nr2");
        MyWorker.enqueueTask(task3, "nr3");
        MyWorker.enqueueTask(task4, "nr4");
        MyWorker.enqueueTask(task5, "nr5");
        MyWorker.start();
       
        MyTask task6 = new MyTask("nr6");
        MyTask task7 = new MyTask("nr7");
        MyTask task8 = new MyTask("nr8");
        MyTask task9 = new MyTask("nr9");
        MyTask task10 = new MyTask("nr10");
        
        MyWorker.enqueueTask(task6, "nr6");
        MyWorker.enqueueTask(task7, "nr7");
        MyWorker.enqueueTask(task8, "nr8");
        MyWorker.enqueueTask(task9, "nr9");
        MyWorker.enqueueTask(task10, "nr10");
        
        MyWorker.sleep(15000);
        MyWorker.stop();
        
        
        
    }
    
    }