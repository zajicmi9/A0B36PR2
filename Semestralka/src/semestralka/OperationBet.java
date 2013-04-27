/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package semestralka;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Milan
 */
public class OperationBet implements ActionListener {
    
    
   @Override
   public void actionPerformed(ActionEvent o) {
       
       JButton b = (JButton) o.getSource();
       RulletWindow r = (RulletWindow) b.getParent().getParent().getParent().getParent();
       r.bet.setText(Integer.toString(Integer.parseInt(b.getName())+Integer.parseInt(r.bet.getText())));
         
    
}
}