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
        
        int credit, players;
        
        credit = (int) Double.parseDouble(w.field.getText());
        
        players = (int) Double.parseDouble(w.list.getSelectedItem());
        
        switch (b.getText()) {
            case"NEW GAME":
                        if(credit>0){
                             w.setVisible(false);
                             r.setVisible(true);
                        } else{ 
                            w.fail.setText("BAD CREDITS");
                        }
                        System.out.println();
                        System.out.println((int) Double.parseDouble(w.field.getText()));
                break;
            case"LOAD GAME":
                break;
        }
        
            switch(players){
                case 1:
                    r.p1.setText(Integer.toString(credit));
                    r.pl1.setText(w.p1.getText());
                    r.p2.setVisible(false);
                    r.pl2.setVisible(false);
                    r.p3.setVisible(false);
                    r.pl3.setVisible(false);
                    r.p4.setVisible(false);
                    r.pl4.setVisible(false);
                case 2:
                    r.p1.setText(Integer.toString(credit));
                    r.p2.setText(Integer.toString(credit));
                    r.pl1.setText(w.p1.getText());
                    r.pl2.setText(w.p2.getText());
                    r.p3.setVisible(false);
                    r.pl3.setVisible(false);
                    r.p4.setVisible(false);
                    r.pl4.setVisible(false);
                    
                case 3:
                    r.p1.setText(Integer.toString(credit));
                    r.p2.setText(Integer.toString(credit));
                    r.p3.setText(Integer.toString(credit));
                    r.pl1.setText(w.p1.getText());
                    r.pl2.setText(w.p2.getText());
                    r.pl3.setText(w.p3.getText());
                    r.p4.setVisible(false);
                    r.pl4.setVisible(false);
                case 4:
                    r.p1.setText(Integer.toString(credit));
                    r.p2.setText(Integer.toString(credit));
                    r.p3.setText(Integer.toString(credit));
                    r.p4.setText(Integer.toString(credit));
                    r.pl1.setText(w.p1.getText());
                    r.pl2.setText(w.p2.getText());
                    r.pl3.setText(w.p3.getText());
                    r.pl4.setText(w.p4.getText());
                    
                    
            }
               
        
        
        
            
            String a = w.p1.getText();
            String e = w.p2.getText();
            String c = w.p3.getText();
            String d = w.p4.getText();
            System.out.println(a+e+c+d);
            

        
            }
}
