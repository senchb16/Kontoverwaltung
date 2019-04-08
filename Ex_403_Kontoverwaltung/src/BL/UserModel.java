/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import java.util.ArrayList;
import javax.swing.AbstractListModel;

/**
 *
 * @author Christoph
 */
public class UserModel extends AbstractListModel {
    
    private ArrayList<KontoBenutzer> user = new ArrayList<>();
    @Override
    public int getSize() {
        return user.size();
    }

    @Override
    public Object getElementAt(int i) {
        return user.get(i);
    }
    
    public void add(KontoBenutzer u){
        user.add(u);
        fireIntervalAdded(this,user.size()-1,user.size()-1);
    }
    
}
