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
public interface Task{

    public void run(int TaskNumber) throws InterruptedException;
}
