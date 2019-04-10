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
    
    
    public Konto(int balance) {
        this.balance = balance;
        
    }
    
    public synchronized int withdraw(int value)throws InterruptedException{
        while(value > balance){
            wait();
        }
        this.balance-=value;
        return balance;
    }
    
    public synchronized int deposit(int value){
        this.balance+=value;
        return balance;
        
    }
    
    public int getBalance(){
        return balance;
    }
    
    
}
