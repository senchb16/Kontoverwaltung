/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

/**
 *
 * @author Christoph
 */
public class KontoBenutzer {
    private String name;

    public KontoBenutzer(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
