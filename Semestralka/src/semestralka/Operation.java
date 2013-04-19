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
public class Operation implements ActionListener {
    
    
   @Override
   public void actionPerformed(ActionEvent o) {
    Button b = (Button) o.getSource();
        WWindow w  = (WWindow) b.getParent().getParent().getParent().getParent();
        int players,credit;
        w.setVisible(false);
        players = (int) Double.parseDouble(w.list.getSelectedItem());
        credit = (int) Double.parseDouble(w.pole.getText());
        System.out.println(players);
        System.out.println(credit);

            }
}
