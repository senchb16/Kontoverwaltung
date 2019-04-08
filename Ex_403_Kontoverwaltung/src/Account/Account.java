/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

/**
 *
 * @author Christoph
 */
public class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }
    
    public void withdraw(int value){
        this.balance-=value;
    }
    
    public void deposit(int value){
        this.balance+=value;
    }
    
    public int getBalance(){
        return balance;
    }
    
    
}
