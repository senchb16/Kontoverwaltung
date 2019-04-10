/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;
import Account.Konto;
import GUI.KontoGUI;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Christoph
 */
public class KontoBenutzer implements Runnable {
    private final String name;
    private final Konto konto;
    private final KontoGUI gui;
    public KontoBenutzer(String name, Konto konto,KontoGUI gui) {
        this.name = name;
        this.konto = konto;
        this.gui = gui;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void run() {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(KontoBenutzer.class.getName()).log(Level.SEVERE, null, ex);
            }
            int value = rand.nextInt(49-10+1)+10;
            if(rand.nextBoolean()){
                try {
                  
                    int balance= konto.withdraw(value,name);
                    this.gui.updateWithdrawed(balance,value,name);
               
                } catch (InterruptedException ex) {
                    Logger.getLogger(KontoBenutzer.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
                else{
                  
                    int balance= konto.deposit(value,name);
                    this.gui.updateDeposited(balance,value,name);
                
                }
            
            
        }
    }

   
    
}
