/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package semestralka;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Milan
 */
public class OperationStart implements ActionListener {
    
    
   @Override
   public void actionPerformed(ActionEvent o) {
        Button b = (Button) o.getSource();
        WWindow w  = (WWindow) b.getParent().getParent().getParent().getParent();   
        RulletWindow r = new RulletWindow ();  
        int players,credit;
        players = (int) Double.parseDouble(w.list.getSelectedItem());
        credit = (int) Double.parseDouble(w.field.getText());
        
        switch (b.getText()) {
            case"NEW GAME":
                        if(credit>0){
                             w.setVisible(false);
                             r.setVisible(true); 
                        } else { 
                        }
                        System.out.println(players);
                        System.out.println(credit);
                break;
            case"LOAD GAME":
                break;
        }
        
            }
}
