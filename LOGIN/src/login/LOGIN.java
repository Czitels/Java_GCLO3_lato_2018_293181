/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import javax.swing.JFrame;

/**
 *
 * @author bitel
 */
public class LOGIN extends JFrame{

    LOGIN()
    {
        setSize(300,200);
        setTitle("XDD");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LoginPanel MyFrame=new LoginPanel();
        MyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyFrame.setVisible(true);
        // TODO code application logic here
    }
    
}
