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
public interface WorkerListener {
    public void onWorkedStarted();
    public void onWorkedStoped();
    public void onTaskStarted(int taskNumber);
    public void onTaskCompleted(int taskNumber);
}
