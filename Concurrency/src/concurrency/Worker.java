/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrency;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author bitel
 */
public class Worker{
    public MyTask[] allTasks = new MyTask[15];
    public String[] taskNameTab = new String[15];
    public int Counter=0;
    public int Counter2=0;
    public MyWorkerListener myListener;
    public boolean checker = false; // sprawdza czy aktywny
    public int threadAmmount;
    String workerName;
    ExecutorService executor;

    
    Worker(String name, int ammount)
    {
        workerName=name;
        threadAmmount=ammount;
        this.executor=new ThreadPoolExecutor(threadAmmount, threadAmmount, 0L, 
                                            TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(15), new YourThreadFactory());
    }
    public void enqueueTask(MyTask task, String taskName){
        allTasks[Counter] = task;
        taskNameTab[Counter] = taskName;
        
        if(checker == true) {
            Runnable task1 = new MyThread(allTasks[Counter], Counter);
            executor.execute(task1);
        }
        Counter++;
    }
    public void start(){
                if(checker == false) {
            checker = true;
            if(allTasks[0].isWork == false) {
                for(int i = 0; i < Counter; i++) {  //musze ustawic TRUE aby taski zadzialaly
                    allTasks[i].isWork = true;
                }
            }         
            //myListener.onWorkedStarted();
            for (; Counter2 < Counter; Counter2++) {
                Runnable task = new MyThread(allTasks[Counter2], Counter2);
                executor.execute(task);
              }          
        }
        else System.out.println(workerName + " ALREADY RUNNING!!");
    }
    public void stop(){
        for(int i = 0; i<Counter; i++) { 
            allTasks[i].isWork = false;
        }
        checker = false;
//        myListener.onWorkedStoped();    
    }
    public void setListener(){
        myListener=new MyWorkerListener();
    }
    public boolean isStarted(){return true;}
    public boolean isWorking() {return true;}

    void sleep(int i) {
        try { 
            Thread.sleep(i);
        }
        catch(InterruptedException ex){ 
            Thread.currentThread().interrupt();
        }
    }

    
    class YourThreadFactory implements ThreadFactory {
        private final AtomicInteger counter = new AtomicInteger(1);

        public YourThreadFactory() {
        }

        @Override
        public Thread newThread(Runnable r) {
            return new Thread(r, "Worker" + workerName + "Thread[" + counter.getAndIncrement() + "]");   
        }
    }
    
    
}
