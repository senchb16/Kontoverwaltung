/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author Christoph
 */
public class Konto {
    private int balance;
    private JLabel balanceLabel;
    private JTextArea logOutput;
    
    public Konto(int balance, JLabel balanceLabel,JTextArea logOutput) {
        this.balance = balance;
        this.balanceLabel = balanceLabel;
        this.logOutput = logOutput;
    }
    
    public synchronized int withdraw(int value, String name)throws InterruptedException{
        while(value > balance){
            wait();
        }
        this.balance-=value;
        return balance;
    }
    
    public synchronized int deposit(int value, String name){
        this.balance+=value;
        return balance;
        
    }
    
    public int getBalance(){
        return balance;
    }
    
    
}
