/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.schennach_kontoverwaltung;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Christoph
 */
public class Konto {
    private int balance;
    
    
    public Konto(int balance) {
        this.balance = balance;
        
    }
    
    public synchronized int withdraw(int value){
        while(value > balance){
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Konto.class.getName()).log(Level.SEVERE, null, ex);
            }
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
