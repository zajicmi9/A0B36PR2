/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package semestralka;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author Milan
 */
public class Button  extends JButton {
        String text;

  
        public Button(String text,  int x,  int y,  int m, int n) {
        super();
        this.setBackground(Color.white);
        this.setBounds(x, y, m, n);
        this.setText(text);

        
    }
}