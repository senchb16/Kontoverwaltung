/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.schennach_kontoverwaltung;



import java.util.Random;


/**
 *
 * @author Christoph
 */
public class KontoBenutzer implements Runnable {

    private final String name;
    private final Konto konto;
    private final KontoGUI gui;

    public KontoBenutzer(String name, Konto konto, KontoGUI gui) {
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
            int value = rand.nextInt(49 - 10 + 1) + 10;

            if (rand.nextBoolean()) {

                int balance = konto.withdraw(value);
                this.gui.updateWithdrawed(balance, value, name);

            } else {

                int balance = konto.deposit(value);
                this.gui.updateDeposited(balance, value, name);

            }

        }
    }

}
